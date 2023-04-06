package org.hw.hw1;

public class HotDrink extends Product {
    public HotDrink (String name, Double price) {
        super(name, price);
    }

    private Double temperature;
    private Double volume;

    public HotDrink (String name, Double price,Double volume, Double temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
