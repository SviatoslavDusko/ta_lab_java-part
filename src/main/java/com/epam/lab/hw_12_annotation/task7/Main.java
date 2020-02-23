package com.epam.lab.hw_12_annotation.task7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MyClass myClass = new MyClass();
        main.task7(myClass);
    }

    private void task7(Object object) {
        System.out.println("Class name: " + object.getClass().getSimpleName() + '\n');
        Field[] fieldsArray = object.getClass().getDeclaredFields();
        Constructor[] constructorsArray = object.getClass().getConstructors();
        Method[] methodsArray = object.getClass().getDeclaredMethods();
        System.out.println("Fields: ");
        for (Field field : fieldsArray) {
            System.out.println("    Modifier: " + Modifier.toString(field.getModifiers()) + '\n' +
                    "    Type: " + field.getType() + '\n' +
                    "    Name: " + field.getName() + '\n'
            );
        }
        System.out.println("Constructors: ");
        for (Constructor constructor : constructorsArray) {
            System.out.println(
                    "   Modifier: " + Modifier.toString(constructor.getModifiers()) + '\n' +
                            "   Parameter count: " + constructor.getParameterCount() + '\n' +
                            "   Parameter types: " + Arrays.toString(constructor.getParameterTypes()) + '\n'
            );
        }
        System.out.println("Methods: ");
        for (Method method : methodsArray) {
            System.out.println(
                    "   Modifier: " + Modifier.toString(method.getModifiers()) + '\n' +
                            "   Return type: " + method.getReturnType() + '\n' +
                            "   Name: " + method.getName() + '\n' +
                            "   Parameter count: " + method.getParameterCount() + '\n' +
                            "   Parameter types: " + Arrays.toString(method.getParameterTypes()) + '\n'
            );
        }
    }
}
