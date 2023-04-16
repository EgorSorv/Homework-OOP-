package org.hw.hw2;

import java.util.Scanner;

public interface LaptopFilter {
    Scanner sc = new Scanner(System.in);

    static String modelFilter() {
        System.out.println("Введите подходящую модель ноутбука (1 - Samsung, 2 - HP, 3 - Acer, 4 - ASUS, " +
                "5 - Apple, 6 - HUAWEI, 7 - Lenovo, 8 - MSI):");
        int model = sc.nextInt();

        return switch (model) {
            case (1) -> "Samsung";
            case (2) -> "HP";
            case (3) -> "Acer";
            case (4) -> "ASUS";
            case (5) -> "Apple";
            case (6) -> "HUAWEI";
            case (7) -> "Lenovo";
            case (8) -> "MSI";
            default -> null;
        };
    }
    static String ramFilter() {
        System.out.println("Введите необходимый объем оперативной памяти:");
        int ram = sc.nextInt();

        return Integer.toString(ram);
    }
    static String osFilter() {
        System.out.println("Введите подходящую операционную систему (1 - Windows, 2 - Linux, 3 - MacOS):");

        int os = sc.nextInt();

        return switch (os) {
            case (1) -> "Windows";
            case (2) -> "Linux";
            case (3) -> "MacOS";
            default -> null;
        };
    }
    static String driveTypeFilter() {
        System.out.println("Введите необходимый тип диска (1 - HDD или 2 - SSD):");
        int drive = sc.nextInt();

        return switch (drive) {
            case (1) -> "HDD";
            case (2) -> "SSD";
            default -> null;
        };
    }
    static String driveCapacityFilter() {
        System.out.println("Введите необходимый объем диска:");
        int capacity = sc.nextInt();

        return Integer.toString(capacity);
    }
    static String minPriceFilter() {
        System.out.println("Введите минимальную цену:");
        int min = sc.nextInt();

        return  Integer.toString(min);
    }

    static String maxPriceFilter() {
        System.out.println("Введите максимальную цену:");
        int max = sc.nextInt();

        return Integer.toString(max);
    }
}
