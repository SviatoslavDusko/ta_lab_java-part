package com.epam.lab.hw_12_annotation.task3;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.task3(myClass);
    }

    private void task3(Object object) throws NoSuchMethodException {
        Method method = object.getClass().getMethod("someMethod");
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        System.out.print(String.format("anInt: %s", annotation.anInt()));
    }
}

