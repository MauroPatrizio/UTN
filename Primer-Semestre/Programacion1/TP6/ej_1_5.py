import validations

# 1.	Solicitar al usuario que ingrese números, estos deben guardarse en una lista. Para finalizar el usuario debe ingresar 0, el cual no debe guardarse.
number_list = []

while True:
    number = validations.only_numbers("Enter a number (0 to exit): ")
    if number == 0:
        break
    else:
        number_list.append(number)

print (number_list)


# 2.	A continuación, solicitar al usuario que ingrese un número y, si el número está en la lista, eliminar su primera ocurrencia. Mostrar un mensaje si no es posible eliminar.
number_to_remove = validations.only_numbers("Enter the number you want to remove: ")
if number_to_remove in number_list:
    number_list.remove(number_to_remove)
    print(f"Number {number_to_remove} removed")
else:
    print(f"The number {number_to_remove} is not in the number_list")

# 3.	Imprimir la sumatoria de todos los números de la lista.
total = sum(number_list)
print(f"The sum of the numbers in the number_list is: {total}")

# 4.	Solicitar al usuario otro número y crear una lista con los elementos de la lista original, que sean menores que el número dado. Imprimir esta nueva lista, iterando por ella.
limit_number = validations.only_numbers("Enter the limit number to compare the number_list: ")
minor_list = [number for number in number_list if number < limit_number]

print(minor_list)

# 5.	Generar e imprimir una nueva lista que contenga como elementos a tuplas, cada una compuesta por un número de la lista original y la cantidad de veces que aparece en ella. Por ejemplo, si la lista original es [5,16,2,5,57,5,2], la nueva lista contendrá: [(5,3),(16,1),(2,2),(57,1)]
tuple_list = []

for number in number_list:
    count = number_list.count(number)
    if (number, count) not in tuple_list:
        tuple_list.append((number, count))

print(tuple_list)

