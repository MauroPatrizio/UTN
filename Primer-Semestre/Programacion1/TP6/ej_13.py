import validations

# 13.	Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.


fruits = {"Strawberry" : 10, "Orange": 5.5, "Blueberry" : 9.3, "Banana" : 7, "Apple" : 3.1}

fruit = validations.only_text("Enter the name of the fruit: ")

if fruit in fruits:
    kilos = validations.float_numbers(f"Enter how many kilos of {fruit} do you wanna buy: ")

    total = kilos * fruits[fruit]

    print(f"The final price for {kilos} kilos of {fruit} is {total}")

else:
    print(f"Sry, we don't have {fruit}")