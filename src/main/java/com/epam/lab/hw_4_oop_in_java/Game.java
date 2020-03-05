package com.epam.lab.hw_4_oop_in_java;

import com.epam.lab.hw_4_oop_in_java.tank.Tank;
import com.epam.lab.hw_4_oop_in_java.tank.type.anti_tank.Grille15;
import com.epam.lab.hw_4_oop_in_java.tank.type.anti_tank.Jg_Pz_E100;
import com.epam.lab.hw_4_oop_in_java.tank.type.artillery.Object261;
import com.epam.lab.hw_4_oop_in_java.tank.type.artillery.T92;
import com.epam.lab.hw_4_oop_in_java.tank.type.heavy.AMX50B;
import com.epam.lab.hw_4_oop_in_java.tank.type.heavy.T110E5;
import com.epam.lab.hw_4_oop_in_java.tank.type.light.AMX13_105;
import com.epam.lab.hw_4_oop_in_java.tank.type.light.T100LT;
import com.epam.lab.hw_4_oop_in_java.tank.type.medium.B_C25t;
import com.epam.lab.hw_4_oop_in_java.tank.type.medium.M48Patton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Scanner scan = new Scanner(System.in);
    private String firstPlayersName;
    private String secondPlayersName;
    private Tank firstPlayersTank;
    private Tank secondPlayersTank;
    private List<Tank> allTanks = new ArrayList<Tank>();

    private List<Tank> getAllTanks() {
        return allTanks;
    }

    void start() {
        System.out.println("Game started!");
        initListWithAllTanks();
        setPlayersName();
        printAllTanks();
        chooseTanks();
        startBattle();
    }

    private void startBattle() {
        while (getFirstPlayersTank().getHealth() > 0 && getSecondPlayersTank().getHealth() > 0) {
            System.out.println("\nShot " + getFirstPlayersName() + "(" + getFirstPlayersTank().getName() + "):");
            getFirstPlayersTank().fire(getSecondPlayersTank());
            if (getSecondPlayersTank().getHealth() > 0) {
                System.out.println("\nShot " + getSecondPlayersName() + "(" + getSecondPlayersTank().getName() + "):");
                getSecondPlayersTank().fire(getFirstPlayersTank());
            }
        }
    }

    private void setPlayersName() {
        System.out.println("Player 1, enter you name:");
        setFirstPlayersName(scan.nextLine());
        System.out.println("Player 2, enter you name:");
        setSecondPlayersName(scan.nextLine());
    }

    private void printAllTanks() {
        int count = 1;
        for (Tank tank : getAllTanks()) {
            System.out.println(count + ". " + tank.getName());
            count++;
        }
    }

    private void chooseTanks() {
        int numberOfFirstTank;
        int numberOfSecondTank;
        System.out.println("Player 1, choose tank!");
        numberOfFirstTank = scan.nextInt();
        if (numberOfFirstTank < 1 || numberOfFirstTank > getAllTanks().size()) {
            System.out.println("Please enter valid number, from 1 to " + getAllTanks().size() + " !");
            chooseTanks();
            return;
        } else {
            setFirstPlayersTank(getAllTanks().get(numberOfFirstTank - 1));
            System.out.println("Good choice, " + getAllTanks().get(numberOfFirstTank - 1).getName() + " !");
        }
        System.out.println("Player 2, choose tank!");
        numberOfSecondTank = scan.nextInt();
        if (numberOfSecondTank < 1 || numberOfSecondTank > getAllTanks().size()) {
            System.out.println("Please enter valid number, from 1 to " + getAllTanks().size() + " !");
            chooseTanks();
        } else {
            setSecondPlayersTank(getAllTanks().get(numberOfSecondTank - 1));
            System.out.println("Good choice, " + getAllTanks().get(numberOfSecondTank - 1).getName() + " !");
        }
    }

    private void initListWithAllTanks() {
        getAllTanks().add(new M48Patton());
        getAllTanks().add(new T110E5());
        getAllTanks().add(new Object261());
        getAllTanks().add(new AMX13_105());
        getAllTanks().add(new Grille15());
        getAllTanks().add(new AMX50B());
        getAllTanks().add(new B_C25t());
        getAllTanks().add(new T100LT());
        getAllTanks().add(new T92());
        getAllTanks().add(new Jg_Pz_E100());
    }

    private String getFirstPlayersName() {
        return firstPlayersName;
    }

    private void setFirstPlayersName(String firstPlayersName) {
        this.firstPlayersName = firstPlayersName;
    }

    private String getSecondPlayersName() {
        return secondPlayersName;
    }

    private void setSecondPlayersName(String secondPlayersName) {
        this.secondPlayersName = secondPlayersName;
    }

    private Tank getFirstPlayersTank() {
        return firstPlayersTank;
    }

    private void setFirstPlayersTank(Tank firstPlayersTank) {
        this.firstPlayersTank = firstPlayersTank;
    }

    private Tank getSecondPlayersTank() {
        return secondPlayersTank;
    }

    private void setSecondPlayersTank(Tank secondPlayersTank) {
        this.secondPlayersTank = secondPlayersTank;
    }
}
