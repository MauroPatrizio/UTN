import validations
# 12.	Escribir un programa que pregunte al usuario su nombre, edad, dirección y teléfono y lo guarde en un diccionario. Después debe mostrar por pantalla el mensaje ‘<nombre> tiene <edad> años, vive en <dirección> y su número de teléfono es <teléfono>’.

name = validations.only_text("Enter your name: ")
age = validations.only_numbers("Enter your age ")
address = validations.text_and_numbers("Enter your address ")
phone = validations.only_numbers("Enter your phone number: ")

user = {"name": name, "age": age, "address": address, "phone": phone }

print(f"{user['name']} tiene {user['age']}, vive en {user['address']} y su número de teléfono es {user['phone']}")
