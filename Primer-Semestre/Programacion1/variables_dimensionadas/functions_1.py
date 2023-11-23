import validations

travelers = []
cities = []

def add_traveler():
    name = validations.only_text("Enter the traveler's name: ")
    dni = validations.only_numbers("Enter the traveler's dni: ")
    destination = validations.text_and_numbers("Enter the traveler's destination city: ")
    travelers.append((name, dni, destination))
    if destination not in [city[0] for city in cities]:
        print("The destination city is not in our list, please add it")
        add_city()

def add_city():
    city = validations.text_and_numbers("Enter the name of the city you want to add: ")
    country = validations.only_text("Enter the name of the country it belongs: ")
    cities.append((city, country))

def find_city_by_dni():
    dni = validations.only_numbers("Enter your dni: ")
    for traveler in travelers:
        if dni == traveler[1]:
            print(f"{traveler[0]} is traveling to {traveler[2]}")
            return
    print("Traveler's dni not found")
    
def count_travelers_by_city():
    destination = validations.text_and_numbers("Enter the traveler's destination city: ")
    count = 0
    for traveler in travelers:
        if traveler[2] == destination:
            count +=1
    print(f"The number of travelers to {destination} is {count}")
    
def find_country_by_dni():
    dni = validations.only_numbers("Enter the traveler's dni: ")
    for traveler in travelers:
        if dni == traveler[1]:
            for city in cities:
                if traveler[2] == city[0]:
                    print(f"{traveler[0]} is traveling to {city[1]}")
                    return 
        else:     
            print("Traveler's dni not found")

def count_travelers_by_country():
    destination = validations.text_and_numbers("Enter the traveler's destination country: ")
    count = 0
    for city in cities:
        if city[1] == destination:
            for traveler in travelers:
                if city[0] == traveler[2]:
                    count +=1
    print(f"The number of travelers to {destination} is {count}")
