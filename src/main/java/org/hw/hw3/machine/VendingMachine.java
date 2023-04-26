package org.hw.hw3.machine;

import org.hw.hw3.product.Product;

import java.util.ArrayList;

public interface VendingMachine {
    ArrayList getProduct(String name) throws IllegalStateException;
    ArrayList getProduct(Integer price) throws IllegalStateException;
    public void addProduct(Product item);
}
