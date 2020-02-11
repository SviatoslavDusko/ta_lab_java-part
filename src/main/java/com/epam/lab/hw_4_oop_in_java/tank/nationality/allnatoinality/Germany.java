package com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.Nationality;

public class Germany implements Nationality {
    public void useFeature(Tank tank) {
        tank.setEvasion((int) (tank.getEvasion() * 1.2));
    }
}
