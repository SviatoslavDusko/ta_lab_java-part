package com.epam.lab.hw_5_exception.exceptionsTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTask1 {
    public static void main(String[] args) {
        ExceptionsTask1 exceptionsTask1 = new ExceptionsTask1();
        exceptionsTask1.scanAndCalculate();
    }

    public int squareRectangle(int a, int b) {
        try {
            if (isPositiveNumbers(a, b)) {
                System.out.println("Square rectangle = " + a * b + ";");
                return a * b;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please, enter POSITIVE numbers(width and length)!");
            return scanAndCalculate();
        }
    }

    private Boolean isPositiveNumbers(int a, int b) {
        return a > 0 && b > 0;
    }

    private int scanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please, enter only positive NUMBERS!!!");
            return scanner();
        }
    }

    private int scanAndCalculate() {
        System.out.println("Please, enter two positive numbers(width and length):");
        int a = scanner();
        int b = scanner();
        return squareRectangle(a, b);
    }
}
