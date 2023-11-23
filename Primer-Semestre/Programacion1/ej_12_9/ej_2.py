import random;

print("Bienvenidos a la ruleta rusa")
opt = True
while(opt):
    players = int(input("Enter the number of players (min 2 - max 6)(Enter 0 to exit): "))
    if players == 0:
        print("Goodbye")
        break
    elif ((players < 2) or (players > 6)):
        print("The number of players must be greater than 1 and lower than 7")
        continue
    else:
        names = []
        for player in range(players):
            names.append(input(f"Enter the player #{player+1} name: "))

    shots = players * 2;
    unlucky_shot = random.randint(1, shots)
    (1, shots)

    for shot in range(1,shots):
        attempt = input(f"{names[(shot-1)%players]}, when you are ready to shot press enter: ")
        if attempt == "":
            if shot == unlucky_shot:
                print(f"BANG, see you in hell {names[(shot-1)%players]}")
                break
            else:
                print("You're safe, this time...")


    while(True):
        again = input("Want to play again? (Y/N): ").upper()
        if again == "Y":
            opt = True
            break
        elif again == "N":
            opt = False
            break
        else:
            print("Your option is invalid")

