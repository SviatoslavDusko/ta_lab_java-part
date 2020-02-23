package com.epam.lab.hw_13_io_nio.task2;

import java.io.Serializable;

public class Droid implements Serializable {
    private String name;
    transient private int id;

    public Droid(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
