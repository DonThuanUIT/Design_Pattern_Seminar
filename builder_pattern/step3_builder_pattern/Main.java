package com.demo.step3_builder_pattern;

import com.demo.step3_builder_pattern.entity.House;
import com.demo.step3_builder_pattern.service.ConstructionService;

public class Main {
    public static void main(String[] args) {

        ConstructionService service = new ConstructionService();
        House myVilla = service.buildModernVilla();
        System.out.println("Kết quả xây biệt thự:\n" + myVilla);


        House custom = new House.Builder()
                .foundation("Móng băng")
                .hasPool(false)
                .hasGarden(true)
                .build();


        System.out.println("\nCustom House sạch đẹp: \n" + custom);
    }
}
