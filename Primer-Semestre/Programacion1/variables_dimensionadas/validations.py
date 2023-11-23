import re

def val_text(text):
    regex = re.compile(r'^[a-zA-Z\s]+$')
    
    return re.match(regex, text)


def val_dni(dni):
    regex = re.compile(r'^\d{7,8}$')
    
    return re.match(regex, dni)

def val_text_num(text):
    regex = re.compile(r'^[a-zA-z0-9\s]+$')
    
    return re.match(regex, text)


#pide un texto al usuario, saca los espacios sobrantes y valida que el texto solo contenga letras y si es verdadero retorna el valor
def only_text(text):
    while True:
        string = " ".join(input(text).title().strip().split())
        if val_text(string):
            return string
        else:
            print("Invalid name, try again")

#pide un texto numérico al usuario, saca los espacios delante y detras de los números y se fija que lo ingresado sean solo 7 u 8 dígitos y si es verdadero retorna el valor
def only_numbers(text):
    while True:
        number = input(text).strip()
        if val_dni(number):
            return number
        else:
            print("Invalid dni, try again")

#pide el destino al usuario, saca los espacios sobrantes y valida que el nombre solo contenga letras y números y si es verdadero retorna el valor
def text_and_numbers(text):
    while True:
        text_numb = " ".join(input(text).title().strip().split())
        if val_text_num(text_numb):
            return text_numb
        else:
            print("Invalid name, try again")