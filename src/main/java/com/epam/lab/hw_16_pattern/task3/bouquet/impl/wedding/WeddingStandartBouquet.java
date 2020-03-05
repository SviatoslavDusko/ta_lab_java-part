package com.epam.lab.hw_16_pattern.task3.bouquet.impl.wedding;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;

import java.util.LinkedList;
import java.util.List;

public class WeddingStandartBouquet implements Bouquet {
    final private int PRICE = 300;
    final private String NAME_BOUQUET = "Wedding Standart";
    final private String EVENT_TYPE = "Wedding Day";
    private List<String> flowersList;

    public WeddingStandartBouquet() {
        flowersList = new LinkedList<>();
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.TULIP);
        flowersList.add(Flowers.TULIP);
        flowersList.add(Flowers.TULIP);
        flowersList.add(Flowers.TULIP);
        flowersList.add(Flowers.TULIP);
        flowersList.add(Flowers.ASTER);
        flowersList.add(Flowers.ASTER);
        flowersList.add(Flowers.ASTER);
        flowersList.add(Flowers.ASTER);
        flowersList.add(Flowers.ASTER);
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
