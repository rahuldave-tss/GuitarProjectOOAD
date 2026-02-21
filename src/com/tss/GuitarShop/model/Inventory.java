package com.tss.GuitarShop.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        this.instruments = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec){
        instruments.add(new Instrument(serialNumber,price,instrumentSpec));
    }

    public Instrument getInstrument(String serialNumber){
        for(Instrument i:instruments){
            if(i.getSerialNumber().equals(serialNumber))return i;
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec) {
        List<Instrument> instrumentList=new ArrayList<>();
        for(Instrument i:instruments){
            if(i.getSpec().matches(searchSpec))instrumentList.add(i);
        }
        return instrumentList;
    }
}

