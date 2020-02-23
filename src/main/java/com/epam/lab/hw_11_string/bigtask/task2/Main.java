package com.epam.lab.hw_11_string.bigtask.task2;

import com.epam.lab.hw_11_string.bigtask.text.Sentence;
import com.epam.lab.hw_11_string.bigtask.text.Text;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        Map<Integer, Sentence> mapOfSentence = new HashMap<>();

        for (int i = 0; i < text.getCountOfSentence(); i++) {
            mapOfSentence.put(text.getListOfSentence().get(i).getCountOfWord(), text.getListOfSentence().get(i));
        }

        mapOfSentence.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
