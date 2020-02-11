package com.epam.lab.hw_4_oop_in_java.tank.type.medium;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.France;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class B_C25t extends Tank {
    public B_C25t() {
        super(210, 400, 45, 240, 1900, ARMOR_PIERCING, new France());
        useNationalityFeature();
    }
}
