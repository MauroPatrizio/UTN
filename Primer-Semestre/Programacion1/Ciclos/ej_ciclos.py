# #1
correr = int(input("Ingrese los lugares a correr: "))%26
mensajes = []
for i in range (5):
    mensaje = input("Ingrese el mensaje: ").lower()
    mensajes.append(mensaje)
for i in mensajes:
    mensaje_encriptado = []
    for j in i:
        if(96 <ord(j)< 122):
            mensaje_encriptado.append((chr(ord(j)+correr)))
        elif(ord(j)==122):
            mensaje_encriptado.append(chr(96+correr))
        else:
            mensaje_encriptado.append(j)
    print("".join(mensaje_encriptado))

#2
total_pares = 0
total_impares = 0
while (True):
    pares = 0
    impares = 0
    num = int(input("Ingrese un número positivo (Ingrese 0 para salir): "))
    if num == 0:
        break
    elif num< 0:
        print("El número ingresado debe ser positivo")
    else:
        for i in str(num):
            if int(i) % 2 == 0:
                pares += 1
                total_pares += 1
            else:
                impares += 1
                total_impares += 1
        print(f"El número {num} tiene {pares} dígitos pares y {impares} dígitos impares")

print(f"El total de dígitos impares es {total_pares} y el total de dígitos impares es {total_impares}")