from BaseFilter import BaseFilter


class ModelFilter(BaseFilter):
    def filter(self):
        model = input('Введите подходящую модель ноутбука (1 - Samsung, 2 - HP, 3 - Acer, 4 - ASUS, ' +
                      '5 - Apple, 6 - HUAWEI, 7 - Lenovo, 8 - MSI): ')

        match model:
            case 1:
                return 'Samsung'
            case 2:
                return 'HP'
            case 3:
                return 'Acer'
            case 4:
                return 'ASUS'
            case 5:
                return 'Apple'
            case 6:
                return 'HUAWEI'
            case 7:
                return 'Lenovo'
            case 8:
                return 'MSI'
            case _:
                return None

    def model_filter(self):
        self.filter()
