package com.epam.lab.hw_12_annotation.task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.task4(myClass, myClass.getClass());
    }

    private void task4(Object object, Class c) {
        try {
            Method firstMethod = c.getDeclaredMethod("printSomething");
            Method secondMethod = c.getDeclaredMethod("getMyInt", Integer.class);
            Method thirdMethod = c.getDeclaredMethod("getMyIntWithParameters", Integer.class);
            firstMethod.invoke(object);
            secondMethod.invoke(object, 10);
            System.out.println(thirdMethod.invoke(object, 10));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
