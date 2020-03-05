package com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.task_c;

import com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.ArrayHW;

public class ArrayTask3 extends ArrayHW {
    private int[] arr1;

    public static void main(String[] args) {
        ArrayTask3 arrayTask3 = new ArrayTask3();
//        arrayTask3.arr1 = new int[]{5,5,5,5,5,5,12,12,12,12,12,5,5,10,10,5,12};
        arrayTask3.go();
    }

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    private void go() {
        setArr1(generateArray());
        printArray(deleteGroupOfNumbers(getArr1()));
    }
}
