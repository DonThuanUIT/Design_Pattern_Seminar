package com.demo.step4_gof_builder_pattern.entity;

public class House {
    private String foundation;
    private String structure;
    private String roofType;
    private int floors;
    private int rooms;
    private int bathrooms;
    private boolean hasPool;
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasSmartHome;
    private boolean hasCCTV;
    private boolean hasFireAlarm;
    private String paintColor;
    private String interiorStyle;

    public void setFoundation(String foundation) { this.foundation = foundation; }
    public void setStructure(String structure) { this.structure = structure; }
    public void setRoofType(String roofType) { this.roofType = roofType; }
    public void setFloors(int floors) { this.floors = floors; }
    public void setRooms(int rooms) { this.rooms = rooms; }
    public void setHasPool(boolean hasPool) { this.hasPool = hasPool; }
    public void setHasGarden(boolean hasGarden) { this.hasGarden = hasGarden; }
    public void setHasSmartHome(boolean hasSmartHome) { this.hasSmartHome = hasSmartHome; }

    @Override
    public String toString() {
        return "House [GoF Version] {" +
                "\n  Foundation='" + foundation + '\'' +
                ", Structure='" + structure + '\'' +
                ", Roof='" + roofType + '\'' +
                ", Floors=" + floors +
                ", Pool=" + hasPool +
                ", SmartHome=" + hasSmartHome +
                "\n}";
    }
}
