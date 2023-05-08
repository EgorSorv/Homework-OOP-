from hw7.Product.Product import Product


class Laptop(Product):
    name = ''
    model = ''
    ram = 0
    os = ''
    drive_type = ''
    drive_capacity = 0
    price = 0
    
    def __init__(self, name, model, ram, os, drive_type, drive_capacity, price):
        self.name = name
        self.model = model
        self.ram = ram
        self.os = os
        self.drive_type = drive_type
        self.drive_capacity = drive_capacity
        self.price = price

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_model(self):
        return self.model

    def set_model(self, model):
        self.model = model

    def get_ram(self):
        return self.ram

    def set_ram(self, ram):
        self.ram = ram

    def get_os(self):
        return self.os

    def set_os(self, os):
        self.os = os

    def get_drive_type(self):
        return self.drive_type

    def set_drive_type(self, drive_type):
        self.drive_type = drive_type

    def get_drive_capacity(self):
        return self.drive_capacity

    def set_drive_capacity(self, drive_capacity):
        self.drive_capacity = drive_capacity

    def get_price(self):
        return self.price

    def set_price(self, price):
        self.price = price

    def __str__(self):
        laptop = ''
        laptop += f'Ноутбук: {self.name}, '
        laptop += f'модель: {self.model}, '
        laptop += f'количество оперативной памяти: {self.ram}, '
        laptop += f'операционная система: {self.os}, '
        laptop += f'тип диска: {self.drive_type}, '
        laptop += f'объем диска: {self.drive_capacity}, '
        laptop += f'цена: {self.price}'
        return laptop
