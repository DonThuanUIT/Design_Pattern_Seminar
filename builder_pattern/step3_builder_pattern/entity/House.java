package com.demo.step3_builder_pattern.entity;

public class House {
    private final String foundation;
    private final String structure;
    private final String roofType;
    private final int floors;
    private final int rooms;
    private final int bathrooms;
    private final boolean hasPool;
    private final boolean hasGarden;
    private final boolean hasGarage;
    private final boolean hasSmartHome;
    private final boolean hasCCTV;
    private final boolean hasFireAlarm;
    private final String paintColor;
    private final String interiorStyle;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roofType = builder.roofType;
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
        this.hasSmartHome = builder.hasSmartHome;
        this.hasCCTV = builder.hasCCTV;
        this.hasFireAlarm = builder.hasFireAlarm;
        this.paintColor = builder.paintColor;
        this.interiorStyle = builder.interiorStyle;
    }

    public static class Builder {
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

        public Builder foundation(String foundation) { this.foundation = foundation; return this; }
        public Builder structure(String structure) { this.structure = structure; return this; }
        public Builder roofType(String roofType) { this.roofType = roofType; return this; }
        public Builder floors(int floors) { this.floors = floors; return this; }
        public Builder rooms(int rooms) { this.rooms = rooms; return this; }
        public Builder bathrooms(int bathrooms) { this.bathrooms = bathrooms; return this; }
        public Builder hasPool(boolean hasPool) { this.hasPool = hasPool; return this; }
        public Builder hasGarden(boolean hasGarden) { this.hasGarden = hasGarden; return this; }
        public Builder hasGarage(boolean hasGarage) { this.hasGarage = hasGarage; return this; }
        public Builder hasSmartHome(boolean hasSmartHome) { this.hasSmartHome = hasSmartHome; return this; }
        public Builder hasCCTV(boolean hasCCTV) { this.hasCCTV = hasCCTV; return this; }
        public Builder hasFireAlarm(boolean hasFireAlarm) { this.hasFireAlarm = hasFireAlarm; return this; }
        public Builder paintColor(String paintColor) { this.paintColor = paintColor; return this; }
        public Builder interiorStyle(String interiorStyle) { this.interiorStyle = interiorStyle; return this; }

        public House build() {
            if (foundation == null || structure == null) {
                throw new IllegalStateException("Nhà không thể thiếu móng và kết cấu!");
            }
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House [Immutability Secured] {" +
                "\n  Foundation='" + foundation + '\'' +
                ", Structure='" + structure + '\'' +
                ", Pool=" + hasPool +
                ", Garden=" + hasGarden +
                "\n}";
    }
}
