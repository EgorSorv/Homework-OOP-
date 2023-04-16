package org.hw.hw3.Product;

public class Chocolate extends Product {
    private Integer sugar;

    public Chocolate(String name, Double price, Integer sugar) {
        super(name, price);
        this.sugar = sugar;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }
}
