#1
base = float(input("Ingrese la base del rectángulo: "))
altura = float(input("Ingrese la altura del rectángulo: "))
perimetro = 2 * (base + altura)
area = base * altura
print(f"El perímetro del rectángulo es {perimetro} y su área es {area}")

#2 
cateto1 = float(input("Ingrese el cateto del triángulo: "))
cateto2 = float(input("Ingrese el segundo cateto del triángulo: "))
hipotenusa = (cateto1**2 + cateto2**2)**1/2
print(f"La hipotenusa del triángulo es {hipotenusa}")

#3 
num1 = float(input("Ingrese el primer número: "))
num2 = float(input("Ingrese el segundo número: "))
suma = num1 + num2
resta = num1 - num2
division = num1 / num2
multiplicacion = num1 * num2
print((f"La suma es: {suma}, la resta es: {resta},la division es: {division} y la multiplicación es: {multiplicacion}"))

#4
farenheit = float(input("Ingrese el valor en grados Farenheit: "))
centigrados = (farenheit - 32) * 5 / 9
print(f"El valor en grados Centígrados es: {centigrados}")

#5 
#a) la variable no es representativa y está en mayúscula lo cual es mala práctica, la variable nombre no se ha definido y dentro del input no se puede escribir más de 1 argumento
nombre = input("¿Cuál es tu nombre? \n")
respuesta = input(f"{nombre}, ¿Cuál es tu canción favorita? \n")
print(f"A mi tambien me gusta \"{respuesta}\"")

#b) la variable peso no está pasada a tipo float
precio = float(input("Indique el precio: "))
total = precio + (precio*0.1)
print(f"El total es: {total}")

#c)el print no lleva comillas y la variable no está concatenada
edad = int(input("Indique su edad: "))
print(f"Tu edad es: {edad} años")

#d) está haciendo una asignación dentro del print
edad = int(input("Indique su edad: "))
print(f"Tienes 18 años" if edad == 18 else f"No tienes 18 años")

#6 
num1 = float(input("Indique el primer número: "))
num2 = float(input("Indique el segundo número: ")) 
num3 = float(input("Indique el tercer número: "))
media = (num1 + num2 + num3) / 3
print(f"La media de esos números es: {media}")

#7 
tiempo = int(input("Escriba la cantidad de minutos: "))
minutos = tiempo % 60
horas = tiempo // 60
print(f"{tiempo} minutos son {horas} horas y {minutos} minutoss")

#8
sueldo_base = float(input("Indique su sueldo base: "))
ventas = float(input("Indique el total de sus ventas: "))
comision = ventas * 0.1
sueldo_total = sueldo_base + comision
print(f"Su comisión será de {comision} y su sueldo total será {sueldo_total}")

#9
compra = float(input("Indique el total de su compra: "))
total = compra - (compra * 0.15)
print(f"El total de su compra será: {total}")

#10
parcial_1 = float(input("Indique su primera calificación parcial: "))
parcial_2 = float(input("Indique su segunda calificación parcial: "))
parcial_3 = float(input("Indique su tercera calificación parcial: "))
examen_final = float(input("Indique la nota de su exámen final: "))
trabajo_final = float(input("Indique su trabajo final: "))
calificacion_final = ((parcial_1 + parcial_2 + parcial_3)/3)* 0.55 + examen_final * 0.3 + trabajo_final * 0.15
print(f"Tu calificación final será {round(calificacion_final, 2)}")

#11
num_1 = float(input("Indique el número: "))
num_2 = float(input("Indique su segundo número: "))
distancia = (num_1 if num_1 >= 0 else num_1*-1) + (num_2 if num_2 >= 0 else num_2*-1)
print(f"la distancia entre los dos números es: {distancia}")

#12
num = float(input("Indique el primer número: "))
print(f"Su raíz cuadrada es {num**(1/2)} y su raíz cúbica es {num**(1/3)}")

#13
num = input("Indique un número de dos cifras: ")
print(num[::-1])

#14
a = int(input("Indique el primer número: "))
b = int(input("Indique el segundo número: "))
a, b = b, a
print(f"La variable a es {a} y la variable b es {b}")

#15
hh = 19
mm = 23
ss = 14
t = 73513

hora = (hh + (t // 3600)) % 24
minutos = (mm + (t % 3600)) // 60
segundos = ss + (t % 60)
print(f"El ciclista llegará a las {hora}:{minutos}:{segundos}")

#16
name = input("Ingrese su primer nombre: ")
apellido_1 = input("Ingrese su primer apellido: ")
apellido_2 = input("Ingrese su segundo apellido: ")
print(f"Sus iniciales son {name[0].upper()}{apellido_1[0].upper()}{apellido_2[0].upper()}")

#17
usuario = input("Ingrese su nombre: ")
print(f"Ahora estás en la matrix, {usuario}")

#18
costo = float(input("Ingrese cuánto costó una cena en el restaurante: "))
costo += (costo * 0.062) + (costo * 0.1)
print(f"El total a pagar es de {costo}") 

#19
dia = input("Ingrese el número de día de su nacimiento: ")
mes = input("Ingrese el número de mes de su nacimiento: ")
año = input("Ingrese el número de año de su nacimiento: ")
print(f"{dia}/{mes}/{año}")

#20
fecha = input("Ingrese la fecha de su nacimiento (DDMMAAAA): ")
day = fecha[0:2]
month = fecha[2:4]
year = fecha[4:]
print(f"{day}/{month}/{year}")

#21
rendimiento = float(input("¿Cuántos kilómetros puede recorrer su moto con 1 litro?\n"))
capacidad_tanque = float(input("¿Qué capacidad (en litros) tiene su tanque?\n"))
km = float(input("¿Cuántos kilómetros va a recorrer?\n"))
cant_tanques = km/capacidad_tanque/rendimiento
print(f"Usted necesitará {cant_tanques} tanques para llegar a su destino")