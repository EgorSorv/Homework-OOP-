package org.hw.hw1;

import java.util.List;
import java.util.Objects;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name))
                return product;
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }

    public HotDrink getProduct(String name,Double volume, Double temperature) {
        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(((HotDrink) product).getVolume(), volume)
                        && Objects.equals(((HotDrink) product).getTemperature(), temperature))
                    return (HotDrink) product;
            }
        }
        throw new IllegalStateException(String.format("Продукт с названием %s не найден.", name));
    }
}
