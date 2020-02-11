package com.epam.lab.hw_4_oop_in_java.tank.type.artillery;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.USSR;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.EXPLOSIVE;

public class Object261 extends Tank {
    public Object261() {
        super(1, 1000, 1, 500, 700, EXPLOSIVE, new USSR());
        useNationalityFeature();
    }
}
