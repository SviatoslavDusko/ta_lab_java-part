package com.epam.lab.hw_5_exception.exceptionsTask2;

import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Color;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.Type;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.enum_exceptions.ColorException;
import com.epam.lab.hw_5_exception.exceptionsTask2.enums.enum_exceptions.TypeException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws TypeException, ColorException {
        ArrayList<Plants> plantsArray = new ArrayList<>();

        plantsArray.add(new Plants(Color.RED, 100, Type.ALGAE));//TypeException
        plantsArray.add(new Plants(Color.WHITE, 100, Type.FLOWERS));//ColorException
        plantsArray.add(new Plants(Color.GREEN, 10, Type.MOSSES));

        System.out.println(plantsArray);
    }
}
