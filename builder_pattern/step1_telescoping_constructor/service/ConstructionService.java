package com.demo.step1_telescoping_constructor.service;

import com.demo.step1_telescoping_constructor.entity.House;

public class ConstructionService {

    public House buildTownHouse() {
        return new House("Móng băng", "Gạch", "Mái tôn", 1, 2, 1);
    }

    public House buildLuxuryVilla() {
        return new House(
                "Móng cọc bê tông", "Khung thép", "Mái ngói",
                3, 8, 4,
                true, true, true,
                true, true, true,
                "Trắng Sứ", "Tân Cổ Điển"
        );
    }
}