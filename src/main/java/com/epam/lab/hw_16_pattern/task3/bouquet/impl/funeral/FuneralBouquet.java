package com.epam.lab.hw_16_pattern.task3.bouquet.impl.funeral;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;

import java.util.LinkedList;
import java.util.List;

public class FuneralBouquet implements Bouquet {
    final private int PRICE = 25;
    final private String NAME_BOUQUET = "Funeral";
    final private String EVENT_TYPE = "Funeral";
    private List<String> flowersList;

    public FuneralBouquet() {
        flowersList = new LinkedList<>();
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
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
