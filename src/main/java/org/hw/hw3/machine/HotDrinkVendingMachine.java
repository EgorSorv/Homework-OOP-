package org.hw.hw3.machine;

import org.hw.hw3.product.HotDrink;
import org.hw.hw3.product.Product;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends DrinkVendingMachine {
    public HotDrinkVendingMachine() {
        products = new ArrayList<>();
    }

    public HotDrinkVendingMachine getHotDrinks() {
        HotDrinkVendingMachine result = new HotDrinkVendingMachine();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                result.addProduct(product);
            }
        }

        return result;
    }

    public ArrayList getProduct(Double volume) {
        ArrayList<HotDrink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (((HotDrink) product).getVolume().equals(volume))
                    result.add((HotDrink) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с объемом %s не найдено", volume));
        else
            return result;
    }

    public ArrayList getProduct(String name, Double volume) {
        ArrayList<HotDrink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume().equals(volume))
                    result.add((HotDrink) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с названием %s не найдено", name));
        else
            return result;
    }

    public ArrayList getProduct(String name, Integer price, Double volume) {
        ArrayList<HotDrink> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) &&
                        product.getPrice() <= price &&
                        ((HotDrink) product).getVolume().equals(volume))
                    result.add((HotDrink) product);
            }
        }
        if (result.isEmpty())
            throw new IllegalStateException("Подходящих продуктов не найдено");
        else
            return result;
    }
}
