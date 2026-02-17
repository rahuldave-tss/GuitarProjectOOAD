package com.tss.GuitarShop.model;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this){
            case ACOUSTIC : return "Acoustic";
            case ELECTRIC : return "Electric";
        }
        return null;
    }
}
