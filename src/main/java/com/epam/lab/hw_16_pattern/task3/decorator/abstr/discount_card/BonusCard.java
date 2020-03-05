package com.epam.lab.hw_16_pattern.task3.decorator.abstr.discount_card;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class BonusCard extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = -50;
    private final String TO_NAME = " + Bonus Card(" + ADDITIONAL_PRICE + ")";

    public BonusCard() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
