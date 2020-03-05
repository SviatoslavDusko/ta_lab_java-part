package com.epam.lab.hw_16_pattern.task3.decorator.abstr.packaging;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class Tape extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = 5;
    private final String TO_NAME = " + Tape(" + ADDITIONAL_PRICE + ")";

    public Tape() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
