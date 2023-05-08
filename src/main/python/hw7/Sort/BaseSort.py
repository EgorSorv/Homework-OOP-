from abc import ABCMeta, abstractmethod


class BaseSort:
    __metaclass__ = ABCMeta

    @abstractmethod
    def sort(self, parameter, set_list, set_sorted):
        pass
