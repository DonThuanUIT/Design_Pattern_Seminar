package com.demo.step4_gof_builder_pattern;

import com.demo.step4_gof_builder_pattern.builder.HouseBuilder;
import com.demo.step4_gof_builder_pattern.director.Director;
import com.demo.step4_gof_builder_pattern.entity.House;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();

        director.constructMinimalistHouse(builder);
        House miniHouse = builder.getResult();
        System.out.println("\nKết quả Nhà tối giản: " + miniHouse);

        director.constructLuxuryVilla(builder);
        House luxuryVilla = builder.getResult();
        System.out.println("\nKết quả Biệt thự cao cấp: " + luxuryVilla);
    }
}