# 1.	Escribir una función que reciba un número positivo n y devuelva la cantidad de dígitos que tiene.
def length_number(n):

    if n < 10:
        return 1
    else:
        return 1 + length_number(n//10) 

# 2.	Escribir una función que reciba 2 enteros n y b y devuelva True si n es potencia de b.
def is_power_of(n, b):
    if n == 1:
        return True
    elif n<b:
        return False
    elif n % b == 0:
        return is_power_of(n // b, b)
    return False

# 3.	Escribir una funcion recursiva que reciba como parámetros dos strings a y b, y devuelva una lista con las posiciones en donde se encuentra b dentro de a. Ejemplo:
def positions(a, b):
    positions_list = []
    index = a.find(b)

    while index != -1:
        positions_list.append(index)
        index = a.find(b, index+1)
    
    return positions_list
# 4.	Escribir dos funciones mutuamente recursivas par(n) e impar(n) que determinen la paridad del numero natural dado, conociendo solo que:
# •	1 es impar.
# •	Si un número es impar, su antecesor es par; y viceversa.
def even(n):
    if n == 0:
        return True
    else:
        return odd(n-1)
    
def odd(n):
    if n == 0:
        return False
    else:
        return even(n-1)
    
# 5.	Escribir una función recursiva que encuentre el mayor elemento de una lista.
def find_greater(my_list):
    if len(my_list) == 1:
        return my_list[0]
    else:
        greater = find_greater(my_list[1:])
        return my_list[0] if my_list[0] > greater else greater

# 6.	Escribir una función recursiva para replicar los elementos de una lista una cantidad n de veces. Por ejemplo, replicar ([1, 3, 3, 7], 2) = ([1, 1, 3, 3, 3, 3, 7, 7])
def replicate_numbers(my_list, n):
    if n <= 0:
        return []
    elif not my_list:
        return []
    else:
        return [my_list[0]] * n + replicate_numbers(my_list[1:], n)
    
# 7.	Implemente un algoritmo, usando una función recursiva, que resuelva la siguientesumatoria:
# K(n, p) = p + 2 ∗ p + 3 ∗ p + 4 ∗ p + … + n ∗ p
# ● El programa debe pedir al usuario que ingrese un número n, y un número d,
# ● Luego debe calcular el valor de K(n, p) usando una función recursiva,
# ● Debe imprimir el resultado de K(n, p)
def summation(n,p):
    if n == 1:
        return p
    else:
        return n * p + summation(n-1, p)

# 8.	El triángulo de Pascal es un arreglo triangular de números que se define de la siguiente manera: Las filas se enumeran desde n = 0, de arriba hacia abajo. Los valores de cada fila se enumeran desde k = 0 (de izquierda a derecha). Los valores que se encuentran en los bordes del triángulo son todos unos. Cualquier otro valor se calcula sumando los dos valores contiguos de la fila de arriba. Escribí la función recursiva pascal(n, k) que calcula el valor que se encuentra en la fila n y la columna k.
def pascal(n, k):
    if k == 0 or k == n:
        return 1
    else:
        return pascal(n-1, k-1) + pascal(n-1, k)

# 9.	Escribí una función recursiva combinaciones(lista, k) que reciba una lista de caracteres únicos, y un número k, e imprima todas las posibles cadenas de longitud k formadas con los caracteres dados (permitiendo caracteres repetidos).
def combinations(chars, k, current=""):
    if k == 0:
        print(current)
        return
    for char in chars:
        new_string = current + char
        combinations(chars, k - 1, new_string)

# 10.	La norma ISO 216 especifica tamaños de papel. Es el estándar que define el popular tamaño de papel A4 (210 mm de ancho y 297 mm de largo). Las hojas A0 miden 841 mm de ancho y 1189 mm de largo. A partir de la A0 las siguientes medidas, digamos la A(N+1), se definen doblando al medio la hoja A(N). Siempre se miden en milímetros con números enteros: entonces la hoja A1 mide 594 mm de ancho (y no 594.5) por 841 mm de largo.

# Escribí una función recursiva medidas_hoja_A(N) que para una entrada N mayor que cero, devuelva el ancho y el largo de la hoja A(N) calculada recursivamente a partir de las medidas de la hoja A(N−1), usando la hoja A0 como caso base. La función debe devolver el ancho y el largo -en ese orden- en una tupla.

def paper_dimensions(n):
    # Base case: A0 size
    if n == 0:
        return (841, 1189)
    else:
        # Recursively calculate A(N) dimensions from A(N-1)
        width, length = paper_dimensions(n - 1)
        return (length // 2, width)
