# 7.	Escribir un programa que procese strings ingresados por el usuario. La lectura finaliza cuando se hayan procesado 50 strings. Al finalizar, informar la cantidad total de ocurrencias de cada carácter, en todos los strings ingresados. Ejemplo:
# ‘r’:5
# ‘%’:3
# ‘a’:8
# ‘9’:1

text_list = []
char_dict = {}

for i in range(50):
    text_list.append(input("Enter your text number {i}/50: "))

for char in "".join(text_list):
        if char in char_dict:
            char_dict[char] += 1
        else:
             char_dict[char] = 1

for char, count in char_dict.items():
    print(f"'{char}': {count}")