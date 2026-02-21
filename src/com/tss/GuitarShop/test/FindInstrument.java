package com.tss.GuitarShop.test;

import com.tss.GuitarShop.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindInstrument {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map<String, Object> smitInstrumentProperties = new HashMap<>();
        smitInstrumentProperties.put("InstrumentType", InstrumentType.GUITAR);
        smitInstrumentProperties.put("Builder", Builder.FENDER);
        smitInstrumentProperties.put("Type", Type.ELECTRIC);
        smitInstrumentProperties.put("BackWood", Wood.ALDER);
        smitInstrumentProperties.put("TopWood", Wood.ALDER);
        smitInstrumentProperties.put("Model", "Stratocastor");
        smitInstrumentProperties.put("NumberOfStrings", 12);

        Map<String, Object> neelInstrumentProperties = new HashMap<>();
        neelInstrumentProperties.put("InstrumentType", InstrumentType.MANDOLIN);
        neelInstrumentProperties.put("Builder", Builder.FENDER);
        neelInstrumentProperties.put("Type", Type.ACOUSTIC);
        neelInstrumentProperties.put("BackWood", Wood.CEDAR);
        neelInstrumentProperties.put("TopWood", Wood.CEDAR);
        neelInstrumentProperties.put("Model", "ABC");
        neelInstrumentProperties.put("Style", Style.A);

        InstrumentSpec whatSmitLikes = new InstrumentSpec(smitInstrumentProperties);
        InstrumentSpec whatNeelLikes = new InstrumentSpec(neelInstrumentProperties);

        List<Instrument> smitLikeList = inventory.search(whatSmitLikes);

        if(smitLikeList != null && !smitLikeList.isEmpty()) {
            System.out.println("Matching Instruments for Smit: ");
            System.out.println(smitLikeList);
        }
        else{
            System.out.println("Sorry, Smit !");
        }

        List<Instrument> neelLikeList = inventory.search(whatNeelLikes);

        if(neelLikeList != null && !neelLikeList.isEmpty()){
            System.out.println("Matching Instruments for Neel: ");
            System.out.println(neelLikeList);
        }
        else{
            System.out.println("Sorry, Neel !");
        }


    }
    private static void initializeInventory(Inventory inventory) {
        Map<String, Object> guitarProperties = new HashMap<>();
        guitarProperties.put("InstrumentType", InstrumentType.GUITAR);
        guitarProperties.put("Builder", Builder.FENDER);
        guitarProperties.put("Type", Type.ELECTRIC);
        guitarProperties.put("BackWood", Wood.ALDER);
        guitarProperties.put("TopWood", Wood.ALDER);
        guitarProperties.put("Model", "Stratocastor");
        guitarProperties.put("NumberOfStrings", 12);

        Map<String, Object> mandolinProperties = new HashMap<>();
        mandolinProperties.put("InstrumentType", InstrumentType.MANDOLIN);
        mandolinProperties.put("Builder", Builder.FENDER);
        mandolinProperties.put("Type", Type.ACOUSTIC);
        mandolinProperties.put("BackWood", Wood.ALDER);
        mandolinProperties.put("TopWood", Wood.CEDAR);
        mandolinProperties.put("Model", "ABC");
        mandolinProperties.put("Style", Style.A);


        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(guitarProperties));
        inventory.addInstrument("WGW342", 1300, new InstrumentSpec(mandolinProperties));

    }
}
