package com.epam.lab.hw_11_string.bigtask.task7;

import com.epam.lab.hw_11_string.bigtask.text.Sentence;
import com.epam.lab.hw_11_string.bigtask.text.Symbol;
import com.epam.lab.hw_11_string.bigtask.text.Text;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task7();
    }

    private void task7() {
        Text text = new Text();
//        Integer i = 0;
        List<Symbol> wordList = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        Map<Double, String> wordMap = new HashMap<>();
        for (Sentence sentence : text.getListOfSentence()) {
            for (Symbol word : sentence.getOnlyWordList()) {
                if (wordMap.containsKey(word.getPercentOfVowelLetter())) {
//                    wordSet.add(word.getSymbol().toLowerCase() + ", " + wordMap.get(word.getPercentOfVowelLetter()));
                    wordMap.put(word.getPercentOfVowelLetter(), word.getSymbol().toLowerCase() + ", " + wordMap.get(word.getPercentOfVowelLetter()));
                } else {
//                    wordSet.add(word.getSymbol().toLowerCase());
                    wordMap.put(word.getPercentOfVowelLetter(), word.getSymbol().toLowerCase());
                }
//                wordSet = new HashSet<>();
            }
        }
        System.out.println(wordMap);
        wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
