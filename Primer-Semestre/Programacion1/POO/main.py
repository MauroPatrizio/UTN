from Bike import Bike

my_bike = Bike("Black", "zzz111", 10, 2, "Yamaha", "YZ", "2023", 200, 100)
my_bike2 = Bike("Red", "ttt111", 10, 2, "Yamaha", "ll", "2023", 200, 100)

my_bike.stop_engine()
my_bike.start_engine()
my_bike.start_engine()
my_bike.stop_engine()

my_bike.price = 2000

print(f"The price of the bike {my_bike.brand} {my_bike.model} is {my_bike.price}")

my_bike.check_price()
my_bike2.check_price()