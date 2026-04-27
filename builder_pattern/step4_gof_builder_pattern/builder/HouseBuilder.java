package com.demo.step4_gof_builder_pattern.builder;

import com.demo.step4_gof_builder_pattern.entity.House;

public class HouseBuilder implements Builder {
    private House house;

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void buildFoundation(String foundation) { house.setFoundation(foundation); }

    @Override
    public void buildStructure(String structure) { house.setStructure(structure); }

    @Override
    public void buildRoof(String roof) { house.setRoofType(roof); }

    @Override
    public void buildSpace(int floors, int rooms) {
        house.setFloors(floors);
        house.setRooms(rooms);
    }

    @Override
    public void installPool() { house.setHasPool(true); }

    @Override
    public void installGarden() { house.setHasGarden(true); }

    @Override
    public void installSmartHome() { house.setHasSmartHome(true); }

    public House getResult() {
        return this.house;
    }
}
