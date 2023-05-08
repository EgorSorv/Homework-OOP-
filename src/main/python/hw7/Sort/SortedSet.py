from ModelSorted import ModelSorted
from RamSorted import RamSorted
from OsSorted import OsSorted
from DriveSorted import DriveSorted
from CapacitySorted import CapacitySorted
from PriceSorted import PriceSorted
from hw7.Terminal.PrintLaptopList import print_set


def sorted_set(set_list, map_query):
    set_sorted = set()
    if 'model' in map_query:
        set_sorted = ModelSorted.model_sort(map_query.get('model'), set_list, set_sorted)
    if 'ram' in map_query:
        set_sorted = RamSorted.ram_sort(map_query.get('ram'), set_list, set_sorted)
    if 'os' in map_query:
        set_sorted = OsSorted.os_sort(map_query.get('os'), set_list, set_sorted)
    if 'drive' in map_query:
        set_sorted = DriveSorted.drive_sort(map_query.get('drive'), set_list, set_sorted)
    if 'capacity' in map_query:
        set_sorted = CapacitySorted.capacity_sort(map_query.get('capacity'), set_list, set_sorted)
    if 'price' in map_query:
        set_sorted = PriceSorted.price_sort(map_query.get('price'), set_list, set_sorted)

    if not set_sorted and not map_query:
        print_set(set_list)
    elif not set_sorted:
        print('Не найдено ноутбуков, удовлетворяющих заданным условиям')
    else:
        print_set(set_sorted)
