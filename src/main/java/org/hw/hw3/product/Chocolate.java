package org.hw.hw3.product;

public class Chocolate extends Product {
    private Integer sugar;

    public Chocolate(String name, Integer price, Integer sugar) {
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
