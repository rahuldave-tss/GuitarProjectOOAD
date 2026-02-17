package com.tss.GuitarShop.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood, Wood topWood){
        Guitar guitar=new Guitar(serialNumber,price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar g:guitars){
            if(g.getSerialNumber().equals(serialNumber))return g;
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> guitarList=new ArrayList<>();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel().toLowerCase())))
                continue;

            if (searchGuitar.getBuilder() != guitar.getBuilder()) continue;
            if (searchGuitar.getType() != guitar.getType()) continue;
            if (searchGuitar.getBackWood() != guitar.getBackWood()) continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood()) continue;

            guitarList.add(guitar);
        }
        return guitarList;
    }
}

