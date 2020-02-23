package com.epam.lab.hw_11_string.bigtask.task1;

import com.epam.lab.hw_11_string.bigtask.text.Text;

public class Main {
    private int count;

    public static void main(String[] args) {
        Main main = new Main();
        Text text = new Text();

//        System.out.println(text.getListOfSentence());
        main.countSentencesThatHaveTheSameWords(text);
        System.out.println(main.getCount());
    }

    private void countSentencesThatHaveTheSameWords(Text text) {
        for (int k = 0; k < text.getListOfSentence().size(); k++) {
            for (int i = 0; i < text.getListOfSentence().get(k).getSize() - 1; i++) {
                int a = count;
                for (int j = i + 1; j < text.getListOfSentence().get(k).getSize(); j++) {
                    if (text.getListOfSentence().get(k).getSymbolList().get(i).getSymbol().
                            equals(text.getListOfSentence().get(k).getSymbolList().get(j).getSymbol())
                            && text.getListOfSentence().get(k).getSymbolList().get(j).isWord()) {
                        this.count++;
                        System.out.println
                                ("index of sentence :" + k);
                        break;
                    }
                }
                if (a != count) {
                    break;
                }
            }
        }
    }

    private int getCount() {
        return count;
    }
}
