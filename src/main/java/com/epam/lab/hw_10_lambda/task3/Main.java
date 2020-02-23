package com.epam.lab.hw_10_lambda.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    private List<Integer> integerList;

    public Main() {
        this.integerList = generateList();
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getIntegerList());

        System.out.println("Average value :" + main.getAvgValue());
        System.out.println("Max value :" + main.getMax());
        System.out.println("Min value :" + main.getMin());
        System.out.println("Sum :" + main.getSum());
        System.out.println("Count number of values that are bigger than average :" + main.countValuesBiggerThanAvg());
    }

    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        int size = (5 + (int) (Math.random() * 10));
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * 20));
        }
        return list;
    }

    private double getAvgValue() {
        return getIntegerList().stream().mapToInt(e -> e).average().getAsDouble();
    }

    private Integer getMax() {
        return getIntegerList().stream().max(Integer::compareTo).get();
    }

    private Integer getMin() {
        return getIntegerList().stream().min(Integer::compareTo).get();
    }

    private Integer getSum() {
        return getIntegerList().stream().mapToInt(s -> s).sum();
    }

    private Integer countValuesBiggerThanAvg() {
        Integer i = 0;
        for (Integer element : getIntegerList()) {
            if (element > getAvgValue()) {
                i++;
            }
        }
        return i;
    }
}
