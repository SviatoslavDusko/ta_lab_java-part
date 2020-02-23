package com.epam.lab.hw_7_8_collection.generics.ship_with_droids.droid;

public class Droid {
    String name;

    public Droid(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                '}';
    }
}
