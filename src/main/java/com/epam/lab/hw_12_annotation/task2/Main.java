package com.epam.lab.hw_12_annotation.task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.someMethod(myClass, myClass.getClass());
    }

    private void someMethod(Object object, Class c) throws IllegalAccessException {
        Field[] fieldsArray = c.getDeclaredFields();
        for (Field field : fieldsArray) {
            Annotation[] annotationsArray = field.getDeclaredAnnotations();
            for (Annotation annotation : annotationsArray) {
                if (annotation.annotationType().equals(MyAnnotation.class)) {
                    System.out.println(field.get(object));
                }
            }
        }
    }
}

