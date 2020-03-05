package com.epam.lab.hw_16_pattern.task3.bouquet;

import java.util.List;

public interface Bouquet {
    int getPrice();

    String getName();

    String getEventType();

    List<String> getFlowersList();
}
