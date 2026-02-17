package com.tss.GuitarShop.test;

import com.tss.GuitarShop.model.*;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes=new GuitarSpec(Builder.FENDER,"Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER,10);

        List<Guitar> guitars=inventory.search(whatErinLikes);
        if(!guitars.isEmpty()){
            System.out.println("Matching Guitars: ");
            for(Guitar guitar:guitars){
                System.out.println(guitar);
            }

        }
        else{
            System.out.println("Sorry !! we have nothing for you");
        }

    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER,"Stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER,10) );
        inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,5));
    }
}
