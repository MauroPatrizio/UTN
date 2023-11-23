'''2.	Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). El titular será obligatorio y la cantidad es opcional. Construye los siguientes métodos para la clase:
•	Un constructor, donde los datos pueden estar vacíos.
•	Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
•	mostrar(): Muestra los datos de la cuenta.
•	ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
•	retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
'''
import re

class Account:

    def __init__(self, holder="", amount = 0.0):
        self.__holder = holder
        self.__amount = amount

    def val_holder(self, holder):
        regex = re.compile(r"^[a-zA-Z\s]{3,40}$")
        return re.match(regex, holder)

    def val_deposit(self, amount):
        regex = re.compile(r'^\d+(\.\d{1,2})?$')
        return re.match(regex, amount)
    
    @property
    def holder(self):
        return self.__holder
    
    @holder.setter
    def holder(self, holder):
        if self.val_holder(holder):
            self.__holder = holder.strip().title()
        else:
            print("Invalid holder name")

    @property
    def amount(self):
        return self.__holder
    
    def __str__(self):
        return f"Holder: {self.__holder}, Balance: {self.__amount}"
    
    def deposit(self, amount):
        if self.val_deposit(str(amount)) and amount>0:
            self.__amount += amount
        else:
            print("Invalid amount")

    def withdraw(self, amount):
        if self.val_deposit(str(amount)):
            self.__amount -= amount
        else:
            print("Invalid amount")