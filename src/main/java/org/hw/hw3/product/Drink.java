package org.hw.hw3.product;

public class Drink extends Product {
    private Double volume;

    public Drink(String name, Integer price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
