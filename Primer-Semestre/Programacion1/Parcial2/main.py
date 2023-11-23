import dna

while True:
    opt = input("Enter 1 to check your dna, enter 0 to quit: ")
    if opt == "1":
        dna_matrix = dna.fill_dna_matrix()
        dna.show_dna_matrix(dna_matrix)
        print("Who is a bad mutant?\n Yes, you are UwU" if dna.is_mutant(dna_matrix) else "You are a muggle! Oh sry, wrong movie, but you still have no power at all")
    elif opt == "0":
        print("Exiting the program, good bye")
        break
    else:
        print("Invalid input")

# atgcga cagtgc ttattt agacgg gcgtca tcactg No Mutante

# atgcaa ccgtgc ttatgt agaagg ccccta tcactg Mutante Horizontal

# ttgcga cagtgc ttatgt agaagg acccta tcactg Mutante Vertical

# atgcta cagtgc ttatgt agaagg acccta tcactg Mutante Diagonal

# ttgcga caggtc ttgtat agaatg cccgta tcactg Mutante diagonal inversa