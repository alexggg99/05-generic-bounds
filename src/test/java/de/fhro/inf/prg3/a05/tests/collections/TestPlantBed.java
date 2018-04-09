package de.fhro.inf.prg3.a05.tests.collections;

import de.fhro.inf.prg3.a05.PlantBed;
import de.fhro.inf.prg3.a05.PlantBedUtility;
import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;
import de.fhro.inf.prg3.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlantBed {

    private final Logger logger = LogManager.getLogger();
    private PlantBed<Plant> plantBed;

    @BeforeEach
    void setup(){
        plantBed = new PlantBed<>();

        plantBed.add(new Flower(PlantColor.BLUE));
        plantBed.add(new Flower(PlantColor.ORANGE));
        plantBed.add(new Shrub());
        plantBed.add(new Flower(PlantColor.BLUE));
        plantBed.add(new Flower(PlantColor.YELLOW));
    }

    @Test
    void test1() {
        assertEquals(plantBed.size(), 5);
    }

    @Test
    void test2() {
        SimpleList<Plant> list = plantBed.getPlantsByColor(PlantColor.BLUE);
        assertEquals(list.size(), 2);
    }

    @Test
    void test3() {
        Map<PlantColor, SimpleList<Plant>> map = PlantBedUtility.splitBedByColor(plantBed);
        assertEquals(2, map.get(PlantColor.BLUE).size());
        assertEquals(1, map.get(PlantColor.YELLOW).size());
    }

}
