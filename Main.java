import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("-----CREACIÓN DE USUARIO-----");
        System.out.println("Ingrese su nombre:");
        String nombre = input.nextLine();
        System.out.println("Ingrese su usuario desado: ");
        String usuario = input.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();


        Usuario newUser = new Usuario(edad, nombre, usuario);
        System.out.println("Usuario registrado exitosamente!");
        System.out.println("Bienvenido "+ usuario + "!");

        int opcion = 0;


        do {
            System.out.println("\n=== SISTEMA DE CALIFICACIONES DE PELÍCULAS ===");
            System.out.println("1. Nuevo usuario");
            System.out.println("2. Registrar nueva calificación");
            System.out.println("3. Consultar calificaciones");
            System.out.println("4. Consultar una película");
            System.out.println("5. Modificar calificación");
            System.out.println("6. Mostrar promedio");
            System.out.println("7. Mostrar mejor y peor calificación");
            System.out.println("8. Consultar espacios disponibles");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("-----CREACIÓN DE NUEVO USUARIO-----");
                    System.out.println("Ingrese su nombre:");
                    String nombreNuevo = input.nextLine();
                    System.out.println("Ingrese su usuario desado: ");
                    String usuarioNuevo = input.nextLine();
                    System.out.println("Ingrese su edad: ");
                    int edadNueva = input.nextInt();
                    input.nextLine();


                    newUser = new Usuario(edadNueva, nombreNuevo, usuarioNuevo);
                    System.out.println("Usuario nuevo registrado exitosamente!");
                    System.out.println("Bienvenido "+ usuarioNuevo + "!");
                    break;
                

                case 2:
                    System.out.println("Ingresa el nombre de la película: ");
                    String nombrePeli = input.nextLine();
                    System.out.println("Ingresa tu califiación del 1 al 10: ");
                    int nota = input.nextInt();
                    input.nextLine();
                    if (newUser.agregarCalificacion(nombrePeli, nota)) {
                        System.out.println("¡Película y calificación registradas exitosamente!");
                    } else {
                        System.out.println("Error: Calificación inválida (1-10) o no hay espacio disponible.");
                    }
                    break;
                case 3:
                    int totalRegistradas = newUser.cantidadRegistradas();
                    if (totalRegistradas == 0){
                        System.out.println("No ha registrado nada. ");

                    }
                    else {
                        System.out.println("Pelis en tu biblioteca: ");
                        for (int i = 1; i <= 10 ; i++){
                            Pelicula peli = newUser.obtenerNumero(i);
                            if (peli != null){
                                System.out.println(i + ". Película: " + peli.getNombreP() + "/ Calificación: "+ peli.getCalificacion());

                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingresa el número de película a consultar (1-10): ");
                    int numConsultar = input.nextInt();
                    input.nextLine();

                    Pelicula pConsultada = newUser.obtenerNumero(numConsultar);
                    if (pConsultada != null) {
                        System.out.println("Película #" + numConsultar + ": " + pConsultada.getNombreP() + "/ Calificación: " + pConsultada.getCalificacion());
                    } else {
                        System.out.println("Error: Número no válido.");
                    }
                    break;
                case 5: 
                    System.out.print("Ingresa el número de película a modificar: ");
                    int numModificar = input.nextInt();
                    System.out.print("Ingresa la nueva calificación (1-10): ");
                    int nuevaNota = input.nextInt();
                    input.nextLine();

                    if (newUser.cambiarCalificacion(numModificar, nuevaNota)) {
                        System.out.println("Calificación actualizada correctamente.");
                    } else {
                        System.out.println("Error al modificar. La posición está vacía o la nota no es válida.");
                    }
                    break;

                case 6: 
                    System.out.println("Promedio actual: " + newUser.calcularPromedio());
                    break;

                case 7: 
                    System.out.println("Mejor calificación: " + newUser.mejorCalificacion());
                    System.out.println("Peor calificación: " + newUser.obtenerPeorCalificacion());
                    break;

                case 8: 
                    int ocupados = newUser.cantidadRegistradas();
                    System.out.println("Películas calificadas: " + ocupados);
                    System.out.println("Espacios disponibles: " + (10 - ocupados));
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
                

            } while (opcion != 9); 

            input.close();

            }

    }
