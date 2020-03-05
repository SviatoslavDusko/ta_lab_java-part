package com.epam.lab.hw_7_8_collection.generics.ship_with_droids;

import com.epam.lab.hw_7_8_collection.generics.ship_with_droids.droid.Droid;
import com.epam.lab.hw_7_8_collection.generics.ship_with_droids.droid.DroidType1;
import com.epam.lab.hw_7_8_collection.generics.ship_with_droids.droid.DroidType2;
import com.epam.lab.hw_7_8_collection.generics.ship_with_droids.droid.DroidType3;

public class Main {
    public static void main(String[] args) {
        Ship<Droid> ship = new Ship<>();

        ship.putDroid(new DroidType3("droid"));
        ship.putDroid(new DroidType1("droid1"));
        ship.putDroid(new DroidType2("droid2"));

        System.out.println(ship);

        System.out.println(ship.getDroid("Droid1"));//true
        System.out.println(ship.getDroid("DROID2"));//true
        System.out.println(ship.getDroid("droid"));//true
        System.out.println(ship.getDroid("droids"));//false
    }
}
