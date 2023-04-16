package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.Water;
import org.hw.hw3.Product.Product;

import java.util.Objects;
import java.util.TreeSet;

public class WaterVendingMachine extends DrinkVendingMachine {
    public WaterVendingMachine(TreeSet<Product> products) {
        super(products);
    }

    public TreeSet<Product> getProduct(String name, Double volume) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
            if (product instanceof Water) {
                if (product.getName().equalsIgnoreCase(name) && Objects.equals(((Water) product).getVolume(), volume))
                    productList.add(product);
            }
        }

        return productList;
    }

    public TreeSet<Product> getProduct(String name, Double price, Double volume) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
            if (product instanceof Water) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(product.getPrice(), price)
                        && Objects.equals(((Water) product).getVolume(), volume))
                    productList.add(product);
            }
        }

        return productList;
    }
}
