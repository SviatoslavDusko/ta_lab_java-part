package com.epam.lab.hw_12_annotation.task5;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.task5(myClass, myClass.getClass());
    }

    private void task5(Object object, Class c) {
        Field[] fieldsArray = c.getDeclaredFields();
        for (Field field : fieldsArray) {
            field.setAccessible(true);
            try {
                switch (field.getType().getName()) {
                    case ("int"):
                        System.out.println("Before set value: " + field.get(object));
                        field.setInt(object, 10);
                        System.out.println("After set value: " + field.get(object));
                    case ("boolean"):
                        System.out.println("Before set value: " + field.get(object));
                        field.setBoolean(object, true);
                        System.out.println("After set value: " + field.get(object));
                    case ("char"):
                        System.out.println("Before set value: " + field.get(object));
                        field.setChar(object, 'a');
                        System.out.println("After set value: " + field.get(object));
//                    case ("String"):
//                        System.out.println("Before set value: " + field.get(object));
//                        field.set(object,"Hello");
//                        System.out.println("After set value: " + field.get(object));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
