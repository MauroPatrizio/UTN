import validations
#11.	Escribir un programa que guarde en una variable el diccionario {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}, pregunte al usuario por una divisa y muestre su símbolo o un mensaje de aviso si la divisa no está en el diccionario.

currency = {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}

type =  validations.only_text("Enter the type of currency you are looking for: ")

if type in currency:
    print(currency[type])
else:
    print(f"{type} is not in our list of currencies")