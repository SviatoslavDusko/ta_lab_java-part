package com.epam.lab.hw_13_io_nio.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task2();
    }

    private void task2() {
        Ship ship = new Ship();
        ship.putDroid(new Droid("droid1", 1));
        ship.putDroid(new Droid("droid2", 2));
        ship.putDroid(new Droid("droid3", 3));
        ship.putDroid(new Droid("droid4", 4));
        System.out.println(ship);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ship);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("file");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Ship newShip = (Ship) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(newShip);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
