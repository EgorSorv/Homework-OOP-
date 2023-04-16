package org.hw.hw3.Product;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public abstract class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + '\n' +
                "price = " + price;
    }

    public int compareTo (Product product) {
        if (Objects.equals(this.price, product.price)) return 0;
        else if (this.price < product.price) return -1;
        else return 1;
    }

    public static void printProduct(TreeSet<Product> products) {
        Iterator<Product> iter = products.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
