import re

def val_float_numbers(text):
    regex = re.compile(r"^\d+\.?\d*")

    return re.match(regex, text)

def val_text(text):
    regex = re.compile(r'^[a-zA-Z\s]+$')
    
    return re.match(regex, text)


def val_num(num):
    regex = re.compile(r'^\d+$')
    
    return re.match(regex, num)

def val_text_num(text):
    regex = re.compile(r'^[a-zA-z0-9\s]+$')
    
    return re.match(regex, text)

def val_matrix_16(text):
    regex = re.compile(r"^[0-3]{2}$")

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
        if val_num(number):
            return int(number)
        else:
            print("Invalid number, try again")

#pide el destino al usuario, saca los espacios sobrantes y valida que el nombre solo contenga letras y números y si es verdadero retorna el valor
def text_and_numbers(text):
    while True:
        text_numb = " ".join(input(text).title().strip().split())
        if val_text_num(text_numb):
            return text_numb
        else:
            print("Invalid name, try again")

def numbers_4(text):
    while True:
        numb = input(text).strip()
        if val_matrix_16(numb):
            return numb
        else:
            print("Invalid input")


def float_numbers(text):
    while True:
        numb = input(text).strip()
        if val_float_numbers(numb):
            return float(numb)
        else:
            print("Invalid input")
