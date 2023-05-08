from hw7.Sort.BaseSort import BaseSort


class DriveSorted(BaseSort):
    def sort(self, parameter, set_list, set_sorted):
        if not set_sorted:
            for item in set_list:
                if item.get_drive_type() == parameter:
                    set_sorted.add(item)
        else:
            old_set = set_sorted
            set_sorted.clear()
            temporary_set = set()

            for item in set_list:
                if item.get_drive_type() == parameter:
                    temporary_set.add(item)
            set_sorted = (item for item in old_set if item in temporary_set)
            return set_sorted

    def drive_sort(self, parameter, set_list, set_sorted):
        self.sort(parameter, set_list, set_sorted)