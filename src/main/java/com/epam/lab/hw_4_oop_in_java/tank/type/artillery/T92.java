package com.epam.lab.hw_4_oop_in_java.tank.type.artillery;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality.USA;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.EXPLOSIVE;

public class T92 extends Tank {
    public T92() {
        super(20, 1500, 1, 500, 600, EXPLOSIVE, new USA());
        useNationalityFeature();
    }
}
