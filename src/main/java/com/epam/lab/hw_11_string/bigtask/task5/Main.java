package com.epam.lab.hw_11_string.bigtask.task5;

import com.epam.lab.hw_11_string.bigtask.text.Sentence;
import com.epam.lab.hw_11_string.bigtask.text.Symbol;
import com.epam.lab.hw_11_string.bigtask.text.Text;

public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        for (Sentence s : text.getListOfSentence()) {
            s.task5();
            System.out.println(s.getOnlyWordList() + "\n");
        }
    }
}
