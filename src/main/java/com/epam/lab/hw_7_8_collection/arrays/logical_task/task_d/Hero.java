package com.epam.lab.hw_7_8_collection.arrays.logical_task.task_d;

import java.util.Random;

class Hero {
    private int damage;

    Hero() {
        this.damage = 25;
    }

    void upDamage() {
        Random rand = new Random();
        int random = rand.nextInt(70) + 10;
        damage += random;
        System.out.println("Random Damage is +" + random + " Damage");
    }

    int getDamage() {
        return damage;
    }

    boolean goFight(int damageHero, int damageMonster) {
        if (damageHero >= damageMonster) {
            System.out.println("You killed a Monster !!! ");
            System.out.println("You Damage is: " + damageHero + ". Monster damage is : " + damageMonster);
            return true;
        } else {
            System.out.println("Monster killed you. You lost !!!");
            System.out.println("You damage is: " + damageHero + ". Monster damage is : " + damageMonster);
            return false;
        }
    }
}
