from BaseFilter import BaseFilter


class PriceFilter(BaseFilter):
    def filter(self):
        min_price = input('Введите минимальную цену: ')
        max_price = input('Введите максимальную цену: ')
        price = [min_price, max_price]
        return price

    def price_filter(self):
        self.filter()
