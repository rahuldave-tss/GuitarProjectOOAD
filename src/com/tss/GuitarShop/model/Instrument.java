package com.tss.GuitarShop.model;

public abstract class Instrument {
    private String serialNumber;
    private double price;

    public Instrument(String serialNumber, double price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public abstract InstrumentSpec getSpec();

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName()+"{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price + '\'' +
                ", builder='" + getSpec().getBuilder() + '\'' +
                ", top wood='" + getSpec().getTopWood() + '\'' +
                ", back wood='" + getSpec().getBackWood() + '\'' +
                ", type='" + getSpec().getType() + '\'' +
                ", model='" + getSpec().getModel() + '\'';
    }
}
