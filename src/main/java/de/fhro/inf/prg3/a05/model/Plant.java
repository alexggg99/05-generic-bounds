package de.fhro.inf.prg3.a05.model;

public abstract class Plant implements Comparable<Plant> {
    private double height;
    private String family;
    private String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant o) {
        if (this == o)
            return 0;
        if (o.getHeight() > this.getHeight()) {
            return 1;
        } else if (o.getHeight() < this.getHeight()) {
            return -1;
        } else
            return 0;
    }
}
