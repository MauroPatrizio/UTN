def most(x,y):
    if(x>y):
        return x
    else:
        return y
    
def least(x,y):
    if(x<y):
        return x
    else:
        return y
    
#PROGRAMA PRINCIPAL

x = int(input("Un número: "))
y = int(int(input("Otro número: ")))

print(most(x-3, least(x+2, y-5)))