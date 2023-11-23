'''4.	Realizar una clase que administre una agenda. Se debe almacenar para cada contacto el nombre, el teléfono y el email. Además deberá mostrar un menú con las siguientes opciones:
•	Añadir contacto
•	Lista de contactos
•	Buscar contacto
•	Editar contacto
•	Cerrar agenda
'''

import re

class Agenda:

    def __init__(self):
        self.__contacts = []

    def val_name(self, name):
        regex = re.compile(r"^[\w\s]{1,30}$")
        return re.match(regex, name)
    
    def loop_name(self, text):
        while True:
            string = input(text).title().strip()
            if self.val_name(string):
                return string
            else:
                print("Invalid contact name")
        
    def val_tel(self, tel):
        regex = re.compile(r"^\d{10}$")
        return re.match(regex, tel)
    
    def loop_tel(self, text):
        while True:
            num = input(text).strip()
            if self.val_tel(num):
                return num
            else:
                print("The number must have 10 digits")

    def val_email(self, email):
        regex = re.compile(r'([A-Za-z0-9]+[.-_])*[A-Za-z0-9]+@[A-Za-z0-9-]+(\.[A-Z|a-z]{2,})+')
        return re.match(regex, email)
    
    def loop_email(self, text):
        while True:
            email = input(text.strip().lower())
            if self.val_email(email):
                return email
            else:
                print("Invalid input")

    def add_contact(self, name, tel, email):
        self.__contacts.append({"Name": name, "Tel": tel, "Email": email})

    def show_contacts(self):
        for contact in self.__contacts:
            for dict in contact:
                value = contact[dict]
                print(f"{dict}: {value}", end=" ")
            print()


    def find_contact(self, name):
        for contact in self.__contacts:
            if contact["Name"] == name:
                print(f"Contact found: {contact['Name']}, {contact['Tel']}, {contact['Email']}")
                return contact
        print("Contact not found")
        return None
        

    def edit_contact(self, name, phone, email):
        for contact in self.__contacts:
            if contact["Name"] == name:
                contact["Tel"] = phone
                contact["Email"] = email
                break
        else:
            print("Contact not founded")

        

    def menu(self):

        while True:
            print("1 to add a contact")
            print("2 to watch your contact list")
            print("3 to search for a contact")
            print("4 to edit a contact")
            print("5 to close agenda: ")
            opt = input("Enter your option: ")

            if opt == "1":
                name = self.loop_name("Enter the name of the contact: ")
                tel = self.loop_tel("Enter the telephone of the contact (10 digits): ")
                email = self.loop_email("Enter the email of the contact: ")
                self.add_contact(name, tel, email)
                print()
            
            elif opt == "2":
                self.show_contacts()
                print()

            elif opt == "3":
                name = self.loop_name("Enter the name of the contact you are looking for: ")
                self.find_contact(name)
                print()

            elif opt == "4":
                name = self.loop_name("Enter the name of the contact you wanna edit: ")
                phone = self.loop_tel("Enter the new phone number of the contact: ")
                email = self.loop_email("Enter the new email of the contact: ")
                self.edit_contact(name, phone, email)
                print()

            elif opt == "5":
                print("Closing agenda, good bye")
                break

            else:
                print("Invalid input")
                print()