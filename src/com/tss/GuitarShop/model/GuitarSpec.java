package com.tss.GuitarShop.model;

public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model,int numStrings) {
        super(builder, type, backWood, topWood, model);
        this.numStrings=numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec))return false;
        if(!(otherSpec instanceof GuitarSpec))return false;
        GuitarSpec spec=(GuitarSpec) otherSpec;
        if(numStrings!=spec.getNumStrings())return false;
        return true;
    }


}
