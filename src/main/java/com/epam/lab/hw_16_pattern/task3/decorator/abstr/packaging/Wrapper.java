package com.epam.lab.hw_16_pattern.task3.decorator.abstr.packaging;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class Wrapper extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = 20;
    private final String TO_NAME = " + Wrapper(" + ADDITIONAL_PRICE + ")";

    public Wrapper() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
