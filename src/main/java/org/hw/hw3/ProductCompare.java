package org.hw.hw3;



import org.hw.hw3.product.Product;

import java.util.Comparator;

public class ProductCompare implements Comparator<Product> {
    private final String type;

    public ProductCompare(String type) {
        this.type = type;
    }

    @Override
    public int compare(Product o1, Product o2) {
        if ("price".equals(type))
            return o1.getPrice().compareTo(o2.getPrice());
        else return 0;
    }
}
