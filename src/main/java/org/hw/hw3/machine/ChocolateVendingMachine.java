package org.hw.hw3.machine;

import org.hw.hw3.product.Chocolate;
import org.hw.hw3.product.Drink;
import org.hw.hw3.product.Product;

import java.util.ArrayList;
import java.util.Objects;

public class ChocolateVendingMachine extends BaseVendingMachine {
    public ChocolateVendingMachine() {
        products = new ArrayList<>();
    }

    public ChocolateVendingMachine getChocolates() {
        ChocolateVendingMachine result = new ChocolateVendingMachine();

        for (Product product: products) {
            if (product instanceof Chocolate) {
                result.addProduct(product);
            }
        }

        return result;
    }

    public ArrayList getProduct(String name, Integer sugar) {
        ArrayList<Chocolate> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Chocolate) {
                if (product.getName().equalsIgnoreCase(name) &&
                        Objects.equals(((Chocolate) product).getSugar(), sugar))
                    result.add((Chocolate) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с названием %s не найдено", name));
        else
            return result;
    }

    public ArrayList getProduct(String name, Integer price, Integer sugar) {
        ArrayList<Chocolate> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Chocolate) {
                if (product.getName().equalsIgnoreCase(name) &&
                        product.getPrice() <= price &&
                        Objects.equals(((Chocolate) product).getSugar(), sugar))
                    result.add((Chocolate) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException("Подходящих продуктов не найдено");
        else
            return result;
    }
}
