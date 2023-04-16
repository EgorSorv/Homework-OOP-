package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.Product;
import org.hw.hw3.Product.Chocolate;

import java.util.Objects;
import java.util.TreeSet;

public class ChocolateVendingMachine extends BaseVendingMachine {
    public ChocolateVendingMachine(TreeSet<Product> products) {
        super(products);
    }

    public TreeSet<Product> getProduct(String name, Integer sugar) {
        TreeSet<Product> productList = new TreeSet<Product>();

        for (Product product: products) {
            if (product instanceof Chocolate) {
                if (product.getName().equalsIgnoreCase(name) && Objects.equals(((Chocolate) product).getSugar(), sugar))
                    productList.add(product);
            }
        }

        return productList;
    }

    public TreeSet<Product> getProduct(String name, Double price, Integer sugar) {
        TreeSet<Product> productList = new TreeSet<Product>();


        for (Product product: products) {
            if (product instanceof Chocolate) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(product.getPrice(), price)
                        && Objects.equals(((Chocolate) product).getSugar(), sugar))
                    productList.add(product);
            }
        }

        return productList;
    }
}
