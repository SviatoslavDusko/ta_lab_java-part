package com.epam.lab.hw_5_exception.exceptionsTask2;

import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Color;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Type;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.enum_exceptions.*;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) throws TypeException, ColorException {
        ArrayList<Plants> plantsArray = new ArrayList<Plants>();

        plantsArray.add(new Plants(Color.RED, 100, Type.FLOWERS));
        plantsArray.add(new Plants(Color.GREEN, 10, Type.MOSSES));

        for (Plants plants : plantsArray) {
            System.out.println(plants);
        }
    }
}
