from abc import ABCMeta, abstractmethod


class BaseFilter:
    __metaclass__ = ABCMeta

    @abstractmethod
    def filter(self):
        pass
