#1
x = 0
while(x<= 30):
    if x == 15:
        print(f'The execution of the loop was broken when x was {x}')
        break
    elif (x == 4 or x == 6 or x == 10):
        print(f'The value {x} of x was skipped')
    else:
        print(f"The value of x is: {x}")
    x+=1

#1.2
array = []
while(True):
    line = (input("Escriba una línea: ")).upper()
    if line == "":
        print("\n".join(array))
        break
    else:
        array.append(line)
    
#2
amount = 0
while(True):
    transaction = input("Enter your transaction: ")
    if transaction== "":
        break
    else:
        transaction = transaction.split(" ")
        if (transaction[0].upper() == "D"):
            amount += int(transaction[1])
        elif (transaction[0].upper() == "R" and amount >= int(transaction[1])):
            amount -= int(transaction[1])
        elif (transaction[0].upper() == "R" and amount < int(transaction[1])):
            print("You don't have enough money")
            
print(amount)

#3
qty = 0
while(True):
    number = int(input("Enter a number greater than 1 (Enter 0 to exit): "))
    if number == 0:
        print(f"You have entered {qty} prime numbers")
        break
    elif number <= 1:
        print("The number must be greater than 1")
    elif number == 2 or number == 3:
        qty+=1
    elif number%2 != 0 and number%3 != 0:
        qty+=1

#4
start_year = int(input("Enter the starting year: "))
end_year = int(input("Enter the ending year: "))

for year in range(start_year, end_year + 1):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        if year % 10 == 0:
            print(year)

#5
for i in range(1, 21):
    if i % 2 != 0:
        continue
    print(i)

#6
numbers = list(range(1))
target = int(input("Enter a positive number: "))
found = False
for i in numbers:
    if i == target:
        found = True
        break
if found == True:
    print("The number was found in the list")
else :
    print("The number was not found in the list")

#7

while (True):
    print("1: Atumn")
    print("2: Winter")
    print("3: Spring")
    print("4: Summer")
    print("0: Exit")
    
    choice = input("Select an option: ")

    if choice == "1":
        print("You chose Autumn")
    elif choice == "2":
        print("You chose Winter")
    elif choice == "3":
        print("You chose Spring")
    elif choice == "4":
        print("You chose Summer")
    elif choice == "0":
        break
    else:
        print("Invalid input, please select a valid season")
