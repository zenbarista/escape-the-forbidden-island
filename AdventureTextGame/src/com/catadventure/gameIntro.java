package com.catadventure;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class gameIntro {
    private static Scanner newHero = new Scanner(System.in);
    private static Scanner occupation = new Scanner(System.in);
    private static Scanner yourStory = new Scanner(System.in);
    private static Scanner help = new Scanner(System.in);
    private static Scanner okay = new Scanner(System.in);

    void askHero() {
        System.out.println("[...incoming communication requested...]");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...establishing speech to text protocol...]");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...encryption protocol ready...]");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is anyone there? \nCan you read me?\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________");
        System.out.println("(Type A or B to continue)");
        System.out.println("\nA Yes, I can read you. ");
        System.out.println("\nB Who the hell are you?");
        System.out.println("__________________________________________");


        do {
            if (newHero.hasNextLine()) {
                String answer = newHero.nextLine();
                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("Great!");
                    break;
                }
                if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("\nI'm Jared...But can you read me?");
                } else {
                    System.out.println("What's that? Can you read me? (Answer with A or B\n)");
                }
            }

        } while (true);
    }
    void whoAreYou() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You are Avery Dax, right? The famous...\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________");
        System.out.println("(Choose one and type in to continue)");
        System.out.println("\nPilot ");
        System.out.println("Explorer");
        System.out.println("Engineer");
        System.out.println("Navigator");
        System.out.println("__________________________________________");
        if (occupation.hasNextLine()) {
            String answer = occupation.nextLine();
            System.out.println("\n..." + answer + "? " + "I need your help!");

        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________");
        System.out.println("\nA Who are you again?");
        System.out.println("\nB That's me...what's your story?");
        System.out.println("__________________________________________");

        do {
            if (yourStory.hasNextLine()) {
                String answer = yourStory.nextLine();

                if (answer.equals("A") || answer.equals("a") || answer.equals("B") || answer.equals("b")) {
                    System.out.println("Hahh...I'm Jared and I'm one of a new team of explorers...");
                    break;
                } else {
                    System.out.println("Huh? (Remember! A or B)");
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        } while (true);

    }

    void helpMe() {
        System.out.println("we don't have time for this!!! Everyone else is dead...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("and I'm trapped on the frickin' FORBIDDEN ISLAND!!!");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You escaped it once...you are my only hope!\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________");
        System.out.println("\nA I don't know what you are talking about");
        System.out.println("\nB Is this a joke?");
        System.out.println("\nC That can't be true!");
        System.out.println("__________________________________________");

        do {
            if (help.hasNextLine()) {
                String answer = help.nextLine();
                if (answer.equals("A") || answer.equals("a")) {
                    System.out.println("\nWe don't have time to pretend! I am knee deep in water");
                    break;
                }
                if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("\nNo, I'm serious! The water is rising and it's pretty cold...");
                    break;
                }
                if (answer.equals("C") || answer.equals("c")) {
                    System.out.println("\nAll this water...It's pretty real to me!");
                    break;
                } else {
                    System.out.println("\nSay what now? (Enter either A, B or C)");
                }
            }

        } while (true);

    }

    void allRight() {
        System.out.println("__________________________________________");
        System.out.println("\nA Okay, where are you exactly?");
        System.out.println("\nB I'm considering this...");
        System.out.println("__________________________________________");

        do {
        if (okay.hasNextLine()) {
            String answer = okay.nextLine();
            if (answer.equals("A") || answer.equals("a")) {
                System.out.println("I'm in the Observatory...all I can see is a riddle on the wall ");
                break;
            }
            if (answer.equals("B") || answer.equals("b")) {
                System.out.println("Hahh, that's a relief! What do I do? There is this weird riddle on the wall...");
                break;
            } else {
                System.out.println("Couldn't quite catch that..can you repeat? (Enter either A or B)");
            }

        }
    } while (true);


    }

}



