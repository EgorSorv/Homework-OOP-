package org.hw.hw3.machine;

import org.hw.hw3.product.Product;
import org.hw.hw3.product.Water;

import java.util.ArrayList;

public class WaterVendingMachine extends DrinkVendingMachine {
    public WaterVendingMachine() {
        products = new ArrayList<>();
    }

    public WaterVendingMachine getWater() throws IllegalStateException {
        WaterVendingMachine result = new WaterVendingMachine();

        for (Product product: products) {
            if (product instanceof Water) {
                result.addProduct(product);
            }
        }

        return result;
    }

    public ArrayList getProduct(Double volume) {
        ArrayList<Water> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Water) {
                if (((Water) product).getVolume().equals(volume))
                    result.add((Water) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с объемом %s не найдено", volume));
        else
            return result;
    }

    public ArrayList getProduct(String name, Double volume) {
        ArrayList<Water> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Water) {
                if (product.getName().equalsIgnoreCase(name) && ((Water) product).getVolume().equals(volume))
                    result.add((Water) product);
            }
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с названием %s не найдено", name));
        else
            return result;
    }

    public ArrayList getProduct(String name, Integer price, Double volume) {
        ArrayList<Water> result = new ArrayList<>();

        for (Product product: products) {
            if (product instanceof Water) {
                if (product.getName().equalsIgnoreCase(name) &&
                        product.getPrice() <= price &&
                        ((Water) product).getVolume().equals(volume))
                    result.add((Water) product);
            }
        }
        if (result.isEmpty())
            throw new IllegalStateException("Подходящих продуктов не найдено");
        else
            return result;
    }
}
