package com.epam.lab.hw_16_pattern.task3.decorator.abstr.delivery;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class BicycleDelivery extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = 50;
    private final String TO_NAME = " + Bicycle Delivery(" + ADDITIONAL_PRICE + ")";

    public BicycleDelivery() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
