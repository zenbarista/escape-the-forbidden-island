package com.catadventure;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class gameRiddle {
    private static Scanner askRiddle = new Scanner(System.in);

    void solveRiddle() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("It says 'if you fail in 3 attempts you are dead'...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Can you solve the riddle for me? I'm pretty useless from all the stress...\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("___________________________________________________________________________________");
        System.out.println("\nRiddle: When I'm made I am full up, and when I'm gone I'm empty inside. What am I? ");
        System.out.println("(Type in your answer...it has to be one word)");
        System.out.println("___________________________________________________________________________________");
        int x = 0;
        int y = 3;
        while (x < 3) {
            if (askRiddle.hasNextLine()) {
                String answer = askRiddle.nextLine();
                if (answer.equals("bottle") || answer.equals("Bottle")) {
                    System.out.println("Phew!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("That worked!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("What now?");
                    break;
                }
                else {
                    x = x + 1;
                    y = y - 1;
                }
                if (y == 2) {
                    System.out.println("Umm, I don't think that's right..but you still have 2 guesses");
                }

                if (y == 1) {
                    System.out.println("You only have one guess now...hurry!!!");
                }
                if (y == 0) {
                    System.out.println("No, no nooo!!! You ran out...");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    endGame lost = new endGame();
                    lost.loseGame();

                }
            }
        }
    }
}
