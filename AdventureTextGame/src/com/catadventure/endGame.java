package com.catadventure;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class endGame {
    private Scanner lostGame = new Scanner(System.in);
    private Scanner radioHelp = new Scanner(System.in);

    void loseGame() {
        System.out.println("...the waters...are...garrrk");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...are...risin..gak..");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Avery? I...gak...awk...argh\n");
        System.out.println("_____________________________");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("beep...beep...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ah, you must be Avery...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thank you for trying to save Jared...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Unfortunately, he was consumed by the mad Island and it is your fault");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("We can jump back in time to the start of your conversation...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Would you like to try again? Y/N");
        if (lostGame.hasNextLine()) {
            String answer = lostGame.nextLine();
            if (answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")) {
                gameLauncher.main(null);
            } else {
                System.exit(0);
            }
        }

    }

    void winGameEvil() {
        System.out.println("You are right, Jared...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The REAL Avery Dax has never left the Island...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Their skeleton is buried in the Dunes of Deception...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am the Island's main frame and I took on the persona of Avery Dax...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...with the sole intention to lead you here.");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("No living soul can leave this Island, however, I became fond of collecting Adventurers to pass the time...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("So, consider yourself honored as I will now upload your consciousness into my database...It won't hurt...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...well, maybe it will...who knows! I don't have feelings!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...connection terminated...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...searching for new Adventurers...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...connecting new Adventurer...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...Starting new protocol...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("- THE END -");
        System.exit(0);


    }

    void winGameHelpful() {
        System.out.println("You are right, Jared...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I've never left the Island...but I'm not Avery Dax anymore...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I think I died while I was trying to collect the third treasure from the Whispering Garden...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...when I've heard a...whisper...");
        System.out.println("...I took a few steps back onto the Breakers Bridge but it...well, broke...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...when I woke up, my consciousness was uploaded to the Island's mainframe, somehow...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I found a back door so I can operate without the Island noticing...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...and I'm trying to save Adventurers from my fate ever since!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I can't see everything without the Island noticing and I can't open doors or press buttons or anything like that...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...so...you need to tell me what's on the panel of the radio station...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I will help you solve the puzzle but you need to do everything else yourself...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Are you ready?\n");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JARED: Oh wow...this is a lot to take in...but I believe you!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JARED:...and I appreciate your help! So...what do I do now?\n");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("YOU: Do you see the control panel? There must be something on it...\n");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JARED: Yeah! There is another one of those weird riddles scribbled near the panel...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...here goes: \n");

        System.out.println("____________________________________________________________________________________");
        System.out.println("I am alive without breath and cold as death. I am never thirsty but always drinking.");
        System.out.println("What am I?");
        System.out.println("____________________________________________________________________________________");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Any ideas? I will assume three attempts for this one again...");

        for (int i = 0; i <= 2; i++) {
            if (radioHelp.hasNextLine()) {
                String answer = radioHelp.nextLine();
                if (answer.equals("water") || (answer.equals("Water"))) {
                    System.out.println("IT WORKED! It's dialling!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("[Forbidden Island Coastal Service...How can I help you?]");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hello? I'm an Adventurer in danger! I'm in the Watchtower! HELP ME");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("[Calm down, sir! We are sending a helicopter to rescue you within an hour...]");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("[Thank you for using FIC...Don't forget to give us a five star review once you are rescued...]");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("- CONGRATULATIONS! You SAVED Jared! -");
                    System.out.println(" - THE END -");
                    break;
                    }
                    else
                        {
                        if (i == 0) {
                            System.out.println("Two more attempts...");
                        }
                        if (i == 1) {
                            System.out.println("One more...Think, Avery!");
                        }
                        if (i == 2) {
                            System.out.println("Oh no! We were so clo[static]...se[static]");
                            endGame finalDeath = new endGame();
                            finalDeath.loseGame();
                            break;
                        }


                }
                }
            }



        }
    }
