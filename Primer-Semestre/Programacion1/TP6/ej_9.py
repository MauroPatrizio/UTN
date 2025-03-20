# 9.	Escribir un programa que simule el juego clásico de Memoria (Memotest) utilizando matrices. El juego consiste en un tablero de cartas boca abajo y el objetivo es encontrar todas las parejas de cartas iguales.
import validations
import random


rows = 4
columns = 4

cards = [1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8]

matched_cards = set()

def print_board(board, matched_cards):
    for i in range(len(board)):
        for j in range(len(board[i])):
            if (i,j) in matched_cards or board[i][j] == " ":
                print(board[i][j], end=" ")
            else:
                print("*", end=" ")
        print()
        
def create_board():
    board = []
    for _ in range(rows):
        row = []
        for _ in range(columns):
            card = cards.pop()
            row.append(card)
        board.append(row)
    return board

def is_par():
    while True:
        print_board(board, matched_cards)
        card1 = validations.numbers_4("Choose the first card (row column)): ")
        card2 = validations.numbers_4("Choose the second card (row column)): ")

        
        row1, col1 = card1[0], card1[1]
        row2, col2 = card2[0], card2[1]
        card1 = board[int(row1)][int(col1)]
        card2 = board[int(row2)][int(col2)]

        if card1 == card2:
            print("You found a match!")
            matched_cards.add((int(row1), int(col1)))
            matched_cards.add((int(row2), int(col2)))
        else:
            print("Is not a match")
        
        if len(matched_cards) == 16:
            print("You've found all the pairs!")
            break


#Main
random.shuffle(cards)
board = create_board()
print(board)
is_par()