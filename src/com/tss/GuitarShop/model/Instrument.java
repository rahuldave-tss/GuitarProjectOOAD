package com.tss.GuitarShop.model;

import java.util.Map;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price,InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec=instrumentSpec;
    }

    public InstrumentSpec getSpec(){
        return instrumentSpec;
    }


    public String getSerialNumber(){
        return serialNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(
                        "serialNumber='" + getSerialNumber() + '\'' +
                        ", price=" + getPrice() + '\''
        );
        for(Map.Entry<String, Object> entry: getSpec().properties.entrySet()){
            sb.append(", ")
                    .append(entry.getKey())
                    .append("='")
                    .append(entry.getValue())
                    .append('\'');
        }
        return sb.toString();
    }
}
