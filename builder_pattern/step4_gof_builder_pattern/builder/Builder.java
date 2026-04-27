package com.demo.step4_gof_builder_pattern.builder;

public interface Builder {
    void reset();
    void buildFoundation(String foundation);
    void buildStructure(String structure);
    void buildRoof(String roof);
    void buildSpace(int floors, int rooms);
    void installPool();
    void installGarden();
    void installSmartHome();
}
