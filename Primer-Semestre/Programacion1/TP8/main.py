import functions
import validations

# 1.	Escribir una función que reciba un número positivo n y devuelva la cantidad de dígitos que tiene.
print(functions.length_number(1000))

# 2.	Escribir una función que reciba 2 enteros n y b y devuelva True si n es potencia de b.
print(functions.is_power_of(9, 3))

# 3.	Escribir una funcion recursiva que reciba como parámetros dos strings a y b, y devuelva una lista con las posiciones en donde se encuentra b dentro de a. Ejemplo:
a = "Un tete a tete con Tete"
b = "te"
print(functions.positions(a, b))

# 4.	Escribir dos funciones mutualmente recursivas par(n) e impar(n) que determinen la paridad del numero natural dado, conociendo solo que:
# •	1 es impar.
# •	Si un número es impar, su antecesor es par; y viceversa.
n = 7
print(f"The number {n} is even" if functions.even(n) else "The number is odd")

# 5.	Escribir una función recursiva que encuentre el mayor elemento de una lista.
my_list = [127, 34, 154, 2, 45, 67, 77]
print(f"The greater element in the list is: {functions.find_greater(my_list)}")

# 6.	Escribir una función recursiva para replicar los elementos de una lista una cantidad n de veces. Por ejemplo, replicar ([1, 3, 3, 7], 2) = ([1, 1, 3, 3, 3, 3, 7, 7])
my_list = [1, 3, 3, 7]
print(functions.replicate_numbers(my_list, 2))

# 7.	Implemente un algoritmo, usando una función recursiva, que resuelva la siguientesumatoria:
# K(n, p) = p + 2 ∗ p + 3 ∗ p + 4 ∗ p + … + n ∗ p
# ● El programa debe pedir al usuario que ingrese un número n, y un número p,
# ● Luego debe calcular el valor de K(n, p) usando una función recursiva,
# ● Debe imprimir el resultado de K(n, p)
n = validations.only_numbers("Enter an entire number for n: ")
p = validations.only_numbers("Enter an entire number for p: ")
print(f"The value of k(n,p) is: {functions.summation(n, p)} ")

# 8.	El triángulo de Pascal es un arreglo triangular de números que se define de la siguiente manera: Las filas se enumeran desde n = 0, de arriba hacia abajo. Los valores de cada fila se enumeran desde k = 0 (de izquierda a derecha). Los valores que se encuentran en los bordes del triángulo son todos unos. Cualquier otro valor se calcula sumando los dos valores contiguos de la fila de arriba. Escribí la función recursiva pascal(n, k) que calcula el valor que se encuentra en la fila n y la columna k.
n = 7
k = 3
print(f"The value of the row {n} and column {k} is: {functions.pascal(n,k)}")
# 9.	Escribí una función recursiva combinaciones(lista, k) que reciba una lista de caracteres únicos, y un número k, e imprima todas las posibles cadenas de longitud k formadas con los caracteres dados (permitiendo caracteres repetidos).
k = 3
my_list = ["A", "E", "I", "O", "U"]
print(functions.combinations(my_list, k))


# 10.	La norma ISO 216 especifica tamaños de papel. Es el estándar que define el popular tamaño de papel A4 (210 mm de ancho y 297 mm de largo). Las hojas A0 miden 841 mm de ancho y 1189 mm de largo. A partir de la A0 las siguientes medidas, digamos la A(N+1), se definen doblando al medio la hoja A(N). Siempre se miden en milímetros con números enteros: entonces la hoja A1 mide 594 mm de ancho (y no 594.5) por 841 mm de largo.

# Escribí una función recursiva medidas_hoja_A(N) que para una entrada N mayor que cero, devuelva el ancho y el largo de la hoja A(N) calculada recursivamente a partir de las medidas de la hoja A(N−1), usando la hoja A0 como caso base. La función debe devolver el ancho y el largo -en ese orden- en una tupla.

n = validations.size("Enter the number of the size paper you want t know the dimensions (0-10): ")
width, height = functions.paper_dimensions(n)
print(f"The dimensions of the paper A{n} are: {width}mm x {height}mm")