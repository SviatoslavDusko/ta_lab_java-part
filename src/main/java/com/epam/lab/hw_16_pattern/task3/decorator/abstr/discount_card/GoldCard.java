package com.epam.lab.hw_16_pattern.task3.decorator.abstr.discount_card;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class GoldCard extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = -70;
    private final String TO_NAME = " + Gold Card(" + ADDITIONAL_PRICE + ")";

    public GoldCard() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
