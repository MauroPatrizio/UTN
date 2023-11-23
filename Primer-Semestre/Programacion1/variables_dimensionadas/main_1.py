import functions_1

while (True):
    print("1 to add a traveler")
    print("2 to add a city")
    print("3 to find the destination city by dni")
    print("4 to count travelers to city")
    print("5 to find country by dni")
    print("6 to count passengers to country")
    print("Q to quit")
    option = input("Select an option: ").upper()

    if option == "1":
        functions_1.add_traveler()
        print()
    elif option == "2":
        functions_1.add_city()
        print()
    elif option == "3":
        functions_1.find_city_by_dni()
        print()
    elif option == "4":
        functions_1.count_travelers_by_city()
        print()
    elif option == "5":
        functions_1.find_country_by_dni()
        print()
    elif option == "6":
        functions_1.count_travelers_by_country()
        print()
    elif option == "Q":
        break
    else:
        print("Invalid input")
        print()