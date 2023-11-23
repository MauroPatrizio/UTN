from Person import Person
from Account import Account
from Triangle import Triangle
from Agenda import Agenda

person1 = Person("Mauro Patrizio", 33, 35076871)

print(person1)
person1.name = "  sdfas  dsfg fdg fdsgdfgsdfg         " 
person1.dni = 34141414
person1.age = 13
print(person1)
print(person1.is_adult())
print()

acc1 = Account("Mauro Coso")
print(acc1)
acc1.deposit(1500)
print(acc1)
acc1.withdraw(7000)
print(acc1)
print()

triangle1 = Triangle(12,3,5)
print(triangle1.greater_side())
print(triangle1.triangle_type())
print()

agenda1 = Agenda()

agenda1.menu()