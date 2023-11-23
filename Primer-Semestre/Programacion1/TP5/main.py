import functions

#3.	Escribir un programa que permita al usuario obtener un identificador para cada uno de los socios de un club. Para eso ingresará nombre completo y número de DNI de cada socio, indicando que finalizará el procesamiento mediante el ingreso de un nombre vacio.
# Precondición: el formato del nombre de los socios será: nombre apellido. Podría ingresarse más de un nombre, en cuyo caso será: nombre1, nombre2, apellido. Si un socio tuviera más de un apellido, el usuario solo ingresará uno.
# Se debe validar que el número de DNI tenga 7 u 8 dígitos. En caso contrario, el programa debe dejar al usuario en un bucle hasta que ingrese un DNI correcto.
# Por cada socio se debe imprimir su identificador único, el cual estará formado por: el primer nombre, la cantidad de letras del apellido y los 3 primeros dígitos de su DNI. Ejemplo:
# Nombre: María Ines Rosales
# DNI: 25469648
# ID -> Maria7254

while(True):
    name = input("Enter your full name (empty to exit): ").strip().title()
    if name == "":
        break
    else:
        name = name.split(" ")

    #validate length and characters of dni
    valid = False;
    while (valid == False):
        dni = input("Enter your dni: ")
        valid = functions.isvalid(dni)
        if valid == False:
            print("Your dni must have 7 or 8 digits")

    #generate and print id 
    identification = name[0] + str(functions.long_string(name)) + dni[:3]
    print(f"Your ID is {identification}")


#4.	Crea un programa que pida dos número enteros al usuario y diga si alguno de ellos es múltiplo del otro. Crea una función que reciba los dos números, y devuelve si el primero es múltiplo del segundo


num1 = int(input("Enter the first entire number: "))
num2 = int(input("Enter the second entire number: "))

print(function.is_multiple(num1, num2))


#5.	Crear una función que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. Crear un programa principal, que utilizando la función anterior, vaya pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la media. El programa pedirá el número de días que se van a introducir


days_qty = int(input("Enter the number of days for which you would like to calculate the average: "))

for i in range(days_qty):
    temp_min = float(input(f"Enter the minimum temperature of the day {i+1}: "))
    temp_max = float(input(f"Enter the maximum temperature of the day {i+1}: "))

    print(functions.avg_temperature(temp_min, temp_max))


#6.	Crea una función que reciba como parámetro un texto y devuelve una cadena con un espacio adicional tras cada letra. Por ejemplo, “Hola, tú” devolverá “H o l a , t ú “. Crea un programa principal donde se use dicha función


text = input("Enter your text: ").strip().split()
print(functions.spacer(text))


#7.	Crea una función que recibe una lista con valores numéricos y devuelve el valor máximo y el mínimo. Crea un programa que pida números por teclado y muestre el máximo y el mínimo, utilizando la función anterior.

import functions

list = []

while (True):
    number = input("Enter a number (Q to exit): ").upper()
    if number == "Q":
        break
    elif number[0] == "-" and number[1:].isdigit():
        list.append(int(number))
    elif number.isdigit():
        list.append(int(number))
    else:
        print("Invalid input")

maxim, minim = functions.max_min(list)

print(f"The highest value of the list is {maxim} and the lowest value is {minim}")

#8.	Diseñar una función que calcule el área y el perímetro de una circunferencia. Utiliza dicha función en un programa principal que lea el radio de una circunferencia y muestre su área y perímetro

while True:
    radius = input("Enter the radius of the circle: ")
    if radius.isdigit():
        radius = float(radius)
        if radius > 0:
            area, perimeter = functions.circle_area_perimeter(radius)
            break
    else:
        print("Invalid input")

print(f"The area of the circle is {area:.2f} and the perimeter is {perimeter:.2f}")

#9.	Crear una subrutina llamada “login”, que recibe un nombre de usuario y una contraseña y te devuelve Verdadero si el nombre de usuario es “usuario1” y la contraseña es “asdasd”. Además recibe el número de intentos que se ha intentado hacer login y si no se ha podido hacer login incremente este valor.
#Crear un programa principal donde se pida un nombre de usuario y una contraseña y se intente hacer login, solamente tenemos tres oportunidades para intentarlo.

 
attempts = 0
while True: 
    user = input("Enter your username: ")
    password = input("Enter your password: ")
    isvalid, attempts = functions.login(user, password, attempts)
    if isvalid :
        print("Login successful")
        break
    elif attempts < 3:
        print(f"Incorrect login, you have {3-attempts} more")
    else:
        print("You have no more attempts, Goodbye!")
        break

#10. Escribir una función que aplique un descuento a un precio. Esta función tiene que recibir un diccionario con los precios y porcentajes del carrito de compra, aplicar los descuentos a los productos del carrito  y devolver el precio final de la compra



prices = {"carrot": 10, "lettuce": 5, "meat": 21}
discounts = {"lettuce": 0.1}

print(functions.discount(prices, discounts))

#12. Escribir una función que reciba una frase y devuelva un diccionario con las palabras que contiene y su longitud.

phrase = input("Enter a phrase: ")
functions.length_phrase(phrase)

#14. Requerir al usuario que ingrese un número entero e informar si es primo o no, utilizando una función booleana que lo decida.

print(functions.is_prime_number(int(input("Enter an entire number: "))))

#15. Escribir un programa que pida números al usuario, mostrar el factorial de cada uno y, al finalizar, la cantidad total de números leídos en total. Utilizar una o más funciones, según sea necesario.

list = []
while True:
    number = input("Enter an entire number(Q to exit): s").upper()
    if number.isdigit():
        functions.factorial(number)
    elif number == "Q":
        break
    else:
        print("Invalid input")

print(f"The total numbers read were {len(list)}")


#16. Solicitar al usuario un número entero y luego un dígito. Informar la cantidad de ocurrencias del dígito en el número, utilizando para ello una función que calcule la frecuencia.

number = functions.number_isvalid("Enter an entire number: ")
digit = functions.digit_isvalid()

print(functions.frequency(number, digit))

#17. Solicitar al usuario el ingreso de números primos. La lectura finalizará cuando ingrese un número que no sea primo. Por cada número, mostrar la suma de sus dígitos. También solicitar al usuario un dígito e informar la cantidad de veces que aparece en el número (frecuencia). Al finalizar el programa, mostrar el factorial del mayor número ingresado.

import functions

prime_numbers_list = []
digit = functions.digit_isvalid()
while True:
    number = functions.number_isvalid("Enter a prime number: ")
    if functions.is_prime_number(number):
        prime_numbers_list.append(number)
        print(f"The sum of the digits of {number} is {functions.digits_sum(number)}")
        print(f"The digit {digit} appears {functions.frequency(number, digit)} in the number")
    else:
        print(f"{number} is not a prime number")
        break

maxim, minim = functions.max_min(prime_numbers_list)
print(f"The factorial of the number {maxim} is {functions.factorial(maxim)}")
