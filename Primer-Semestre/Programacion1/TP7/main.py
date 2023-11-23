import functions


# 1.	Escribe un programa que tome una lista de números como entrada y la ordene en orden ascendente utilizando el método de ordenamiento de burbuja.
list = [83, 46, 17, 91, 69, 53, 39, 3, 12, 58]

print(functions.bubble_sort(list))

# 2.	Crea un programa que tome una lista de palabras como entrada y las ordene alfabéticamente en orden ascendente utilizando el método de ordenamiento de selección.
list = ['Networks', 'Software', 'Hardware', 'Server', 'Algorithm', 'Browser', 'Computer', 'Programming', 'Database', 'Cybersecurity', 'Web Development', 'Operating System', 'Artificial Intelligence']

print(functions.selection_sort(list))

# 3.	Crea una lista de diccionarios, donde cada diccionario contiene información sobre un libro (título, autor, año de publicación, etc.). Luego, escribe un programa que ordene la lista de libros en función de un campo específico, como el año de publicación o el autor.

book_list = [
    {
        "title": "The Great Gatsby",
        "author": "F. Scott Fitzgerald",
        "publication_year": 1925,
        "genre": "Novel"
    },
    {
        "title": "1984",
        "author": "George Orwell",
        "publication_year": 1949,
        "genre": "Science Fiction"
    },
    {
        "title": "To Kill a Mockingbird",
        "author": "Harper Lee",
        "publication_year": 1960,
        "genre": "Novel"
    },
    {
        "title": "One Hundred Years of Solitude",
        "author": "Gabriel García Márquez",
        "publication_year": 1967,
        "genre": "Novel"
    }
]

sorted_list = functions.sort_by_field(book_list, "publication_year")

for i in sorted_list:
    print(i)

# 4.	Escribe un programa que tome una lista de cadenas como entrada y las ordene en orden ascendente según su longitud. Puedes utilizar el método de ordenamiento de inserción.

list = ['Networks', 'Software', 'Hardware', 'Server', 'Algorithm', 'Browser', 'Computer', 'Programming', 'Database', 'Cybersecurity', 'Web Development', 'Operating System', 'Artificial Intelligence']
    
print(functions.insert_sort(list))

# 5.	Modifica uno de los ejercicios anteriores para ordenar la lista de números en orden descendente en lugar de ascendente.
list = [83, 46, 17, 91, 69, 53, 39, 3, 12, 58]
print(functions.bubble_sort_desc(list))

# 6.	Escribe un programa que tome una lista de números enteros y ordene la lista utilizando el algoritmo de ordenamiento por conteo.
list = [83, 46, 17, 91, 69, 53, 39, 3, 12, 58]

print(functions.counting_sort(list))

# 7.	Crea una lista que contenga tanto números como cadenas de caracteres. Escribe un programa que ordene esta lista de manera que primero estén los números ordenados de menor a mayor y luego las cadenas de caracteres ordenadas alfabéticamente.
list = [7, "manzana", 3, "banana", 1, "cereza", 10, "uva"]

print(functions.sort_nums_words(list))

# 8.	Implementa el algoritmo de ordenamiento Merge Sort y úsalo para ordenar una lista de números.
list = [83, 46, 17, 91, 69, 53, 39, 3, 12, 58]

print(functions.merge_sort(list))