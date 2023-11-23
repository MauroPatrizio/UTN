import math

# 1.Escribir una función que, dado un número de DNI, retorne True si el número es válido y False si no lo es. Para que un número de DNI sea válido debe tener entre 7 y 8 dígitos.
def dni_isvalid(dni):
    return (len(dni)==7 or len(dni)==8) and dni.isdigit()

#2.	Escribir una función que, dado un string, retorne la longitud de la última palabra. Se considera que las palabras están separadas por uno o más espacios. También podría haber espacios al principio o al final del string pasado por parámetro.
def long_string(sentence):
    return len(sentence[-1])

#4
def is_multiple(num1, num2):
    return num1%num2==0

#5
def avg_temperature(temp_min, temp_max):
    return (temp_min+temp_max)/2

#6
def spacer(text):
    return " ".join(text)

print(spacer("Mauro Patrizio"))

#7
def max_min(list):
    
    return max(list), min(list)

#8
def circle_area_perimeter(radius):
    area = round(math.pi * radius ** 2, 2)
    perimeter = round(2 * math.pi *radius,2)
    return area, perimeter

#9
def login(user, password, attempts):
    if user == "usuario1" and password == "asdasd":
        return True, attempts
    else:
        attempts += 1
        return False, attempts
    
#10
def discount(prices, discount):
    final_price = 0

    for product, price in prices.items():
        discount = discount.get(product, 0)
        final_price += price * (1 - discount)

    return final_price

#11. Escribir una función que reciba otra función y una lista, y devuelva otra lista con el resultado de aplicar la función dada a cada uno de los elementos de la lista.

def function_for_each_element(function, list):
    result = []
    for element in list:
        result.append(function(element))
    return result

#12
def length_phrase(phrase):
    phrase_list = phrase.split()
    phrase_dict = {}
    for word in phrase_list:
        phrase_dict[word] = len(word)
    return phrase_dict

#13. Escribir una función que calcule el módulo de un vector
def vector_module(vector):
    return math.sqrt(sum(v ** 2 for v in vector))

#14
def is_prime_number(number):
    return True if ((number%2!=0 and number%3!=0) or number==2 or number==3) else False;

#15
def factorial(number):

    if number == 0:
        return 1
    else:
        return number * factorial(number-1)

#16
def frequency(number, digit):
    qty = 0
    for n in str(number):
        if n == str(digit):
            qty += 1
    return qty

def number_isvalid(text):
    while True:
        number = input(text)
        if number[0] == "-" and number[1:].isdigit():
            return int(number)
        elif number.isdigit():
            return int(number)
        else:
            print("Invalid input")

def digit_isvalid():
    while True:
        digit = input("Enter one digit: ")
        if digit[0] == "-" and digit[1].isdigit() and len(digit) == 2:
            return int(digit)
        elif digit.isdigit() and len(digit) == 1:
            return int(digit)
        else:
            print("Invalid input")

#17
def digits_sum(number):
    total = 0
    for digit in str(number):
        total += int(digit)
    return total