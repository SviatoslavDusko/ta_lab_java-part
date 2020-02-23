package com.epam.lab.hw_11_string.bigtask.text;

public class Symbol {
    private String symbol;

    public Symbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isWord() {
        switch (symbol) {
            case (","):
            case (":"):
            case ("-"):
            case (";"):
            case ("("):
            case (")"):
            case ("."):
            case ("?"):
            case ("!"):
                return false;
        }
        return true;
    }

    public boolean isFirstLetterVowel() {
        return isLetterVowel(symbol.charAt(0));
    }

    private boolean isLetterVowel(char letter) {
        switch (letter) {
            case ('a'):
            case ('e'):
            case ('i'):
            case ('o'):
            case ('u'):
            case ('y'):
                return true;
        }
        return false;
    }

    void deleteLastChar() {
        if (this.symbol.length() == 1) {
            return;
        }
        String word = "";
        for (int i = 0; i < symbol.length() - 1; i++) {
            word = word + symbol.charAt(i);
        }
        this.symbol = word;
    }

    public double getPercentOfVowelLetter() {
        double countOfVowelTeller = 0;
        for (int i = 0; i < getSymbol().length(); i++) {
            if (isLetterVowel(getSymbol().charAt(i))) {
                countOfVowelTeller++;
            }
        }
        return (countOfVowelTeller / getSymbol().length()) * 100;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
