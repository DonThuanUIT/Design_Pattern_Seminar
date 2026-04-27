package com.demo.step2_javabeans_setter.service;

import com.demo.step2_javabeans_setter.entity.House;

public class ConstructionService {

    public House buildLuxuryVilla() {
        House villa = new House();

        villa.setFoundation("Móng cọc bê tông");
        villa.setStructure("Khung thép");
        villa.setRoofType("Mái ngói");

        villa.setFloors(3);
        villa.setRooms(8);
        villa.setBathrooms(4);

        villa.setHasPool(true);
        villa.setHasGarden(true);
        villa.setHasGarage(true);

        villa.setHasSmartHome(true);
        villa.setHasCCTV(true);
        villa.setHasFireAlarm(true);

        villa.setPaintColor("Trắng Sứ");
        villa.setInteriorStyle("Tân Cổ Điển");

        return villa;
    }
}