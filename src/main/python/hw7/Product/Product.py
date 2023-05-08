from abc import ABCMeta, abstractmethod


class Product:
    __metaclass__ = ABCMeta

    @abstractmethod
    def get_name(self):
        pass

    @abstractmethod
    def set_name(self, name):
        pass

    @abstractmethod
    def get_price(self):
        pass

    @abstractmethod
    def set_price(self, price):
        pass
