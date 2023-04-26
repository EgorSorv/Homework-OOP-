package org.hw.hw3.machine;

import org.hw.hw3.ProductCompare;
import org.hw.hw3.product.Product;

import java.util.ArrayList;

public class BaseVendingMachine implements VendingMachine {
    protected ArrayList<Product> products;

    public BaseVendingMachine() {
        products = new ArrayList<>();
    }

    public void sort(ProductCompare comparator, ArrayList list) {
        list.sort(comparator);
    }

    @Override
    public ArrayList getProduct(String name) throws IllegalStateException {
        ArrayList<Product> result = new ArrayList<>();
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)) result.add(product);
        }

        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов с названием %s не найдено", name));
        else 
            return result;
    }

    @Override
    public ArrayList getProduct(Integer price) throws IllegalStateException {
        ArrayList<Product> result = new ArrayList<>();
        
        for (Product product: products) {
            if (product.getPrice() <= price) result.add(product);
        }
        
        if (result.isEmpty())
            throw new IllegalStateException(String.format("Продуктов дешевле %s не найдено", price));
        else
            return result;
    }

    @Override
    public void addProduct(Product item) {
        products.add(item);
    }

    public ArrayList getProduct(String name, Integer price) throws IllegalStateException {
        ArrayList<Product> result = new ArrayList<>();
        
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name) && product.getPrice() <= price)
                result.add(product);
        }

        if (result.isEmpty())
            throw new IllegalStateException("Подходящих продуктов не найдено");
        else
            return result;
    }
}
