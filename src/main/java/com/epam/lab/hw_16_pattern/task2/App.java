package com.epam.lab.hw_16_pattern.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyMenu;
        Order order = new Order();
        do {
            System.out.println(Color.BLUE);
            System.out.println("   1 - Add Task" + "   2 - Progress   ");
            System.out.println("   3 - Review      " + "   4 - Test    ");
            System.out.println("   5 - Done       " + "   6 - Blocked     ");
            System.out.println("   L - Get Task List" + "   Q - exit");
            System.out.println("   Please, select menu point.");
            System.out.println(Color.RESET);
            keyMenu = input.nextLine().toUpperCase();
            try {
                switch (keyMenu) {
                    case "1":
                        order.addTask();
                        break;
                    case "2":
                        order.inProgress();
                        break;
                    case "3":
                        order.peerReview();
                        break;
                    case "4":
                        order.inTest();
                        break;
                    case "5":
                        order.done();
                        break;
                    case "6":
                        order.blocked();
                        break;
                    case "L":
                        order.printTaskList();
                        break;
                }
            } catch (Exception e) {
            }
        } while (!keyMenu.equals("Q"));
    }
}
