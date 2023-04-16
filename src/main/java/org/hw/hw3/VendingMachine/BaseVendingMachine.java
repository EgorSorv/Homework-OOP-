package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.Product;

import java.util.Objects;
import java.util.TreeSet;

public class BaseVendingMachine implements VendingMachine {
    protected final TreeSet<Product> products;

    public BaseVendingMachine(TreeSet<Product> products) {
        this.products = products;
    }

    public TreeSet<Product> getProduct(String name) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name))
                productList.add(product);
        }

        return productList;
    }

    public TreeSet<Product> getProduct(Double price) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
            if (Objects.equals(((Product) product).getPrice(), price))
                productList.add(product);
        }

        return productList;
    }

    public TreeSet<Product> getProduct(String name, Double price) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
                if (product.getName().equalsIgnoreCase(name) && Objects.equals(((Product) product).getPrice(), price))
                    productList.add(product);
        }

        return productList;
    }
}
