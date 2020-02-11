package com.epam.lab.hw_7_8_collection.generics.ship_with_droids;

import java.util.ArrayList;
import java.util.List;

public class Ship<T extends Droid> {
    private List<T> droidList = new ArrayList<>();

    private List<T> getDroidList() {
        return droidList;
    }

    public void putDroid(T droid) {
        this.droidList.add(droid);
    }

    public boolean getDroid(String nameDroid) {
        for (T droid : getDroidList()) {
            if (droid.getName().toLowerCase().equals(nameDroid.toLowerCase())) {
                getDroidList().remove(droid);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "droidList=" + droidList +
                '}';
    }
}
