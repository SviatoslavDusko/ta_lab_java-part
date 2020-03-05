package com.epam.lab.hw_9_collections_enum.console_menu;

public enum Cars {
    BMW("BMW"), AUDI("Audi"), VW("Volkswagen"), MERCEDES("Mercedes"), NISSAN("Nissan");

    private String value;

    Cars(String car) {
        this.value = car;
    }

    @Override
    public String toString() {
        return value;
    }
}
