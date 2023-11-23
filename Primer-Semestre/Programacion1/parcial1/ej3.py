while(True):
    name = input("Enter your name: ").strip().title()
    if name == "":
        print("The name was empty, is invalid")
        continue
    else:
        name = name.split()
        name = " ".join(name)
        print(f"Hello {name}")
        break
while (True):
    option = input("Enter 1 to play a Number Game\nEnter 2 to play a Word Game\nEnter 0 to Exit: ")
    
    if option == "0":
        print(f"Goodbye {name}")
        break

    elif option == "1":
        numbers = []
        while(True):
            number = input(f"{name}, enter an integer number (Enter 0 to exit): ").strip()
            if(number == "0"):
                break
            elif(number == ""):
                continue
            else:
                numbers.append(int(number))
        even = []
        odd = []
        for number in numbers:
            if number % 2 == 0:
                even.append(number)
            else:
                odd.append(number)
        if len(even)== 0:
            print(f"{name}, there is no even numbers")
        else:
            print(f"{name}, the largest even number is {max(even)}")

        if len(odd)== 0:
            print(f"{name}, there is no odd numbers")
        else:
            print(f"{name}, the average of the odd numbers is {sum(odd)/len(odd)}")


    elif(option=="2"):
        while(True):
            sentence = input(f"{name}, enter a sentence: ").lower().strip()
            if(sentence == ""):
                print(f"{name}, youor sentence was empty")
                continue
            else:
                a = 0
                e = 0
                i = 0
                o = 0
                u = 0

                for letter in sentence:
                    if letter == "a":
                        a += 1
                    elif letter == "e":
                        e += 1
                    elif letter == "i":
                        i += 1
                    elif letter == "o":
                        o += 1
                    elif letter == "u":
                        u += 1

                print(f"Count of a: {a}")
                print(f"Count of e: {e}")
                print(f"Count of i: {i}")
                print(f"Count of o: {i}")
                print(f"Count of u: {u}")
                break

    else:
        print(f"{name}, your option is invalid")