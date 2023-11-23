# 1.	Escribe un programa que tome una lista de números como entrada y la ordene en orden ascendente utilizando el método de ordenamiento de burbuja.
def bubble_sort(list):
    n = len(list)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n-i-1):
            if list[j] > list[j+1]:
                list[j], list[j+1] = list[j+1], list[j]
                swapped = True

        if not swapped:
            break
    
    return list
# 2.	Crea un programa que tome una lista de palabras como entrada y las ordene alfabéticamente en orden ascendente utilizando el método de ordenamiento de selección.
def selection_sort(list):
    n = len(list)
    
    for i in range(n):
        min_index = i
        for j in range(i+1, n):
            if list[j] < list[min_index]:
                min_index = j

        list[i], list[min_index] = list[min_index], list[i]

    return list

# 3.	Crea una lista de diccionarios, donde cada diccionario contiene información sobre un libro (título, autor, año de publicación, etc.). Luego, escribe un programa que ordene la lista de libros en función de un campo específico, como el año de publicación o el autor.



def sort_by_field(list, field):

    n = len(list)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n-i-1):
            if list[j][field] > list[j+1][field]:
                list[j], list[j+1] = list[j+1], list[j]
                swapped = True

        if not swapped:
            break
    
    return list

# 4.	Escribe un programa que tome una lista de cadenas como entrada y las ordene en orden ascendente según su longitud. Puedes utilizar el método de ordenamiento de inserción.
def insert_sort(list):
    
    n = len(list)

    for i in range(1, n):
        key = list[i]
        j = i - 1

        while j >= 0 and len(key) < len(list[j]):
            list[j + 1] = list[j]
            j -= 1

        list[j + 1] = key

    return list

# 5.	Modifica uno de los ejercicios anteriores para ordenar la lista de números en orden descendente en lugar de ascendente.
def bubble_sort_desc(list):
    n = len(list)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n-i-1):
            if list[j] < list[j+1]:
                list[j], list[j+1] = list[j+1], list[j]
                swapped = True

        if not swapped:
            break
    
    return list

# 6.	Escribe un programa que tome una lista de números enteros y ordene la lista utilizando el algoritmo de ordenamiento por conteo.

def counting_sort(list):
    if not list:
        return list

    max_val = max(list)

    count = [0] * (max_val + 1)

    for num in list:
        count[num] += 1

    sorted_list = []
    for i in range(max_val + 1):
        sorted_list.extend([i] * count[i])

    return sorted_list

# 7.	Crea una lista que contenga tanto números como cadenas de caracteres. Escribe un programa que ordene esta lista de manera que primero estén los números ordenados de menor a mayor y luego las cadenas de caracteres ordenadas alfabéticamente.
def sort_nums_words(list):
    n = len(list)
    
    for i in range(n):
        swapped = False
        
        for j in range(0, n-i-1):
            if str(list[j]) > str(list[j+1]):
                list[j], list[j+1] = list[j+1], list[j]
                swapped = True

        if not swapped:
            break
    
    return list


# 8.	Implementa el algoritmo de ordenamiento Merge Sort y úsalo para ordenar una lista de números.
def merge_sort(list):
    if len(list) > 1:
        mid = len(list) // 2
        left = list[:mid]
        right = list[mid:]

        merge_sort(left)
        merge_sort(right)

        left_index = right_index = merged_index = 0 

        while left_index < len(left) and right_index < len(right):
            if left[left_index] < right[right_index]:
                list[merged_index] = left[left_index]
                left_index += 1
            else:
                list[merged_index] = right[right_index]
                right_index += 1
            merged_index += 1

        while left_index < len(left):
            list[merged_index] = left[left_index]
            left_index += 1
            merged_index += 1

        while right_index < len(right):
            list[merged_index] = right[right_index]
            right_index += 1
            merged_index += 1
    
    return list