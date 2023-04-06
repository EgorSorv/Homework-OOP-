package org.hw.hw1;

import java.util.ArrayList;
import java.util.List;

public class ex {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(products);

        products.add(new HotDrink("black tea", 100.0, 0.3, 40.0));
        products.add(new HotDrink("green tea", 150.0, 0.3, 38.5));
        products.add(new HotDrink("latte macchiato", 370.0, 0.5, 60.1));
        products.add(new HotDrink("lungo", 250.0, 0.4, 58.7));
        products.add(new HotDrink("cappuccino", 250.0, 0.4, 65.5));

        HotDrink drink = machine.getProduct("latte macchiato", 0.5, 60.1);
        System.out.println(drink);
    }
}
