package org.hw.hw3.Product;

public class Drink extends Product {
    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public Drink(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Drink(String name, Double price) {
        super(name, price);
    }
}
