package com.epam.lab.hw_7_8_collection.arrays.logical_task.task_d;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Game {
    private List<Door> getDoorList = new ArrayList<Door>();
    private Hero hero;

    Game() {
        setDoorList();
        this.hero = new Hero();
    }

    private List<Door> getDoorList() {
        return getDoorList;
    }

    private void setDoorList() {
        initDoorList();
    }

    private Hero getHero() {
        return hero;
    }

    void go() {
        int numbDoor;
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter " + (i + 1) + " door number(1-10) : ");
            numbDoor = scanInt();
            if ((numbDoor < 1) || (numbDoor > 10)) {
                System.out.println("Please enter correct door number(1-10) : ");
                numbDoor = scanInt();
            }
            boolean randBool = isTrueRand();
            for (int j = 0; j < 10; j++) {
                if (numbDoor == (j + 1) && !getDoorList().get(j).isStatusDoor()) {
                    getDoorList().get(j).setStatusDoor();
                    System.out.println("Behind The door " + (j + 1) + " : " +
                            returnBehindTheDoor(getDoorList().get(j).getBehindTheDoor(randBool)) + ".");
                    if (getDoorList().get(j).getBehindTheDoor(randBool)) {
                        getHero().upDamage();
                        System.out.println("Damage Hero is : " + getHero().getDamage());
                    } else {
                        if (!getHero().goFight(getHero().getDamage(), (new Monster().getDamageMonster()))) {
                            return;
                        }
                    }
                } else {
                    if (numbDoor == j + 1 && getDoorList().get(j).isStatusDoor()) {
                        System.out.println("Please enter correct door number, this door was opened : ");
                        i--;
                    }
                }
            }
        }
    }

    private String returnBehindTheDoor(boolean bool) {
        if (bool) {
            return "Artifact";
        } else {
            return "Monster";
        }
    }

    private int scanInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private boolean isTrueRand() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private void initDoorList() {
        for (int i = 0; i < 10; i++) {
            this.getDoorList.add(new Door(i + 1, isTrueRand()));
        }
    }
}
