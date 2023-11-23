# 10.	Teniendo una matriz cuadrada de cualquier dimensión, obtener lo siguiente:
# a.	la diagonal principal.
# b.	la diagonal inversa.


def get_main_diagonal(matrix):
    main_diagonal = []
    length = len(matrix)
    for i in range(length):
        main_diagonal.append(matrix[i][i])
    return main_diagonal

def get_reverse_diagonal(matrix):
    reverse_diagonal = []
    length = len(matrix)
    for i in range(length):
        reverse_diagonal.append(matrix[i][length - 1 - i])
    return reverse_diagonal

main_diagonal = get_main_diagonal(matrix)
reverse_diagonal = get_reverse_diagonal(matrix)

print("Main Diagonal:", main_diagonal)
print("Reverse Diagonal:", reverse_diagonal)
