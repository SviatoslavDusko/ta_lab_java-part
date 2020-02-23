package com.epam.lab.hw_12_annotation.task7;

public class MyClass {
    private int a;
    private boolean bool;
    private String string;

    public MyClass(int a, boolean bool, String string) {
        this.a = a;
        this.bool = bool;
        this.string = string;
    }

    public MyClass() {
    }

    public void printSomething() {
        System.out.println("print some");
    }

    public int square(int a) {
        return a * a;
    }

    public int[] someMethod(int... args) {
        return args;
    }

}
