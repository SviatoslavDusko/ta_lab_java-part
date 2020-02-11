package com.epam.lab.hw_4_oop_in_java.tank.type.heavy;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.USA;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;

public class T110E5 extends Tank {
    public T110E5() {
        super(250, 400, 5, 230, 2400, ARMOR_PIERCING, new USA());
        useNationalityFeature();
    }
}
