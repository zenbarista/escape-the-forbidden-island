package com.catadventure;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class lockedIn {
    private static Scanner padlock = new Scanner(System.in);

    void crackCode() {
        System.out.println("Type in the 5 digit code. You have 2 attempts");
        System.out.println("___________________________");
        System.out.println("CODE:");


        int x = 2;
        int y = 0;

        while (x > 0) {
            if (padlock.hasNextLine()) {
                String answer = padlock.nextLine();

                if (answer.equals("62318")) {
                    System.out.println("I think that worked");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("The door is open...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I'm out of the Observatory! But...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("...where should I go now?");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("...everything is pretty flooded...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    theWatchtower tower = new theWatchtower();
                    tower.lastChapter();

                    break;
                } else {
                    x = x - 1;
                    y = y + 1;
                }
                if (y == 1 && !answer.equals("62318")) {
                    System.out.println("It's wrong! Try again!");

                }
                if (y == 2 && !answer.equals("12345")) {
                    endGame dead = new endGame();
                    dead.loseGame();
                    break;
                }


            }
        }
    }
}
