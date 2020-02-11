package com.epam.lab.hw_4_oop_in_java.tank.type.heavy;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.France;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class AMX50B extends Tank {
    public AMX50B() {
        super(230, 450, 10, 280, 2400, ARMOR_PIERCING, new France());
        useNationalityFeature();
    }
}
