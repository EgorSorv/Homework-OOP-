from hw7.Filter.ModelFilter import ModelFilter
from hw7.Filter.RamFilter import RamFilter
from hw7.Filter.OsFilter import OsFilter
from hw7.Filter.DriveFilter import DriveFilter
from hw7.Filter.CapacityFilter import CapacityFilter
from hw7.Filter.PriceFilter import PriceFilter
from hw7.Sort.SortedSet import SortedSet


class Input:
    def input(self, set_list):
        key = input("""
                Введите критерий для фильтрации:\n
                1 - Модель\n
                2 - Объем оперативной памяти\n
                3 - Операционная система\n
                4 - Тип диска\n
                5 - Объем диска\n
                6 - Цена\n
                7 - Завершить\n
                """)

        query = {}

        while key != 7:
            match key:
                case 1:
                    query['model'] = ModelFilter.model_filter
                case 2:
                    query['ram'] = RamFilter.ram_filter
                case 3:
                    query['os'] = OsFilter.os_filter
                case 4:
                    query['drive'] = DriveFilter.drive_type_filter
                case 5:
                    query['capacity'] = CapacityFilter.drive_capacity_filter
                case 6:
                    query['price'] = PriceFilter.price_filter

            key = input("""
                            Введите критерий для фильтрации:\n
                            1 - Модель\n
                            2 - Объем оперативной памяти\n
                            3 - Операционная система\n
                            4 - Тип диска\n
                            5 - Объем диска\n
                            6 - Цена\n
                            7 - Завершить\n
                            """)

            sorted_set(query)
