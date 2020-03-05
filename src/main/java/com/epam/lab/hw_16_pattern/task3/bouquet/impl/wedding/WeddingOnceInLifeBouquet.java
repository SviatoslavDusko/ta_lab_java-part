package com.epam.lab.hw_16_pattern.task3.bouquet.impl.wedding;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;

import java.util.LinkedList;
import java.util.List;

public class WeddingOnceInLifeBouquet implements Bouquet {
    final private int PRICE = 1000;
    final private String NAME_BOUQUET = "Wedding Standart";
    final private String EVENT_TYPE = "Wedding Day";
    private List<String> flowersList;

    public WeddingOnceInLifeBouquet() {
        flowersList = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            flowersList.add(Flowers.ROSE);
        }

        for (int i = 0; i < 13; i++) {
            flowersList.add(Flowers.TULIP);
        }

        for (int i = 0; i < 11; i++) {
            flowersList.add(Flowers.ASTER);
        }
    }

    @Override
    public int getPrice() {
        return this.PRICE;
    }

    @Override
    public String getName() {
        return this.NAME_BOUQUET;
    }

    @Override
    public String getEventType() {
        return this.EVENT_TYPE;
    }

    @Override
    public List<String> getFlowersList() {
        return this.flowersList;
    }
}
