package org.hw.hw3;

import org.hw.hw3.machine.DrinkVendingMachine;
import org.hw.hw3.product.Drink;
import org.hw.hw3.product.HotDrink;
import org.hw.hw3.product.Water;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DrinkVendingMachine machine = new DrinkVendingMachine();

        machine.addProduct(new Water("water", 200, 0.3));
        machine.addProduct(new HotDrink("green tea", 150, 0.3, 38.5));
        machine.addProduct(new HotDrink("latte macchiato", 370, 0.5, 60.1));
        machine.addProduct(new Drink("cola", 100, 0.4));
        machine.addProduct(new HotDrink("cappuccino", 250, 0.4, 65.5));

        ArrayList drink = machine.getProduct( 300);

        drink.sort(new ProductCompare("price"));

        System.out.println(drink);
    }
}
