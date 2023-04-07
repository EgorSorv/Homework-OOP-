package org.hw.hw2;

public class Laptop extends Product{
    private String model;
    private int ram;
    private String os;
    private String driveType;
    private int driveCapacity;

    public Laptop(String name, String model, int ram, String os,String driveType, int driveCapacity, int price) {
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.os = os;
        this.driveType = driveType;
        this.driveCapacity = driveCapacity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public int getDriveCapacity() {
        return driveCapacity;
    }

    public void setDriveCapacity(int driveCapacity) {
        this.driveCapacity = driveCapacity;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + name +
                ", модель: " + model +
                ", количество опретивной памяти: " + ram +
                ", операционная система: " + os +
                ", тип диска: " + driveType +
                ", объем диска: " + driveCapacity +
                ", цена: " + price;
    }
}
