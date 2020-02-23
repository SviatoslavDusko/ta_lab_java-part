package com.epam.lab.hw_11_string.bigtask.task3;

import com.epam.lab.hw_11_string.bigtask.text.Text;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getUniqueWord());
    }

    private String getUniqueWord() {
        Text text = new Text();
        System.out.println(text.getListOfSentence());
        boolean hasFirstSentenceUniqueWord;
        int countOfNotUniqueWordsOnSentence;
        int countOfSentencesThatNotContainsUniqueWord;

        for (int i = 0; i < text.getListOfSentence().get(0).getOnlyWordList().size(); i++) {
            countOfSentencesThatNotContainsUniqueWord = 0;
            hasFirstSentenceUniqueWord = false;
            countOfNotUniqueWordsOnSentence = 0;
            for (int j = 1; j < text.getCountOfSentence(); j++) {
                for (int k = 0; k < text.getListOfSentence().get(j).getOnlyWordList().size(); k++) {
                    if (text.getListOfSentence().get(0).getOnlyWordList().get(i).getSymbol()
                            .equalsIgnoreCase(text.getListOfSentence().get(j).getOnlyWordList().get(k).getSymbol())) {
                        break;
                    } else {
                        countOfNotUniqueWordsOnSentence++;
                    }
                    if (countOfNotUniqueWordsOnSentence == text.getListOfSentence().get(j).getOnlyWordList().size()) {
                        hasFirstSentenceUniqueWord = true;
                    }
                }
                if (hasFirstSentenceUniqueWord) {
                    countOfSentencesThatNotContainsUniqueWord++;
                    countOfNotUniqueWordsOnSentence = 0;
                    hasFirstSentenceUniqueWord = false;
                }
            }
            if (countOfSentencesThatNotContainsUniqueWord == text.getCountOfSentence() - 1) {
                return text.getListOfSentence().get(0).getOnlyWordList().get(i).getSymbol().toLowerCase();
            }
        }
        return "";
    }
}
