package com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.task_b;

import com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.ArrayHW;

public class ArrayTask2 extends ArrayHW {
    private int[] arr1;

    public static void main(String[] args) {
        ArrayTask2 arrayTask2 = new ArrayTask2();
//        arrayTask2.arr1 = new int[]{5,5,12,10,12,5,5,10,5,12};
        arrayTask2.go();
    }

    public int[] getArr1() {
        return arr1;
    }

    private void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    private void go() {
        setArr1(generateArray());
        printArray(deleteElementsThatOccurMoreThanTwice(getArr1()));
    }
}
