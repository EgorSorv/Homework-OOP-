from BaseFilter import BaseFilter


class RamFilter(BaseFilter):
    def filter(self):
        return input('Введите необходимый объем оперативной памяти: ')

    def ram_filter(self):
        self.filter()
