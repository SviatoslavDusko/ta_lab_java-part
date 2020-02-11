package com.epam.lab.hw_10_lambda.task1;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface maxValue = (a, b, c) -> {
            if ((a > b) && (a > c)) {
                return a;
            } else if ((b > a) && (b > c)) {
                return b;
            } else return c;
        };

        System.out.println(maxValue.method(6, 4, 3));

        FunctionalInterface avgValue = (a, b, c) -> {
            if ((a > b && a < c) || (a < b && a > c)) {
                return a;
            } else if ((b > a && b < c) || (b < a && b > c)) {
                return b;
            } else return c;
        };

        System.out.println(avgValue.method(4, 3, 21));
    }
}
