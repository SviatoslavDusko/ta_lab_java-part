package com.epam.lab.hw_9_collections_enum.console_menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;
import java.util.TreeMap;

public class Menu {
    private final static Logger log = LogManager.getLogger(Menu.class);

    private Map<Integer, Cars> map;

    public Menu() {
        this.map = new TreeMap<>();
        for (int i = 0; i < Cars.values().length; i++) {
            this.map.put(i + 1, Cars.values()[i]);
        }
    }

    public Map<Integer, Cars> getMap() {
        return map;
    }

    public int getCarMapSize() {
        return map.size();
    }

    public String getCarName(int index) {
        return map.get(index).toString();
    }

    public void printMenu() {
        for (int i = 0; i < Cars.values().length; i++) {
            log.info(((i + 1) + " - \"" + map.get(i + 1) + "\""));
            if (i == Cars.values().length - 1) {
                log.info((i + 2) + " - Close Menu");
            }
        }
    }

    public void close() {
        log.info("Closed complete.");
        System.exit(0);
    }
}
