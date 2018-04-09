package de.fhro.inf.prg3.a05.model;

public class Shrub extends Plant {

    private final PlantColor plantColor;

    public Shrub() {
        this.plantColor = PlantColor.GREEN;
    }

    @Override
    public PlantColor getColor() {
        return plantColor;
    }

}
