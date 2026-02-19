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
        Instrument instrument=null;
        if(instrumentSpec instanceof GuitarSpec){
            instrument=new Guitar(serialNumber,price,(GuitarSpec) instrumentSpec);
        }
        if(instrumentSpec instanceof MandolinSpec){
            instrument=new Mandolin(serialNumber,price,(MandolinSpec) instrumentSpec);
        }
        instruments.add(instrument);
    }

    public Instrument getInstrument(String serialNumber){
        for(Instrument i:instruments){
            if(i.getSerialNumber().equals(serialNumber))return i;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> guitarList=new ArrayList<>();
        for(Instrument i:instruments){
            if(i.getSpec().matches(searchSpec))guitarList.add((Guitar)i);
        }
        return guitarList;
    }
    public List<Mandolin> search(MandolinSpec searchSpec) {
        List<Mandolin> mandolinList=new ArrayList<>();
        for(Instrument i:instruments){
            if(i.getSpec().matches(searchSpec))mandolinList.add((Mandolin) i);
        }
        return mandolinList;
    }
}

