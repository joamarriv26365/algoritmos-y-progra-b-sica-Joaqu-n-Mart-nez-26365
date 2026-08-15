public class Usuario {
    private String nombre;
    private String usuario;
    private int edad;
    private Pelicula[] peliculas;

    public Usuario(int edad, String nombre, String usuario) {
        this.edad = edad;
        this.nombre = nombre;
        this.usuario = usuario;
        this.peliculas = new Pelicula[10];
    }


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public boolean agregarCalificacion(String nombreP, int calificacion){
        if (calificacion < 1 || calificacion > 10){
            return false;

        }
        for (int i = 0; i < peliculas.length; i++){
            if (peliculas[i] == null){
                peliculas[i] = new Pelicula (nombreP, calificacion);
                return true;
            }
        }

        return false;
        }

    public Pelicula obtenerNumero (int numero){
        int indice = numero -1;
        if (indice >= 0 && indice <peliculas.length){
            return peliculas[indice];

        }
        return null;

    }

    public boolean cambiarCalificacion (int numero, int nuevaCalificacion){
        if (nuevaCalificacion < 1 || nuevaCalificacion > 10){

            return false;


        }
        
        Pelicula puntos = obtenerNumero(numero);
        if (puntos != null){
            puntos.setCalificacion(nuevaCalificacion);
            return true;

        }
        return false;
    }

    public double calcularPromedio(){
        double suma = 0;
        int metidas = 0;

        for (Pelicula pelicula : peliculas){
            if (pelicula != null){
                suma += pelicula.getCalificacion();
                metidas++;

            }

    }

    if (metidas == 0 ) return 0.0;
    return suma / metidas;
    }

    public int mejorCalificacion (){
        int max = 0;
        for (Pelicula pelicula : peliculas){
            if (pelicula != null && pelicula.getCalificacion() > max){
                max = pelicula.getCalificacion();
            }
        }
        return max;
    }

    public int obtenerPeorCalificacion() {
        int min = 11;
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null && pelicula.getCalificacion() < min) {
                min = pelicula.getCalificacion();
            }
        }
        return (min == 11) ? 0 : min;
    }

    public int cantidadRegistradas() {
        int ocupados = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) ocupados++;
        }
        return ocupados;
    }





}

    




