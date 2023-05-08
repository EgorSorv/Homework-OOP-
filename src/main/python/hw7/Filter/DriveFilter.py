from BaseFilter import BaseFilter


class DriveFilter(BaseFilter):
    def filter(self):
        drive = input('Введите необходимый тип диска (1 - HDD или 2 - SSD):')

        match drive:
            case 1:
                return 'HDD'
            case 2:
                return 'SSD'
            case _:
                return None

    def drive_type_filter(self):
        self.filter()
