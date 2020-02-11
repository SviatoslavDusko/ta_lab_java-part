package com.epam.lab.hw_7_8_collection.arrays.task4;

public class StrContainer {
    private String[] array;

    public StrContainer() {
        this.array = new String[10];
        initArray();
    }

    private String[] getArray() {
        return array;
    }

    private void setArray(String[] array) {
        this.array = array;
    }

    private void x2SizeArray() {
        String[] testArr = new String[(getArray().length) * 2];
        for (int i = 0; i < getArray().length; i++) {
            testArr[i] = get(i);
        }
        setArray(testArr);
        initArray();
    }

    //from null to ""
    private void initArray() {
        for (int i = 0; i < getArray().length; i++) {
            if (getArray()[i] == null) {
                getArray()[i] = "";
            }
        }
    }

    public boolean add(String string) {
        for (int i = 0; i < getArray().length; i++) {
            if (get(i).equals("")) {
                getArray()[i] = string;
                break;
            } else if (i == getArray().length - 1) {
                x2SizeArray();
            }
        }
        return true;
    }

    public String get(int index) {
        if (index >= 0 && index < array.length) {
            return this.array[index];
        } else {
            return "Please enter valid index from 0 to " + (array.length - 1) + ";";
        }
    }
}
