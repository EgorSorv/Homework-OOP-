package org.hw.hw3.Product;

public class HotDrink extends Drink {
    private Double temperature;

    public HotDrink (String name, Double price, Double volume, Double temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
