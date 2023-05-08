from hw7.Sort.BaseSort import BaseSort


class ModelSorted(BaseSort):
    def sort(self, parameter, set_list, set_sorted):
        for item in set_list:
            if item.get_model() == parameter:
                set_sorted.add(item)

        return set_sorted

    def model_sort(self, parameter, set_list, set_sorted):
        self.sort(parameter, set_list, set_sorted)
