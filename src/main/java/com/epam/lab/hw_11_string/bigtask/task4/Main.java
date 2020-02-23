package com.epam.lab.hw_11_string.bigtask.task4;

import com.epam.lab.hw_11_string.bigtask.text.Sentence;
import com.epam.lab.hw_11_string.bigtask.text.Symbol;
import com.epam.lab.hw_11_string.bigtask.text.Text;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.task4(2));
    }

    private Set<String> task4(int wordLength) {
        Text text = new Text();
        Set<String> wordsSet = new HashSet<>();
        for (Sentence sentence : text.getListOfSentence()) {
            if (sentence.getSymbolList().get(sentence.getSymbolList().size() - 1).getSymbol().equals("?")) {
                for (Symbol symbol : sentence.getOnlyWordList()) {
                    if (symbol.getSymbol().length() == wordLength) {
                        wordsSet.add(symbol.getSymbol());
                    }
                }
            }
        }
        return wordsSet;
    }
}
