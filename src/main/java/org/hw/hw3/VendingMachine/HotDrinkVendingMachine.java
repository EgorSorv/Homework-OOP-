package org.hw.hw3.VendingMachine;

import org.hw.hw3.Product.HotDrink;
import org.hw.hw3.Product.Product;

import java.util.Objects;
import java.util.TreeSet;

public class HotDrinkVendingMachine extends DrinkVendingMachine {

    public HotDrinkVendingMachine(TreeSet<Product> products) {
        super(products);
    }

    public TreeSet<Product> getProduct(String name, Double volume, Double temperature) {
        TreeSet<Product> productList = new TreeSet<Product>();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(((HotDrink) product).getVolume(), volume)
                        && Objects.equals(((HotDrink) product).getTemperature(), temperature))
                    productList.add(product);
            }
        }

        return productList;
     }

    public TreeSet<Product> getProduct(String name,Double price, Double volume, Double temperature) {
        TreeSet<Product> productList = new TreeSet<Product>();

        for (Product product: products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name)
                        && Objects.equals(product.getPrice(), price)
                        && Objects.equals(((HotDrink) product).getVolume(), volume)
                        && Objects.equals(((HotDrink) product).getTemperature(), temperature))
                    productList.add(product);
            }
        }

        return productList;
    }
}
