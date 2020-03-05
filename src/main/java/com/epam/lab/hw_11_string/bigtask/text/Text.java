package com.epam.lab.hw_11_string.bigtask.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    private List<Sentence> listOfSentence;
    private int countOfSentence;

    public Text() {
        this.listOfSentence = textToListOfSentence();
        this.countOfSentence = this.listOfSentence.size();
    }

    private String writeTextToString() {
        File file = new File("src/main/java/com/epam/lab/hw_11_string/bigtask/resources/file.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String text = "";
        while (scanner.hasNextLine()) {
            text = text + scanner.nextLine();
        }
        return text;
    }

    private List<Sentence> textToListOfSentence() {
        List<Sentence> listOfSentence = new ArrayList<>();
        for (String s : writeTextToString().split("(?<=[.!?])\\s*")) {
            listOfSentence.add(new Sentence(s));
        }
        return listOfSentence;
    }

    public List<Sentence> getListOfSentence() {
        return listOfSentence;
    }

    public int getCountOfSentence() {
        return countOfSentence;
    }
}
