#20260309

# TIPO DE DATOS

#string
"letras"
nombres = "Joaquín" 
apellidos = "Martínez Rivers"

#integer
"números enteros"
edad = 19 

#float
"decimales"
precio = 10.5 

#boolean
"verdadero o falso"
isEstudiante = True  

print(f"Los nombres son : {nombres}, y los apellidos son: {apellidos}")

# VARIABLES

nombre_completo = nombres + " " + apellidos
print(nombre_completo)

nombre_edad = nombre_completo + ", la edad es: " + str(edad)
print (nombre_edad)

#EXPRESIONES

a = 85
b = 569

suma = a + b
resta = a - b
multiplicacion = a * b
division = a / b

print(f"los productos de los resultados son: suma: {suma}, resta: {resta}, multiplicación: {multiplicacion} y divsión: {division}")

# EXPRESIONES BOOLEANAS

" todos aquellos que devuelven True or False, <, >, <=, >=, ==, etc."
a = 5
b = 5
c = 6
d = 89


print(c>d)
print(a<=b)
print(a==b)

# CONDICIONALES IF / ELSE

e = 789
if (e >= 18):
    print("ES MAYOR DE EDAD")
else:
    print("ES MENOR DE EDAD")

f = 2
if (f > 6):
    print("NO ES RANGO SEGURO")
else:
    print("ES UN RANGO SEGURO")

# CONDICIONALES IF / ELIF / ELSE
"si hay más de una condición"
g = 65

if (g < 4):
    print ("MENOR DE EDAD")
elif (g < 13):
    print("Adolescente")
elif ( g < 21):
    print("Adulto joven")
elif (g < 60):
    print ("Adulto")
else:
    print ("Adulto Mayor")

# SOLICITAR INFORMACIÓN AL USUARIO

nota = int(input("Ingrese la nota a verificar (Por favor solo colocar números): "))
print (nota)

# CONVERTIR TODO A MINÚSCULAS

letra = input("Ingrese la letra que desea del abecedario: ")

print (letra.upper())
print (letra.lower())

# EJERCICIO 20260309

" entrada para un cine. niño  menores de 12, 25 quetzales; adulto 12-59, 50 quetzales; adulto mayor 60 para arriba, 30 quetzales "

edad = int(input("Ingrese la edad (Por favor solo colocar números): "))
print (edad)

if (edad<12):
    print ("Niño, pague Q. 20.00")
elif (edad<60):
    print ("Adulto, pague Q. 50.00")
else:
    print ("Adulto Mayor, pague Q. 30.00")


# EJERCICIO PARTE 2 20260309
letra = input ("ingrese letra por edad, a es niño, b es adulto, c es adulto mayor: ")


if (letra == "a"):
    print ("niño, pague 20")
elif (letra == "b"):
    print ("adulto, pague 50")
elif (letra == "c"):
    print ("adulto mayor, pague 30")
else:
    print ("ERROR")

