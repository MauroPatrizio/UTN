# #1
years = int(input("Indique cuántos años tiene la computadora(en años): "))
print("El computador es nuevo" if years <= 2 else "El computador es viejo")

# #2
years = int(input("Indique cuántos años tiene la computadora(en años): "))
if(years < 0 ):
    print("La cantidad de años no es válida")
else:
    print("El computador es nuevo" if years <= 2 else "El computador es viejo")

# #3
nombres = input("Ingrese los nombres de dos personas(nombre, nombre)").split(",")
print("Coincidencia" if nombres[0][0].lower() == nombres[1][0].lower() else "No hay coincidencia")

# #4
candidato_a = "por el partido rojo"
candidato_b = "por el partido verdad"
candidato_c = "por el parttido azul"
eleccion = input(f"Elija su opción de candidato, A {candidato_a}, B {candidato_b}, C {candidato_c}: ").upper()

if(eleccion == "A"):
    print(f"Usted ha votado {candidato_a}")
elif(eleccion == "B"):
    print(f"Usted ha votado {candidato_b}")
elif(eleccion == "C"):
    print(f"Usted ha votado {candidato_c}")
else:
    print("Opción errónea")

# #5
letra = input("Ingrese una letra")
VOCALES = ("a", "e", "i", "o", "u")
if(letra.len() != 1):
    print("No se puede procesar el dato")
elif(letra in VOCALES):
    print("Es vocal")

# #6
year = int(input("Ingrese un año: "))
if(((year%4 == 0) and (year%100 != 0)) or (year % 400 == 0)):
    print("Es año bisiesto")
else:
    print("No es año bisiesto")

# #7
numero_1 = int(input("Escriba el primer número: "))
numero_2 = int(input("Escriba el segundo número: "))
numero_3 = int(input("Escriba el tercer número: "))
print(min(numero_1,numero_2,numero_3))

#8
user = input("Ingrese su nombre de usuario: ")
password = input("Ingrese su contraseña: ")
print("Usuario y contraseña correctos. Puede ingresar a Camelot" if user == "Gwenevere" and password == "excalibur" else "Acceso denegado")

#9
nombre = input("Indique su nombre: ").upper()
sexo = input("Indique su sexo (F, M): ").upper()
if((sexo == "F" and nombre[0] < "M") or (sexo=="M" and nombre[0] > "N")):
    print("Usted pertenece al grupo A")
else:
    (print("Usted pertenece al grupo b"))

#10
edad = int(input("Ingrese la edad del cliente: "))
if (edad < 4):
    print("Puede entrar gratis")
elif(4<=edad<=18):
    print("Debe pagar $500")
else:
    print("Debe pagar $1000")

#11
tipo_pizza = input("Indique si quiere pizza vegetariana (Y/N): ").upper()
VEGETARIANA = ("Pimiento", "Tofu")
NO_VEGETARIANA = ("Peperoni","Jamón", "Salmón")
if(tipo_pizza != "Y" and tipo_pizza!="N"):
    print("Respuesta no válida")
elif(tipo_pizza == "Y"):
    ingrediente = input(f"Los ingredientes disponibles para pizza vegetariana son: {VEGETARIANA}, elija uno de estos ingredientes: ").title()
    print(f"La pizza es vegetariana y sus ingredientes son Mozzarella, Tomate y {ingrediente}" if ingrediente in VEGETARIANA else "El ingrediente elegido no es válido")
else:
    print(f"")
    ingrediente = input(f"Los ingredientes disponibles para pizza no vegetariana son: {NO_VEGETARIANA}, elija uno de estos ingredientes: ").title()
    print(f"La pizza no es vegetariana y sus ingredientes son Mozzarella, Tomate y {ingrediente}" if ingrediente in NO_VEGETARIANA else "El ingrediente elegido no es válido")

#12
this_year = int(input("Ingrese el año actual: "))
another_year = int(input("Ingrese el otro año: "))
print(f"Faltan {another_year-this_year} años para llegar al año {another_year}" if another_year>=this_year else f"Han pasado {this_year-another_year} años desde el año {another_year} hasta el año actual")

#13
num_1 = int(input("Escriba el primer número entero: "))
num_2 = int(input("Escriba el segundo número entero: "))
if (num_1 < 1):
    print("El número ingresado es negativo o nulo")
elif(num_1 > num_2):
    print(f"El número {num_1} es múltiplo de {num_2}" if num_1%num_2==0 else f"El número {num_1} no es múltiplo de {num_2}")
else:
    print(f"El número {num_2} es múltiplo de {num_1}" if num_2%num_1==0 else f"El número {num_2} no es múltiplo de {num_1}")

#14
a = float(input("Indique el coeficiente a: "))
b = float(input("Indique el coeficiente b: "))
if a == 0 and b == 0:
    print("La ecuación tiene infinitas soluciones")
elif a == 0:
    print("La ecuación no tiene solución")
else:
    print(f"La solución de la ecuación es x = {-b / a}")

#15
tipo_area = input("Indique si quiere calcular el área de un triángulo(t) o el área de un Círculo(c): ").lower()
if(tipo_area =="t"):
    base = float(input("Ingrese la base del triángulo: "))
    altura = float(input("Ingrese la altura del triángulo: "))
    print(f"El área del triángulo es {base * altura / 2}")
elif(tipo_area == "c"):
    radio = float(input("Indique el radio del círculo: "))
    print(f"El área del círculo es {3.14*radio**2}")

#16
a = float(input("Ingrese el primer valor: "))
b = float(input("Ingrese el segundo valor: "))
operacion = int(input("Si quiere sumar ingrese 1\nSi quiere restar ingrese 2\nSi quiere multiplicar ingrese 3\nSi quiere dividir ingrese 4: "))
if (0>=operacion>4):
    print("Número de operación no válido")
elif (operacion == 1):
    print(a+b)
elif (operacion == 2):
    print(a-b)
elif (operacion == 3):
    print(a*b)
else: 
    print(f"No se puede dividir por 0" if b == 0 else a/b)

#17
dia = input("Ingrese un día de la semana: ").title()
if(dia == "Lunes"):
    print("Que tengas un buen comienzo de semana")
elif(dia == "Viernes"):
    print("Que tengas un feliz fin de semana")
elif(dia == "Sábado" or dia == "Domingo"):
    print("Espero estés aprovechando el fin de semana")
else:
    print("A seguir trabajando")

#18
horas = int(input("Ingrese la cantidad de horas trabajadas en el mes: "))
salario_hora = float(input("Ingrese el salario por hora"))
if(horas >= 48):
    horas_extra = horas - 48
    print(f"Usted ha hecho {horas_extra} horas extra este mes")
    print(f"Su salario es {(48*salario_hora)+horas_extra*(salario_hora*1.1)}")
else:
    print("Usted trabajó menos que la mínima mensual")
    print(f"Su salario es {horas*salario_hora}")

#19
cant_lapiz = int(input("Ingrese la cantidad de lápices a comprar: "))
if cant_lapiz > 0:
    print(f"La cantidad a pagar es ${cant_lapiz*60}" if cant_lapiz<1000 else f"La cantidad a pagar es ${cant_lapiz*(60-(60*0.07))}")

#20
nota_1 = int(input("Ingrese su primer nota: "))
nota_2 = int(input("Ingrese su segunda nota: "))
nota_3 = int(input("Ingrese su tercer nota: "))
nota_4 = int(input("Ingrese su cuarta nota: "))

promedio = (nota_1+nota_2+nota_3+nota_4)/4

print(f"El alumno aprueba el curso con un promedio de {promedio}" if promedio >= 6 else f"El alumno reprueba el curso con un promedio de {promedio}")