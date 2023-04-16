package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.Product;
import org.hw.hw3.Product.Drink;

import java.util.*;

public class DrinkVendingMachine extends BaseVendingMachine {
    public DrinkVendingMachine(TreeSet<Product> products) {
        super(products);
    }

    public TreeSet<Product> getProduct(String name, Double volume) {
        TreeSet<Product> productList = new TreeSet<Product>();

        for (Product product : products) {
            if (product instanceof Drink) {
                if (product.getName().equalsIgnoreCase(name) && Objects.equals(((Drink) product).getVolume(), volume))
                    productList.add(product);
            }
        }

        return productList;
    }

    public TreeSet<Product> getProduct(String name, Double price, Double volume) {
        TreeSet<Product> productList = new TreeSet<Product>();

        for (Product product: products) {
            if (product instanceof Drink) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(product.getPrice(), price)
                        && Objects.equals(((Drink) product).getVolume(), volume))
                    productList.add(product);
            }
        }

        return productList;
    }
}
