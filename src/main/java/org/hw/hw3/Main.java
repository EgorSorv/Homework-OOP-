package org.hw.hw3;

import org.hw.hw3.Product.HotDrink;
import org.hw.hw3.Product.Product;
import org.hw.hw3.VendingMachine.HotDrinkVendingMachine;

import java.util.TreeSet;

import static org.hw.hw3.Product.Product.printProduct;

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<Product>();

        HotDrinkVendingMachine machine1 = new HotDrinkVendingMachine(products);

        products.add(new HotDrink("tea", 100.0, 0.3, 40.0));
        products.add(new HotDrink("tea", 150.0, 0.3, 38.5));
        products.add(new HotDrink("latte macchiato", 370.0, 0.5, 60.1));
        products.add(new HotDrink("lungo", 250.0, 0.4, 58.7));
        products.add(new HotDrink("cappuccino", 250.0, 0.4, 65.5));

        printProduct(machine1.getProduct("tea", 0.5, 60.1));
    }
}
