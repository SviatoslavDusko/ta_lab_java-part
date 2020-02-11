package com.epam.lab.hw_4_oop_in_java.tank.type.medium;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.USA;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class M48Patton extends Tank {
    public M48Patton() {
        super(220, 400, 25, 250, 2000, ARMOR_PIERCING, new USA());
        useNationalityFeature();
    }
}
