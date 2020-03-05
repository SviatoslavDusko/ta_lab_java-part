package com.epam.lab.hw_16_pattern.task3.decorator.abstr.flower;

import com.epam.lab.hw_16_pattern.task3.constants.Flowers;
import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

import java.util.LinkedList;
import java.util.List;

public class FlowersAdditional extends BouquetDecorator {

    public FlowersAdditional(String flowerName, int flowerCount) {
        List<String> additionalFlowers = new LinkedList<>();
        int flowerPrice = 0;
        switch (flowerName) {
            case (Flowers.ROSE):
                flowerPrice = Flowers.ROSE_PRICE;
                break;
            case (Flowers.CARNATION):
                flowerPrice = Flowers.CARNATION_PRICE;
                break;
            case (Flowers.ASTER):
                flowerPrice = Flowers.ASTER_PRICE;
                break;
            case (Flowers.CHAMOMILE):
                flowerPrice = Flowers.CHAMOMILE_PRICE;
                break;
            case (Flowers.TULIP):
                flowerPrice = Flowers.TULIP_PRICE;
                break;
        }
        for (int i = 0; i < flowerCount; i++) {
            additionalFlowers.add(flowerName);
        }
        int ADDITIONAL_PRICE = flowerPrice * flowerCount;
        setAdditionalPrice(ADDITIONAL_PRICE);
        setAdditionalComponent(additionalFlowers);
        String TO_NAME = "";
        setToName(TO_NAME + " + " + flowerCount + " " + flowerName + "(" + ADDITIONAL_PRICE + ")");
    }
}
