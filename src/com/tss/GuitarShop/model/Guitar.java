package com.tss.GuitarShop.model;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec=guitarSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + guitarSpec.getModel() + '\'' +
                ", builder=" + guitarSpec.getBuilder() +
                ", type=" + guitarSpec.getType() +
                ", backWood=" + guitarSpec.getBackWood() +
                ", topWood=" + guitarSpec.getTopWood() +
                ", price=" + price +
                ", numStrings=" + guitarSpec.getNumStrings() +
                '}';
    }
}
