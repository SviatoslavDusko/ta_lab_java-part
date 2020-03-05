package com.epam.lab.hw_16_pattern.task3.decorator.abstr.delivery;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class CarDelivery extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = 150;
    private final String TO_NAME = " + Car Delivery(" + ADDITIONAL_PRICE + ")";

    public CarDelivery() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
