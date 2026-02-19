package com.tss.GuitarShop.model;

public abstract class InstrumentSpec{
    private Builder builder;
    private Type type;
    private Wood backWood,topWood;
    private String model;

    public InstrumentSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
    }

    public boolean matches(InstrumentSpec otherSpec){
        String model = otherSpec.getModel().toLowerCase();
        if ((model != null) && (!model.equals("")) &&
                (!model.equals(otherSpec.getModel().toLowerCase())))
            return false;

        if (otherSpec.getBuilder() != this.getBuilder()) return false;
        if (otherSpec.getType() != this.getType()) return false;
        if (otherSpec.getBackWood() != this.getBackWood()) return false;
        if (otherSpec.getTopWood() != this.getTopWood()) return false;

        return true;
    }

    public Builder getBuilder() {
        return builder;
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

    public String getModel() {
        return model;
    }

}
