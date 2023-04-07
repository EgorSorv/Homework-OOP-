package org.hw.hw2;

import java.util.Set;

public interface PrintLaptopList {
    static void printSet(Set<Laptop> set)
    {
        for (Laptop item: set) System.out.println(item + "\n");
    }
}
