package com.demo.step3_builder_pattern.service;

import com.demo.step3_builder_pattern.entity.House;

public class ConstructionService {

    public House buildModernVilla() {
        return new House.Builder()
                .foundation("Móng cọc")
                .structure("Bê tông cốt thép")
                .roofType("Mái bằng")
                .floors(2)
                .rooms(4)
                .hasPool(true)
                .hasSmartHome(true)
                .paintColor("Xám khói")
                .build();
    }
}