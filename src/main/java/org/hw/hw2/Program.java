package org.hw.hw2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program extends SortedLaptop implements PrintLaptopList {
    protected static void program(Set<Laptop> set) {
        System.out.println("""
                Введите критерий для фильтрации:\s
                1 - Модель\s
                2 - Объем оперативной памяти\s
                3 - Операционная система\s
                4 - Тип диска\s
                5 - Объем диска\s
                6 - Цена\s
                7 - Завершить\s
                """);

        Map<String, String> query = new HashMap<>();

        int key = sc.nextInt();

        while (key != 7) {
            switch (key) {
                case (1) -> query.put("model", LaptopFilter.modelFilter());
                case (2) -> query.put("ram", LaptopFilter.ramFilter());
                case (3) -> query.put("os", LaptopFilter.osFilter());
                case (4) -> query.put("drive", LaptopFilter.driveTypeFilter());
                case (5) -> query.put("capacity", LaptopFilter.driveCapacityFilter());
                case (6) -> {
                    query.put("min price", LaptopFilter.minPriceFilter());
                    query.put("max price", LaptopFilter.maxPriceFilter());
                }
            }

            System.out.println("""
                Введите критерий для фильтрации:\s
                1 - Модель\s
                2 - Объем оперативной памяти\s
                3 - Операционная система\s
                4 - Тип диска\s
                5 - Объем диска\s
                6 - Цена\s
                7 - Завершить\s
                """);

            key = sc.nextInt();
        }

        sortedSet(set, query);

        sc.close();
    }

    private static void sortedSet(Set<Laptop> set, Map<String, String> query) {

        Set<Laptop> setSorted = new HashSet<>();

        if (query.containsKey("model")) modelSorted(query.get("model"), set, setSorted);
        if (query.containsKey("ram")) ramSorted(query.get("ram"), set, setSorted);
        if (query.containsKey("os")) osSorted(query.get("os"), set, setSorted);
        if (query.containsKey("drive")) driveSorted(query.get("drive"), set, setSorted);
        if (query.containsKey("capacity")) capacitySorted(query.get("capacity"), set, setSorted);
        if (query.containsKey("min price")) priceSorted(query.get("min price"), query.get("max price"), set, setSorted);

        if (setSorted.isEmpty() && query.isEmpty()) PrintLaptopList.printSet(set);
        else if (setSorted.isEmpty()) System.out.println("Не найдено ноутбуков, удовлетворяющих заданным условиям");
        else PrintLaptopList.printSet(setSorted);
    }
}
