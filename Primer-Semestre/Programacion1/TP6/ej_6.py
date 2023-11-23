import validations

# 6.	Solicitar al usuario que ingrese los nombres de pila de los alumnos de nivel primario de una escuela, finalizando al ingresar ‘x’. A continuación, solicitar que ingrese los nombres de los alumnos de nivel secundario, finalizando al ingresar ‘x’.
primary_list = []
secondary_list = []

while True:
    name = validations.only_text("Enter the first name of the primary level student (x to exit): ")
    if name == "X":
        break
    else:
        primary_list.append(name)

while True:
    name = validations.only_text("Enter the first name of the secondary level student (x to exit): ")
    if name == "X":
        break
    else:
        secondary_list.append(name)

# a.	Informar los nombres de todos los alumnos de nivel primario y de los de nivel secundario, sin repeticiones.
all_names = []

for name in primary_list:
    if name not in all_names:
        all_names.append(name)

for name in secondary_list:
    if name not in all_names:
        all_names.append(name)

print(f"The names of both levels, without repeat are: {', '.join(all_names)}")

# b.	Informar qué nombres se repiten entre los alumnos de nivel primario y secundario.
repeated_names = []
for name in primary_list:
    if name in secondary_list:
        repeated_names.append(name)

print(f"The repeated names between primary and secondary level are: {', '.join(repeated_names)}")

# c.	Informar qué nombres de nivel primario no se repiten en los de nivel secundario.
primary_not_repeated = []
for name in primary_list:
    if name not in secondary_list:
        primary_not_repeated.append(name)

print(f"The primary level names that are not repeated in secondary level are: {', '.join(primary_not_repeated)}")