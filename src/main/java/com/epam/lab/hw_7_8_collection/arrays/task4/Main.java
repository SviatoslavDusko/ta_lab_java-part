package com.epam.lab.hw_7_8_collection.arrays.task4;

public class Main {

    public static void main(String[] args) {
        StrContainer stringContainer = new StrContainer();

        stringContainer.add("Hello ");
        stringContainer.add("World.");

        for (int i = 0; i < 2; i++) {
            System.out.print(stringContainer.get(i));
        }
    }
}
