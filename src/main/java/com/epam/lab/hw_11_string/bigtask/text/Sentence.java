package com.epam.lab.hw_11_string.bigtask.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {
    private List<Symbol> symbolList;
    private List<Symbol> wordList;
    private int countOfWord;

    Sentence(String sentence) {
        this.symbolList = sentenceToListOfSymbol(sentence);
        this.wordList = setOnlyWordList();
        this.countOfWord = getOnlyWordList().size();
    }

    public List<Symbol> getSymbolList() {
        return symbolList;
    }

    public int getCountOfWord() {
        return countOfWord;
    }

    public int getSize() {
        return symbolList.size();
    }

    public int getLongestWordIndex() {
        int maxLongWord = 0;
        int index = 0;
        for (int i = 0; i < getOnlyWordList().size(); i++) {
            if (getOnlyWordList().get(i).getSymbol().length() > maxLongWord) {
                maxLongWord = getOnlyWordList().get(i).getSymbol().length();
                index = i;
            }
        }
        return index;
    }

    private List<Symbol> sentenceToListOfSymbol(String sentence) {
        List<Symbol> listOfSymbol = new ArrayList<>();
        for (String symbol : Arrays.asList(sentence.split("[ ]\\s*"))) {
            listOfSymbol.add(new Symbol(symbol));
        }
        for (int i = 0; i < listOfSymbol.size(); i++) {
            if (!new Symbol("" + listOfSymbol.get(i).getSymbol()
                    .charAt(listOfSymbol.get(i).getSymbol().length() - 1))
                    .isWord() && listOfSymbol.get(i).getSymbol().length() != 1) {
                listOfSymbol.add(i + 1, new Symbol("" + listOfSymbol.get(i).getSymbol()
                        .charAt(listOfSymbol.get(i).getSymbol().length() - 1)));
                listOfSymbol.get(i).deleteLastChar();
                i++;
            }
        }
        return listOfSymbol;
    }

    public void task5() {
        int longestWordIndex = getLongestWordIndex();
        int indexOfFirstWordWithFirstVowelLetter = 0;
        Symbol firstWordWithFirstVowelLetter = new Symbol("");
        for (int j = 0; j < getOnlyWordList().size(); j++) {
            if (getOnlyWordList().get(j).isFirstLetterVowel()) {
                indexOfFirstWordWithFirstVowelLetter = j;
                firstWordWithFirstVowelLetter = getOnlyWordList().get(j);
                break;
            }
        }
        System.out.println("First word with first vovel letter: " +
                getOnlyWordList().get(indexOfFirstWordWithFirstVowelLetter));
        System.out.println("Longest word: " + getOnlyWordList().get((longestWordIndex)));
        this.wordList.remove(indexOfFirstWordWithFirstVowelLetter);
        this.wordList.add(indexOfFirstWordWithFirstVowelLetter, this.wordList.get((longestWordIndex - 1)));
        this.wordList.remove((longestWordIndex));
        this.wordList.add((longestWordIndex), firstWordWithFirstVowelLetter);
    }

    public List<Symbol> setOnlyWordList() {
        List<Symbol> wordList = new ArrayList<>();
        for (Symbol symbol : getSymbolList()) {
            if (symbol.isWord()) {
                wordList.add(symbol);
            }
        }
        return wordList;
    }

    public List<Symbol> getOnlyWordList() {
        return wordList;
    }

    @Override
    public String toString() {
        return symbolList + "\n";
    }
}
