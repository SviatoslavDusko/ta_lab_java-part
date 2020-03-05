package com.epam.lab.hw_16_pattern.task3.bouquet.impl.custom;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;

import java.util.LinkedList;
import java.util.List;

public class CustomBouquet implements Bouquet {
    final private int PRICE = 0;
    final private String NAME_BOUQUET = "Custom bouquet";
    final private String EVENT_TYPE = "Custom type";
    private List<String> flowersList;

    public CustomBouquet() {
        flowersList = new LinkedList<>();
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public String getName() {
        return NAME_BOUQUET;
    }

    @Override
    public String getEventType() {
        return EVENT_TYPE;
    }

    @Override
    public List<String> getFlowersList() {
        return flowersList;
    }
}
