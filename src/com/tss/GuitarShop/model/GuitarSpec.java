package com.tss.GuitarShop.model;

public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood backWood,topWood;
    private String model;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood,int numStrings) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numStrings=numStrings;
    }

    public boolean matches(GuitarSpec otherSpec){
        String model = otherSpec.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(otherSpec.getModel().toLowerCase())))
            return false;

        if (otherSpec.getBuilder() != this.getBuilder()) return false;
        if (otherSpec.getType() != this.getType()) return false;
        if (otherSpec.getBackWood() != this.getBackWood()) return false;
        if (otherSpec.getTopWood() != this.getTopWood()) return false;
        if(otherSpec.getNumStrings() != this.getNumStrings())return false;

        return true;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }
}
