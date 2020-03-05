package com.epam.lab.hw_16_pattern.task3.decorator.abstr.discount_card;

import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;

public class SocialCard extends BouquetDecorator {
    private final int ADDITIONAL_PRICE = -30;
    private final String TO_NAME = " + Social Card(" + ADDITIONAL_PRICE + ")";

    public SocialCard() {
        setAdditionalPrice(ADDITIONAL_PRICE);
        setToName(TO_NAME);
    }
}
