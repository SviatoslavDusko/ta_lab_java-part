package com.epam.lab.hw_4_oop_in_java.tank.nationality.allnatoinality;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.nationality.Nationality;

public class USSR implements Nationality {
    public void useFeature(Tank tank) {
        tank.setHealth((int) (tank.getHealth() * 1.1));
    }
}
