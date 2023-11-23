def get_address(purchases):
    result = set()
    for purchase in list:
        customer, dia, amount, address = purchase
        result.add(address)
    return result

list = [("Nuria Costa", 5, 1234.5,"Calle 1 – 456"), ("Jorge Russo", 7, 3999, "Calle 2 – 741")]

print(get_address(list))