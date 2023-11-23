import re

#Validates the String to have 6 chars with the letter A,T,C,G
def re_dna(adn):
    regex = re.compile(r'^[A,T,C,G]{6}$')
    return re.match(regex, adn)

def val_dna(text):
       while True:
        string = input(text).upper().strip()
        if re_dna(string):
            return string
        else:
            print("Invalid dna, try again")

#Fill the 6*6 matrix
def fill_dna_matrix():
        dna_matrix = []
        for i in range(6):
               dna_matrix.append(val_dna(f"Enter the {i+1} string of 6 DNA letters (Only A,T,C,G are valid, without spaces or characters between): "))
        return dna_matrix

#Show the matrix
def show_dna_matrix(dna):
    for row in dna:
        for letter in row:
            print(letter, end= " ")
        print()

#Look for mutant dna and returns a boolean
def is_mutant(dna):
    mutant = False
    
    for row in range(5):
        for col in range(5):

            #Loop for horizontal line match
            if col <= 2:
                mutant = True
                for aux in range(1,4):
                    mutant = mutant and (dna[row][col] == dna[row][col+aux])
            if mutant:
                return mutant

            #Loop for vertical line match
            if row <= 2:
                mutant = True
                for aux in range(1,4):
                    mutant = mutant and (dna[row][col] == dna[row+aux][col])
            if mutant:
                return mutant

            #Loop for diagonal line match
            if row <=2 and col <=2:
                mutant = True
                for aux in range(1,4):
                    mutant = mutant and (dna[row][col] == dna[row+aux][col+aux])
            if mutant:
                return mutant
            
            #Loop for inverse diagonal
            if row <=2 and col >= 3:
                mutant= True
                for aux in range(1,4):
                    mutant = mutant and (dna[row][col] == dna[row+aux][col-aux])
            if mutant: 
                return mutant
            
    return mutant
