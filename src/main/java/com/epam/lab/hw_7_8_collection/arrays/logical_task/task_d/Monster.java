package com.epam.lab.hw_7_8_collection.arrays.logical_task.task_d;

import java.util.Random;

public class Monster {
    private int DamageMonster;

    public Monster() {
        Random rand = new Random();
        DamageMonster = rand.nextInt(95) + 5;
    }

    public int getDamageMonster() {
        return DamageMonster;
    }
}
