'''3.	Desarrollar un programa que cargue los datos de un triángulo. Implementar una clase con los métodos para inicializar los atributos, imprimir el valor del lado con un tamaño mayor y  el tipo de triángulo que es (equilátero, isósceles o escaleno).'''

class Triangle:
    def __init__(self, side1, side2, side3):
        self.__side1 = side1
        self.__side2 = side2
        self.__side3 = side3


    def greater_side(self):
        return max(self.__side1, self.__side2, self.__side3)

    def triangle_type(self):
        if self.__side1 == self.__side2 == self.__side3:
            return "Equilateral"
        elif self.__side1 == self.__side2 or self.__side1 == self.__side3 or self.__side2== self.__side3:
            return "Isosceles"
        else:
            return "Scalene"
        
    