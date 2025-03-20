import validations

members = {
    1: {"name": "Amanda Núñez", "join_date": "17032009", "fee_up_to_date": True},
    2: {"name": "Lautaro Campos", "join_date": "17032009", "fee_up_to_date": True},
    3: {"name": "Bárbara Molina", "join_date": "17032009", "fee_up_to_date": True},
}

member_id = 3

#1
def add_member():
    global member_id
    member_id += 1
    name = validations.only_text("Enter the name of the new member: ")
    join_date = validations.only_numbers("Enter the join date of the new member (ddmmaaaa): ")
    while True:
        fee_up_to_date = input("Is the fee up to date? (Y/N): ").upper()
        if fee_up_to_date == "Y":
            fee_up_to_date = True
            break
        elif fee_up_to_date == "N":
            fee_up_to_date = False
            break
        else:
            print("Invalid input")
    
    members[member_id] = {
        "name" : name,
        "join_date" : join_date,
        "fee_up_to_date" : fee_up_to_date        
    }

    print(members[member_id])

#2
def number_members():
    print(f"The number of members is {len(members)}")

#3
def has_paid(id):
    if id in members:
        members[id]["fee_up_to_date"] = True
        print("Payment successful")
        print(members[id])
    else:
        print("Id not found")

#4
def modify_join_date(id):
    if id in members:
        members[id]["join_date"] = validations.only_numbers(f"Enter the join date of the member {id} (ddmmaaaa): ")
        print("Join date modify successfully")
    else:
        print("Id not found")
    print(members[id])

#5
def remove_member(id):
    if id in members:
        name = members[id]["name"]
        while True:
            remove = input(f"The member with id {id} is {name}, you still want to remove this member? (Y/N): ").upper()
            if remove == "Y":
                del members[id]
                print(f"The member {name} has been removed")
                break
            if remove == "N":
                break
            else:
                print("Invalid input")
    else:
        print("Id not found")

#6
def print_members():
    for id, member in members.items():
        print(f"ID: {id}, {member['name']}, join date: {member['join_date']} ")



while True:
    print("1 to add a new member")
    print("2 to report the number of members")
    print("3 to record if a member has paid the club fee")
    print("4 to modify the join date of a member")
    print("5 to remove a member")
    print("6 to print the complete list of members")
    print("Q to quit")

    option = input("Enter your option: ").upper()

    if option == "1":
        add_member()
        print("")

    elif option == "2":
        number_members()
        print("")

    elif option == "3":
        id = int(validations.only_numbers("Enter the id of the member who has paid: ")) 
        has_paid(id)
        print("")
    
    elif option == "4":
        id = int(validations.only_numbers("Enter the id of the member who want to modify the join date: "))
        modify_join_date(id)
        print("")

    elif option == "5":
        id = int(validations.only_numbers("Enter the id of the member you want to remove: "))
        remove_member(id)
        print("")

    elif option == "6":
        print_members()
        print("")
    
    elif option == "Q":
        print("Shutting down, good bye!")
        break

    else:
        print("Invalid input")
        print("")