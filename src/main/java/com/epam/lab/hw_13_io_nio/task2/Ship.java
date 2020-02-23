package com.epam.lab.hw_13_io_nio.task2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Serializable {
    private List<Droid> droidList = new ArrayList<>();

    private List<Droid> getDroidList() {
        return droidList;
    }

    public void putDroid(Droid droid) {
        this.droidList.add(droid);
    }

    public boolean getDroid(String nameDroid) {
        for (Droid droid : getDroidList()) {
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
