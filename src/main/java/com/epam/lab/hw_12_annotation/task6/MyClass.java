package com.epam.lab.hw_12_annotation.task6;

import java.util.Arrays;

class MyClass {
    void myMethod(String a, int... args) {
        System.out.println(a + ", " + Arrays.toString(args));
    }

    void myMethod(String... args) {
        System.out.println(Arrays.toString(args));
    }
}
