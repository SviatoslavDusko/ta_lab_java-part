package com.epam.lab.hw_4_oop_in_java.tank.type.anti_tank;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.Germany;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class Jg_Pz_E100 extends Tank {
    public Jg_Pz_E100() {
        super(240, 950, 1, 240, 2000, ARMOR_PIERCING, new Germany());
        useNationalityFeature();
    }
}
