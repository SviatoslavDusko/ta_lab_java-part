package com.epam.lab.hw_10_lambda.task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Application {
    private final static Logger log = LogManager.getLogger(Application.class);
    private List<String> sentencesList;
    private List<String> wordsList;

    public Application() {
        sentencesList = readTextFromConsole();
        wordsList = new LinkedList<>();
        listSentenceToListWord();
    }

    public void start() {
        log.info(calculateUniqueWords());
        log.info(getSortedListOfUniqueWords());
        log.info(getMapWithCountOfEachWord());
        log.info(getMapWithCountOfEachLetter());
    }

    private List<String> readTextFromConsole() {
        Scanner scan = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        String line;
        do {
            line = scan.nextLine();
            if (line.length() != 0) {
                list.add(line);
            }
        } while (line.length() != 0);
        return list;
    }

    private void listSentenceToListWord() {
        for (String sentence : sentencesList) {
            wordsList.addAll(Arrays.asList(sentence.split("\\s+")));
        }
    }

    private int calculateUniqueWords() {
        return wordsList.stream().distinct().collect(Collectors.toList()).size();
    }

    private List<String> getSortedListOfUniqueWords() {
        return wordsList.stream().distinct().sorted().collect(Collectors.toList());
    }

    private Map getMapWithCountOfEachWord() {
        return wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private Map getMapWithCountOfEachLetter() {
        HashMap<Character, Integer> map = new HashMap<>();
        for (String word : wordsList) {
            for (char c : word.toLowerCase().toCharArray()) {
                map.merge(c, 1, Integer::sum);
            }
        }
        return map;
    }
}
