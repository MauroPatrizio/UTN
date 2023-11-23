'''1.	Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los siguientes métodos para la clase:
•	Un constructor, donde los datos pueden estar vacíos.
•	Los setters y getters para cada uno de los atributos. Hay que validar las entradas de datos.
•	mostrar(): Muestra los datos de la persona.
•	esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
'''
import re 

class Person:
   
    def __init__(self, name="", age="", dni=""):
        self.__name = name
        self.__age = age
        self.__dni = dni

    def __val_name(self, name):
        regex = re.compile(r"^[a-zA-Z\s]{1,40}$")
        return re.match(regex, name)


    def __val_dni(self, dni):
        regex = re.compile(r"^\d{7,8}")
        if re.match(regex, dni):
            return True
        else:
            return False


    @property
    def name(self):
        return self.__name
    
    @name.setter
    def name(self, new_name):
        if self.__val_name(new_name):
            self.__name = new_name.strip().title()
        else:
            print(self.__val_name(new_name))
            print("Invalid name")

    @property
    def age(self):
        return self.__age
    
    @age.setter
    def age(self, new_age):
        if isinstance(new_age, int) and new_age >= 0:
            self.__age = new_age
        else:
            print("Invalid age")
        
    @property
    def dni(self):
        return self.__dni
    
    @dni.setter
    def dni(self, new_dni):
        if self.__val_dni(str(new_dni)):
            self.__dni = new_dni
        else:
            print("Invalid DNI")

    def __str__(self):
        return f"Name: {self.__name}\nAge: {self.__age}\nDNI: {self.__dni}"
    
    def is_adult(self):
        return self.age >= 18