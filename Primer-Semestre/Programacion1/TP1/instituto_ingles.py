fecha = input("Ingrese la fecha (día, DD/MM)").split(",")
dia = fecha[0].title()
dd = int(fecha[1].split("/")[0])
mm = int(fecha[1].split("/")[1])
DIAS = ("Lunes","Martes","Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
DIAS_EXAMENES = ("Lunes", "Martes", "Miércoles")
if ( dia not in DIAS):
    print(f"El día {dia} no es válido")
elif (1 > dd or dd > 31):
    print(f"El número de día {dd} es inválido")
elif (1 > mm or mm> 12):
    print(f"El número de mes {mm} es inválido")
elif (dia in DIAS_EXAMENES):
    examenes = input("Se realizaron exámenes? (si/no): ").lower()
    if (examenes == "si"):
        aprob_desaprob= input("Ingrese el número de estudiantes aprobados y desaprobados (aprobados/desaprobados): ").split("/")
        aprobados = int(aprob_desaprob[0])
        total = aprobados + int(aprob_desaprob[1])
        print(f"Alumnos que rindieron: {total}, Alumnos aprobados {aprobados}")
        porcentaje = round((aprobados * 100 / total),2)
        print(f"Aprobó el {porcentaje}% de los estudiantes")
elif (dia == "Jueves"):
    asistencia = int(input("Indique el porcentaje de asistencia a clases: "))
    print("Asistió la mayoría" if asistencia > 50 else "No asistió la mayoría")
elif (dia == "Viernes" and dd==1 and mm==1 or mm==7):
    print("Comienzo de nuevo ciclo")
    cant_nuevo_ciclo = int(input("Ingrese la cantidad de alumnos del nuevo ciclo: "))
    arancel = float(input("Ingrese el arancel de cada alumno: "))
    print(f"El ingreso total de este nuevo ciclo será de ${cant_nuevo_ciclo*arancel}")