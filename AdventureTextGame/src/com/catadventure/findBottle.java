package com.catadventure;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class findBottle {
    private static Scanner bottle = new Scanner(System.in);
    private static Scanner inspect = new Scanner(System.in);

    void searchBottle() {
        System.out.println("__________________________________________");
        System.out.println("\nA Umm...do you see a bottle somewhere?");
        System.out.println(("\nB Not sure...what's around you?"));
        System.out.println("__________________________________________");
        do {
        if (bottle.hasNextLine()) {
            String answer = bottle.nextLine();
                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("Let me look around...\n Yes!! I see a bottle floating!\n");
                    break;
                }
                if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("Erm, mud...lots of water...a floating bottle...\n");
                    break;
                } else {
                    System.out.println("Wass'that? (remember: A or B)");
                }

            }

        } while (true);

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________________");
        System.out.println("\nA Okay, I think you should check that bottle.");
        System.out.println("\nB On second thought...maybe try looking for a door");
        System.out.println("__________________________________________________");

        do {
            if (inspect.hasNextLine()) {
                String answer = inspect.nextLine();

                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("Good idea!...(checking)...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Okay, I found something");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("There is a message...it's...a bunch of numbers or somethin'...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("I'm sending it to you: \n");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    numberArray pinpad = new numberArray();
                    pinpad.codePad();
                    lockedIn puzzle = new lockedIn();
                    puzzle.crackCode();
                    break;

                }
                if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("Good idea! The Observatory has a door...");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Oh wait...it locked behind me when I came in...");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("..it asks for a code...5 digits...");
                    lockedIn puzzle = new lockedIn();
                    puzzle.crackCode();
                    break;

                }

            }
        } while(true);
    }
}
