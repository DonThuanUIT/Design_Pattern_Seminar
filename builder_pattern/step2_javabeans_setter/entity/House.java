package com.demo.step2_javabeans_setter.entity;

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



    public House() {
    }


    public void setFoundation(String foundation) { this.foundation = foundation; }
    public void setStructure(String structure) { this.structure = structure; }
    public void setRoofType(String roofType) { this.roofType = roofType; }
    public void setFloors(int floors) { this.floors = floors; }
    public void setRooms(int rooms) { this.rooms = rooms; }
    public void setBathrooms(int bathrooms) { this.bathrooms = bathrooms; }
    public void setHasPool(boolean hasPool) { this.hasPool = hasPool; }
    public void setHasGarden(boolean hasGarden) { this.hasGarden = hasGarden; }
    public void setHasGarage(boolean hasGarage) { this.hasGarage = hasGarage; }
    public void setHasSmartHome(boolean hasSmartHome) { this.hasSmartHome = hasSmartHome; }
    public void setHasCCTV(boolean hasCCTV) { this.hasCCTV = hasCCTV; }
    public void setHasFireAlarm(boolean hasFireAlarm) { this.hasFireAlarm = hasFireAlarm; }
    public void setPaintColor(String paintColor) { this.paintColor = paintColor; }
    public void setInteriorStyle(String interiorStyle) { this.interiorStyle = interiorStyle; }

    @Override
    public String toString() {
        return "House {" +
                "\n  Foundation='" + foundation + '\'' +
                ", Structure='" + structure + '\'' +
                ", Roof='" + roofType + '\'' +
                ", \n  Floors=" + floors +
                ", Rooms=" + rooms +
                ", Bathrooms=" + bathrooms +
                ", \n  Pool=" + hasPool +
                ", Garden=" + hasGarden +
                ", Garage=" + hasGarage +
                ", \n  SmartHome=" + hasSmartHome +
                ", CCTV=" + hasCCTV +
                ", FireAlarm=" + hasFireAlarm +
                ", \n  Color='" + paintColor + '\'' +
                ", Interior='" + interiorStyle + '\'' +
                "\n}";
    }
}