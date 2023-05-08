from BaseFilter import BaseFilter


class OsFilter(BaseFilter):
    def filter(self):
        os = input('Введите подходящую операционную систему (1 - Windows, 2 - Linux, 3 - MacOS): ')

        match os:
            case 1:
                return 'Windows'
            case 2:
                return 'Linux'
            case 3:
                return 'MacOS'
            case _:
                return None

    def os_filter(self):
        self.filter()
