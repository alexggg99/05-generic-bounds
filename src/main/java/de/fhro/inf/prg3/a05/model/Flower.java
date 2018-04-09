package de.fhro.inf.prg3.a05.model;

public class Flower extends Plant {

    private final PlantColor plantColor;

    public Flower(PlantColor plantColor) {
        if (plantColor.equals(PlantColor.GREEN)) {
            throw new IllegalArgumentException();
        }
        this.plantColor = plantColor;
    }

    @Override
    public PlantColor getColor() {
        return plantColor;
    }
}
