package com.epam.lab.hw_16_pattern.task3.bouquet.impl.valentinesday;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;

import java.util.LinkedList;
import java.util.List;

public class ValentinesWithHeart implements Bouquet {
    final private int PRICE = 300;
    final private String NAME_BOUQUET = "Valentines Standart";
    final private String EVENT_TYPE = "Valentines Day";
    private List<String> flowersList;

    public ValentinesWithHeart() {
        flowersList = new LinkedList<>();
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.ROSE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CHAMOMILE);
        flowersList.add(Flowers.CARNATION);
        flowersList.add(Flowers.CARNATION);
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
