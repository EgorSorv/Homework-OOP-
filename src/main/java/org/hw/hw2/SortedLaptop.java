package org.hw.hw2;

import java.util.HashSet;
import java.util.Set;

public class SortedLaptop implements LaptopFilter {

    protected static void modelSorted(String model, Set<Laptop> set, Set<Laptop> setSorted) {
        for (Laptop item: set) {
            if (item.getModel().contains(model)) setSorted.add(item);
        }
    }

    protected static void ramSorted(String ram, Set<Laptop> set, Set<Laptop> setSorted) {
        int number = Integer.parseInt(ram);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getRam() == number) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getRam() == number) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    protected static void osSorted(String os, Set<Laptop> set, Set<Laptop> setSorted) {
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getOs().contains(os)) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getOs().contains(os)) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    protected static void driveSorted(String drive, Set<Laptop> set, Set<Laptop> setSorted) {
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getDriveType().contains(drive)) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getDriveType().contains(drive)) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    protected static void capacitySorted(String capacity, Set<Laptop> set, Set<Laptop> setSorted) {
        int number = Integer.parseInt(capacity);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (item.getDriveCapacity() == number) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (item.getDriveCapacity() == number) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }

    protected static void priceSorted(String min, String max, Set<Laptop> set, Set<Laptop> setSorted) {
        int minPrice = Integer.parseInt(min);
        int maxPrice = Integer.parseInt(max);
        Set<Laptop> temporary = new HashSet<>();

        if (setSorted.isEmpty()) {
            for (Laptop item : set) {
                if (minPrice <= item.getPrice() && item.getPrice() <= maxPrice) setSorted.add(item);
            }
        } else {
            for (Laptop item : set) {
                if (minPrice <= item.getPrice() && item.getPrice() <= maxPrice) temporary.add(item);
            }

            setSorted.retainAll(temporary);
        }
    }
}
