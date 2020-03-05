package com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.task_a;

import com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks.ArrayHW;

public class ArrayTask1 extends ArrayHW {
    private int[] arr1;
    private int[] arr2;
    private int[] arr3;
    private int[] arr4;

    public static void main(String[] args) {
        ArrayTask1 arrayTask1 = new ArrayTask1();
        arrayTask1.go();

    }

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public int[] getArr2() {
        return arr2;
    }

    public void setArr2(int[] arr2) {
        this.arr2 = arr2;
    }

    public int[] getArr3() {
        return arr3;
    }

    public void setArr3(int[] arr3) {
        this.arr3 = arr3;
    }

    public int[] getArr4() {
        return arr4;
    }

    public void setArr4(int[] arr4) {
        this.arr4 = arr4;
    }

    private void go() {
        setArr1(generateArray());
        System.out.print("arr1");
        printArray(getArr1());
        setArr2(generateArray());
        System.out.print("arr2");
        printArray(getArr2());
        setArr3(setArrayFromElementsPresentsInTwoArrays(getArr1(), getArr2()));
        System.out.print("arr3");
        printArray(getArr3());
        setArr4(setArrayFromElementsPresentOnlyInOneArray(arr1, arr2));
        System.out.print("arr4");
        printArray(getArr4());
    }
}
