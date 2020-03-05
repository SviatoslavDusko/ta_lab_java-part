package com.epam.lab.hw_12_annotation.task6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.task6(myClass, myClass.getClass());
    }

    private void task6(Object object, Class c) {
        final String[] strArray = {"one", "two", "three"};
        int[] intArray = {1, 2, 3};
        try {
            Method firstMethod = c.getDeclaredMethod("myMethod", String[].class);
            Method secondMethod = c.getDeclaredMethod("myMethod", String.class, int[].class);
            firstMethod.invoke(object, new Object[]{strArray});
            secondMethod.invoke(object, "one", intArray);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
