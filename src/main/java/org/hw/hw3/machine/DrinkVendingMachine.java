package org.hw.hw3.machine;

import org.hw.hw3.product.HotDrink;
import org.hw.hw3.product.Product;
import org.hw.hw3.product.Drink;
import org.hw.hw3.product.Water;

import java.util.ArrayList;


public class DrinkVendingMachine extends BaseVendingMachine {
    public DrinkVendingMachine() {
        products = new ArrayList<>();
    }

    public DrinkVendingMachine getDrinks() {
        DrinkVendingMachine result = new DrinkVendingMachine();

        for (Product product: products) {
            if (product instanceof Drink || product instanceof Water || product instanceof HotDrink) {
                result.addProduct(product);
            }
        }

        return result;
    }

    public ArrayList getProduct(Double volume) {
        ArrayList<Drink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Drink) {
                if (((Drink) product).getVolume().equals(volume))
                    result.add((Drink) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с объемом %s не найдено", volume));
        else
            return result;
    }

    public ArrayList getProduct(String name, Double volume) {
        ArrayList<Drink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Drink) {
                if (product.getName().equalsIgnoreCase(name) && ((Drink) product).getVolume().equals(volume))
                    result.add((Drink) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с названием %s не найдено", name));
        else
            return result;
    }

    public ArrayList getProduct(String name, Integer price, Double volume) {
        ArrayList<Drink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Drink) {
                if (product.getName().equalsIgnoreCase(name) &&
                        product.getPrice() <= price &&
                        ((Drink) product).getVolume().equals(volume))
                    result.add((Drink) product);
            }
        }
        if (result.isEmpty())
            throw new IllegalStateException("Подходящих продуктов не найдено");
        else
            return result;
    }
}
