import random
    
words = ["computer","algorithm","loop","variable","object","class","compiler","library","integer"]

#Randomize a word
def choose_random_word(word):
    return random.choice(words)


#Setting underscores in hidden word
def print_initial_hidden_word(word):
    return ["_" for _ in word]

#Prints the hidden word
def print_hidden_word (hidden_word):
    print ("".join(hidden_word))

#Word Game
def word_game():
    secret_word = choose_random_word(words)
    hidden_word = print_initial_hidden_word(secret_word)
    word_length = len(secret_word)
        
    #Setting number of attempts
    attempts = 6

    #Loop to control attempts
    while(attempts != 0):
        print_hidden_word(hidden_word)

        letter = input("Enter a letter: ").lower()

        if (len(letter) != 1):
            print("You must enter a single letter")
        else:
            if letter in secret_word:
                print("Nice guess!")
                for index in range(word_length):
                    if secret_word[index] == letter:
                        hidden_word[index] = letter
                        if secret_word == "".join(hidden_word):
                            print("You won this game! Good bye")
                            attempts = 0
            else:
                attempts-=1
                if attempts > 0:
                    print(f"The letter '{letter}' is not in this word, you have {attempts} more attempts")
                else:
                    print("You don't have any more attempts, good luck next time!")

#Main Loop
while(True):
    word_game()
    again = input("Do you want to play again? (Y/N): ").upper()
    if again == "N":
        print("Good Bye!")
        break;
    elif again == "Y":
        continue
    else:
        print("Invalid answer")