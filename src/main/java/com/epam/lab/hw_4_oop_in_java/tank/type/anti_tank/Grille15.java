package com.epam.lab.hw_4_oop_in_java.tank.type.anti_tank;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.Germany;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class Grille15 extends Tank {
    public Grille15() {
        super(30, 700, 10, 270, 1400, ARMOR_PIERCING, new Germany());
        useNationalityFeature();
    }
}
