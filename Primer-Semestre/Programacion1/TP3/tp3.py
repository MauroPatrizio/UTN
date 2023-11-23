# #1
word = input("Enter a word: ")
for i in range(10):
    print(word)

#2
age = int(input("Enter your age: "))
for i in range(age):
    i+=1
    print(i)

#3
number = int(input("Enter a positive integer number: "))
if number < 0:
    print("The number must be positive")
else:
    array = []
    for i in range(number):
        if i % 2 != 0:
            array.append(str(i))
    print(", ".join(array))

#4
number = int(input("Enter a positive integer number: "))
if number < 1:
    print("The number must be positive")
else:
    array = []
    for i in range(number+1):
        array.insert(0,str(i))
    print(", ".join(array))

#5
initial_investment = float(input("Enter the initial investment amount: "))
annual_rate = float(input("Enter the annual interest rate: "))
years = int(input("Enter the investment duration in years: "))

amount = initial_investment
total_interest = 0
for i in range(years):
    year_interest = amount*(annual_rate/100)
    total_interest += year_interest
    amount += year_interest
    print(f"Your interest earned over this year: {round(year_interest, 2)}, your total amount: {round(amount,2)}")
print(f"Your interest earned over this {years} years: {round(total_interest,2)}, your final total amount: {round(amount,2)}")

#6
number = int(input("Enter a positive integer number: "))
if number < 0:
    print("The number must be positive")
else:
    for i in range(number):
        print("*"*(i+1))

7
for i in range(11):
    for j in range(11):
        print(f"{i} * {j} = {i*j}")

#8
number = int(input("Enter a positive integer number: "))
if number < 0:
    print("The number must be positive")
else:
    array = []
    for i in range(number):
            if i%2 !=0:
                array.append(str(i))
                print("".join(array[::-1]))

#9
password = input("Enter your password: ")
check = False
while(check == False):
    check = input("Enter your password: ") == password
print("Correct password")

#10
number = int(input("Enter a positive integer number: "))
if number < 0:
    print("The number must be positive")
elif number == 2 or number == 3:
    print("Is a prime number")
elif number%2 == 0 or number%3 == 0:
    print("Is not a prime number")
else:
    print("Is a prime number")

#11
word = input("Enter a word: ")
word = word[::-1]
for i in word:
    print(i)

#12
sentence = input("Enter a sentence: ").lower()
letter = input("Enter a single letter: ").lower()

print(f"The letter {letter} appears {sentence.count(letter)} times in the sentence")

#13

while (True):
    word = input('Enter a word (Enter "salir" to exit): ').lower()
    if word == "salir":
        break
    else:
        print(word)

#14
num1 = int(input("Enter the first integer number: "))
num2 = int(input("Enter the second integer number: "))

for i in range(num1,num2+1):
    print(f"{i} is even" if i%2 == 0 else f"{i} is odd")

#15
number = int(input("Enter a positive integer number (greater than 0): "))

for i in range(1,number+1):
    if number%i==0:
        print(i)

#16
num_count = int(input("Enter the number of numbers you will input: "))
neg_count = 0

for i in range(num_count):
    num = int(input(f"Enter the number #{i+1}: "))
    if num < 0:
        neg_count += 1

print(f"Yo've entered {neg_count} negative numbers")

#17
sentence = input("Enter a sentence: ").lower()
VOWELS = ("a", "e", "i", "o", "u")
vowels_in_sentence = set()
for i in sentence:
    if i in VOWELS:
        vowels_in_sentence.add(i)
print(sorted(vowels_in_sentence))

#18
def fibonacci(num):
    if num <= 0:
        return []
    elif num == 1:
        return [0]
    else:
    
        fib = [0,1]
        for i in range(2,num):
            next_fib = fib[-1] + fib[-2]
            fib.append(next_fib)
        return fib

print(f"The first 10 numbers of Fibonacci: {fibonacci(10)}")

#19
goal = float(input("Enter the amount of money you want to save: "))
if goal <= 0:
    print("The amount must be positive")
else:
    amount = 0
    while(amount<goal):
        amount += float(input(f"Your current amount of money is {amount:.2f}, enter the amount you want to save: "))
    
    print("You reached your goal")

#20
total = 0
while(True):
    number = int(input("Enter an integer number (Enter 0 to exit): "))
    if number != 0:
        total += number
    else:
        print(f"The sum of all the entered numbers is: {total}")
        break

#21
greater_num = 0
while (True):
    number = int(input("Enter an integer number (Enter 0 to exit): "))
    if number == 0:
        print(f"The greater number is: {greater_num}")
        break
    else:
        greater_num = max(greater_num,number)
        
#22
even = 0
while(True):
    number = int(input("Enter a positive integer number (Enter -1 to exit): "))
    if number == -1:
        print(f"The amount of even numbers is: {even}")
        break
    elif number%2 == 0:
        even +=1

#23
total = 0
while (True):
    amount = float(input("Enter an integer number (Enter 0 to exit): "))
    if amount < 0:
        continue
    elif amount == 0:
        if total >= 1000:
            total -= total*0.1
        print(f"The total amount of purchases is: {total}")
        break
    else:
        total += amount

#24
# Lo junté con el 23, me parecía que era parte del ejercicio anterior

#25
number = int(input("Enter a positive integer: "))
def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num-1)

if number < 0:
    print("The number must be positive")
else:
    print(factorial(number))

