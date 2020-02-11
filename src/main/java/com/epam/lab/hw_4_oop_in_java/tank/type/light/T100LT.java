package com.epam.lab.hw_4_oop_in_java.tank.type.light;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.USSR;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class T100LT extends Tank {
    public T100LT() {
        super(215, 350, 65, 240, 1400, ARMOR_PIERCING, new USSR());
        useNationalityFeature();
    }
}
