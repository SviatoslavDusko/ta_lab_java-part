package com.epam.lab.hw_7_8_collection.arrays.logical_task.array_tasks;

public class ArrayHW {

    public int[] generateArray() {
        int[] arr;
        arr = new int[randFrom1To10()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randFrom1To10();
        }
        return arr;
    }

    private int randFrom1To10() {
        return 1 + (int) (Math.random() * 10);
    }

    public void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(" ]\n");
    }

    private void to0NotUniqueValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    arr[i] = 0;
                    break;
                }
            }
        }
    }

    private int[] delete0Values(int[] arr) {
        int[] resultArray = new int[getCountOfNot0Elements(arr)];
        int count = 0;
        for (int el : arr) {
            if (el != 0) {
                resultArray[count] = el;
                count++;
            }
        }
        return resultArray;
    }

    private int getCountOfNot0Elements(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el != 0) {
                count++;
            }
        }
        return count;
    }

    public int[] setArrayFromElementsPresentsInTwoArrays(int[] arr1, int[] arr2) {
        int[] resultArray = new int[10];
        int i = 0;
        int j = 0;
        for (int el1 : arr1) {
            for (int el2 : arr2) {
                if (el1 == el2) {
                    resultArray[i] = el1;
                    i++;
                    break;
                }
            }
        }
        to0NotUniqueValues(resultArray);
        resultArray = delete0Values(resultArray);
        return resultArray;
    }

    private void to0ElementsInArray1ThatContainsElementsArray2(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int el2 : arr2) {
                if (arr1[i] == el2) {
                    arr1[i] = 0;
                    break;
                }
            }
        }
    }

    public int[] setArrayFromElementsPresentOnlyInOneArray(int[] arr1, int[] arr2) {
        int[] arrOfElementsPresentsInTwoArrays;
        int[] testArray = new int[(arr1.length + arr2.length)];
        int count = 0;
        arrOfElementsPresentsInTwoArrays = setArrayFromElementsPresentsInTwoArrays(arr1, arr2);
        to0ElementsInArray1ThatContainsElementsArray2(arr1, arrOfElementsPresentsInTwoArrays);
        to0ElementsInArray1ThatContainsElementsArray2(arr2, arrOfElementsPresentsInTwoArrays);
        arr1 = delete0Values(arr1);
        arr2 = delete0Values(arr2);
        for (int el : arr1) {
            testArray[count] = el;
            count++;
        }
        for (int el : arr2) {
            testArray[count] = el;
            count++;
        }
        to0NotUniqueValues(testArray);
        return delete0Values(testArray);
    }

    public int[] deleteElementsThatOccurMoreThanTwice(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[i] == arr[k]) {
                            arr[j] = 0;
                            arr[k] = 0;
                        }
                    }
                }
            }
        }
        return delete0Values(arr);
    }

    public int[] deleteGroupOfNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    while (arr[i] == arr[j]) {
                        arr[j] = 0;
                        if (j == arr.length - 1) {
                            break;
                        } else {
                            j++;
                        }
                    }
                    break;
                }
            }
        }
        return delete0Values(arr);
    }
}
