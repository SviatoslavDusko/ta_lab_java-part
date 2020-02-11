package com.epam.lab.hw_7_8_collection.arrays.task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<TwoString> twoStringArrayList = new ArrayList<>();
        twoStringArrayList.add(new TwoString("Ukraine", "Kyiv"));
        twoStringArrayList.add(new TwoString("Germany", "Berlin"));
        twoStringArrayList.add(new TwoString("Russia", "Moscow"));
        twoStringArrayList.add(new TwoString("GB", "London"));
        twoStringArrayList.add(new TwoString("Poland", "Warsaw"));
        List<TwoString2> twoStringArrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            twoStringArrayList2.add(new TwoString2(twoStringArrayList.get(i).getCountry(), twoStringArrayList.get(i).getCapital()));
        }

        twoStringArrayList.sort(TwoString::compareTo);
        twoStringArrayList2.sort(TwoString2::compareTo);

        for (TwoString o : twoStringArrayList) {
            System.out.println(o);
        }
        System.out.println();
        for (TwoString2 o : twoStringArrayList2) {
            System.out.println(o);
        }

        System.out.println(Collections.binarySearch(twoStringArrayList, new TwoString("Poland", "Warsaw")));
    }
}
