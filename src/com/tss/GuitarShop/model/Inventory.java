package com.tss.GuitarShop.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec){
        Guitar guitar=new Guitar(serialNumber,price,guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar g:guitars){
            if(g.getSerialNumber().equals(serialNumber))return g;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> guitarList=new ArrayList<>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec= guitar.getGuitarSpec();

            if(!guitarSpec.matches(searchSpec))continue;

            guitarList.add(guitar);
        }
        return guitarList;
    }
}

