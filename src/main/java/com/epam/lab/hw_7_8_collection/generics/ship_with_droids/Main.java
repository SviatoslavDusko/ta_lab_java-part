package com.epam.lab.hw_7_8_collection.generics.ship_with_droids;

public class Main {
    public static void main(String[] args) {
        Ship<Droid> ship = new Ship<>();

        ship.putDroid(new Droid("droid"));
        ship.putDroid(new DroidType1("droid1"));
        ship.putDroid(new DroidType2("droid2"));

        System.out.println(ship);

        System.out.println(ship.getDroid("Droid1"));
        System.out.println(ship.getDroid("DROID2"));
        System.out.println(ship.getDroid("droid"));
        System.out.println(ship.getDroid("droids"));
    }
}
