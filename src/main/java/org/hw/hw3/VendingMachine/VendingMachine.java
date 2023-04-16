package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.Product;

import java.util.TreeSet;

public interface VendingMachine {
    TreeSet<Product> getProduct (String name);
}
