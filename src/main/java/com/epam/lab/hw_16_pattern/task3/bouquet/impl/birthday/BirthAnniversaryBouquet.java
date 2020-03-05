package com.epam.lab.hw_16_pattern.task3.bouquet.impl.birthday;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;

import java.util.LinkedList;
import java.util.List;

public class BirthAnniversaryBouquet implements Bouquet {
    final private int PRICE = 100;
    final private String NAME_BOUQUET = "Birth Anniversary";
    final private String EVENT_TYPE = "Birthday";
    private List<String> flowersList;

    public BirthAnniversaryBouquet() {
        flowersList = new LinkedList<>();
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
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
