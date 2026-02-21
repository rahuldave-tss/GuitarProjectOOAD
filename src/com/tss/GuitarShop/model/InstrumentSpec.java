package com.tss.GuitarShop.model;

import java.util.Map;

public class InstrumentSpec{
    public Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties=properties;
    }

    public boolean matches(InstrumentSpec otherSpec){
        for(String s: otherSpec.properties.keySet()){
            if(!this.getProperty(s).equals(otherSpec.getProperty(s)))return false;
        }
        return true;
    }

    public Object getProperty(String property){
        return properties.getOrDefault(property,"No Property Exists");
    }
}
