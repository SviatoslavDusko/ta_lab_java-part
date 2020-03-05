package com.epam.lab.hw_11_string.bigtask.task6;

import com.epam.lab.hw_11_string.bigtask.text.Sentence;
import com.epam.lab.hw_11_string.bigtask.text.Symbol;
import com.epam.lab.hw_11_string.bigtask.text.Text;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.task6();
    }

    private Set<String> task6() {
        Text text = new Text();
        Set<String> wordsSet = new TreeSet<>();
        for (Sentence sentence : text.getListOfSentence()) {
            for (Symbol symbol : sentence.getOnlyWordList()) {
                wordsSet.add(symbol.getSymbol().toLowerCase());
            }
        }
        List<String> wordsList;
        wordsList = Arrays.asList(wordsSet.toArray(new String[wordsSet.size()]));
        for (int i = 0; i < wordsList.size(); i++) {
            if (i != (wordsList.size() - 1) && wordsList.get(i).charAt(0) != wordsList.get(i + 1).charAt(0)) {
                System.out.println(wordsList.get(i));
            } else {
                System.out.print(wordsList.get(i) + " ");
            }
        }
        return wordsSet;
    }
}
