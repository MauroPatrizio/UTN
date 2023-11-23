import re

def val_numbers(text):
    regex = re.compile(r'^\d+$')
    return re.match(regex, text)

def only_numbers(text):
    while True:
        numb = input(text).strip()
        if val_numbers(numb):
            return int(numb)
        else:
            print("Invalid input")

def val_paper(text):
    regex = re.compile(r'^(10|[0-9])$')
    return re.match(regex, text)

def size(text):
    while True:
        numb = input(text).strip()
        if val_paper(numb):
            return int(numb)
        else:
            print("Invalid input")
