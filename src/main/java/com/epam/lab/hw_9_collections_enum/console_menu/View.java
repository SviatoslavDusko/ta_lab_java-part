package com.epam.lab.hw_9_collections_enum.console_menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class View {
    private static final Logger log = LogManager.getLogger(View.class);

    private Menu menu;

    public View() {
        this.menu = new Menu();
    }

    public void printMenu() {
        this.menu.printMenu();
    }

    public void start() {
        log.info("Please choose a car");
        printMenu();
        int carNumber = input();
        if (carNumber == menu.getCarMapSize() + 1) {
            menu.close();
        }
        log.info("You choose - " + menu.getCarName(carNumber) + ", good luck on the track.");
    }

    public int input() {
        int scanInt;
        while (true) {
            Scanner scan = new Scanner(System.in);
            scanInt = scan.nextInt();
            if (menu.getMap().get(scanInt) == null && (scanInt < 1 || scanInt > menu.getCarMapSize() + 1)) {
                log.info("Enter number 1 - " + (menu.getCarMapSize() + 1) + ";");
                continue;
            }
            return scanInt;
        }
    }
}
