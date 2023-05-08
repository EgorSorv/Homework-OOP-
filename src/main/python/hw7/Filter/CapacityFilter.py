from BaseFilter import BaseFilter


class CapacityFilter(BaseFilter):
    def filter(self):
        return input('Введите необходимый объем диска: ')

    def drive_capacity_filter(self):
        self.filter()
