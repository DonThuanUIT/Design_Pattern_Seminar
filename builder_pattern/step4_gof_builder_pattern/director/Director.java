package com.demo.step4_gof_builder_pattern.director;

import com.demo.step4_gof_builder_pattern.builder.Builder;

public class Director {

    public void constructMinimalistHouse(Builder builder) {
        builder.reset();
        builder.buildFoundation("Móng băng");
        builder.buildStructure("Gạch ống");
        builder.buildRoof("Mái bằng");
        builder.buildSpace(1, 2);
    }

    public void constructLuxuryVilla(Builder builder) {
        builder.reset();
        builder.buildFoundation("Móng cọc nhồi");
        builder.buildStructure("Bê tông cốt thép");
        builder.buildRoof("Mái ngói");
        builder.buildSpace(3, 8);
        builder.installPool();
        builder.installGarden();
        builder.installSmartHome();
    }
}