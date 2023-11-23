class Bike:
    
    new = True
    engine = False

    
    def __init__(self, color = "", enrollment = "", fuel_lt = 0, wheels = 0, brand= "", model = "", production_date = "", speed_peak = 0, weight= 0 ):
        self.color = color
        self.enrollment = enrollment
        self.fuel_lt = fuel_lt
        self.wheels = wheels
        self.brand = brand
        self.model = model
        self.production_date = production_date
        self.speed_peak = speed_peak
        self.weight = weight
    
    def start_engine(self):
        if self.engine:
            print("The engine is already started")
        else:
            print("The engine has started")
            self.engine = True

    def stop_engine(self):
        if self.engine:
            print("The engine has stopped")
            self.engine == True
        else:
            print("The engine is already stopped")

    def check_price(self):
        print(f"The price of the bike {self.brand} {self.model} is {self.price}")