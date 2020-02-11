package com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.Nationality;

public class France implements Nationality {
    public void useFeature(Tank tank) {
        tank.setDamage((int) (tank.getDamage() * 1.05));
    }
}
