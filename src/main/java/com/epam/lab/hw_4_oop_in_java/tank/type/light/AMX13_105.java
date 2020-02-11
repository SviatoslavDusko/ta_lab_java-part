package com.epam.lab.hw_4_oop_in_java.tank.type.light;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.France;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class AMX13_105 extends Tank {
    public AMX13_105() {
        super(200, 400, 70, 230, 1500, ARMOR_PIERCING, new France());
        useNationalityFeature();
    }

}
