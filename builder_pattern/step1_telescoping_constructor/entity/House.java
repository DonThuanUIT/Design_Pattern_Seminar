package com.demo.step1_telescoping_constructor.entity;

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


    public House(String foundation, String structure, String roofType) {
        this.foundation = foundation;
        this.structure = structure;
        this.roofType = roofType;
    }

    public House(String foundation, String structure, String roofType,
                 int floors, int rooms, int bathrooms) {
        this(foundation, structure, roofType);
        this.floors = floors;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    public House(String foundation, String structure, String roofType,
                 int floors, int rooms, int bathrooms,
                 boolean hasPool, boolean hasGarden, boolean hasGarage) {
        this(foundation, structure, roofType, floors, rooms, bathrooms);
        this.hasPool = hasPool;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
    }

    public House(String foundation, String structure, String roofType,
                 int floors, int rooms, int bathrooms,
                 boolean hasPool, boolean hasGarden, boolean hasGarage,
                 boolean hasSmartHome, boolean hasCCTV, boolean hasFireAlarm) {
        this(foundation, structure, roofType, floors, rooms, bathrooms, hasPool, hasGarden, hasGarage);
        this.hasSmartHome = hasSmartHome;
        this.hasCCTV = hasCCTV;
        this.hasFireAlarm = hasFireAlarm;
    }

    public House(String foundation, String structure, String roofType,
                 int floors, int rooms, int bathrooms,
                 boolean hasPool, boolean hasGarden, boolean hasGarage,
                 boolean hasSmartHome, boolean hasCCTV, boolean hasFireAlarm,
                 String paintColor, String interiorStyle) {
        this(foundation, structure, roofType, floors, rooms, bathrooms,
                hasPool, hasGarden, hasGarage, hasSmartHome, hasCCTV, hasFireAlarm);
        this.paintColor = paintColor;
        this.interiorStyle = interiorStyle;
    }

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