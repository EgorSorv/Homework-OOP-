package org.hw.hw3;

import org.hw.hw3.product.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductIterator implements Iterator<Product> {
    private int counter;

    private ArrayList<Product> products;

    public ProductIterator (int counter, ArrayList<Product> products) {
        this.counter = counter;
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return counter < products.size() - 1;
    }

    @Override
    public Product next() {
        if (!hasNext())
            return null;
        counter++;
        return products.get(counter);
    }
}
