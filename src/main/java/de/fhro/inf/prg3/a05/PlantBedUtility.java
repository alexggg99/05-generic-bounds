package de.fhro.inf.prg3.a05;

import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {
    private PlantBedUtility() {
    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed) {
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();
        for (PlantColor plantColor : PlantColor.values()) {
            map.put(plantColor, bed.getPlantsByColor(plantColor));
        }
        return map;
    }
}
