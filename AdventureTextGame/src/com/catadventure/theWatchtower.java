package com.catadventure;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//This class needs pauses in text!

class theWatchtower {
    private Scanner wTower = new Scanner(System.in);
    private Scanner whereTo = new Scanner(System.in);
    private Scanner unsure = new Scanner(System.in);
    private Scanner goingIn = new Scanner(System.in);
    private Scanner pressStone = new Scanner(System.in);
    private Scanner deadlyFog = new Scanner(System.in);
    private Scanner intentions = new Scanner(System.in);

    void lastChapter() {
        System.out.println("__________________________________________");
        System.out.println("A What do you see around you?");
        System.out.println("B Not sure. Do you have all the treasures?");
        System.out.println("__________________________________________");
        do {
            if (wTower.hasNextLine()) {
                String answer = wTower.nextLine();
                if (answer.equals("A") || (answer.equals("a"))) {
                    System.out.println("Umm...I can make out the Watchtower and I'm pretty sure that's the Misty Marsh on my left");
                    break;
                }
                if (answer.equals("B") || answer.equals("b")) {
                    System.out.println("Nah...our stupid Pilot had them and he was lost in...well, the Lost Lagoon...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("No sign of the helicopter either...it's probably underwater by now...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Last time I saw it...it was sinking in the Misty Marsh...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("...which is to my left, btw! I can also totally see the Watchtower!!! ");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                } else {
                    System.out.println("You really should know by now....A or B only, please!!!");
                }
            }
        } while(true);
        System.out.println("_______________________________________________________________________________");
        System.out.println("A You should head through the Misty Marsh! Look for the helicopter...");
        System.out.println("B Go to the Watchtower! There is a radio station there. You can try to call help!");
        System.out.println("_______________________________________________________________________________");

        do {
            if (whereTo.hasNextLine()){
                String answer = whereTo.nextLine();
                if (answer.equals("A") || (answer.equals("a"))){
                    System.out.println("Are you sure? That Marsh is very...misty...");
                    theWatchtower unsure = new theWatchtower();
                    unsure.notSure();
                    break;

                }
                if (answer.equals("B") || (answer.equals("b"))){
                    System.out.println("Good idea! Watchtower it is!");
                    theWatchtower toTower = new theWatchtower();
                    toTower.goTower();
                    break;
                } else {
                    System.out.println("Still A or B only...should I even say this?");
                }
            }
        } while(true);

    }
    private void notSure(){
        System.out.println("________________________________________________________________");
        System.out.println("A That copter is your only option...go to the Marsh!");
        System.out.println("B You are right...it's less safe. Go to the Watchtower instead!");
        System.out.println("_______________________________________________________________");

        do {
            if (unsure.hasNextLine()){
                String answer = unsure.nextLine();
                if (answer.equals("A") || (answer.equals("a"))){
                    System.out.println("Okay...you were so helpful 'till now so it's probably worth a try!");
                    theWatchtower toMisty = new theWatchtower();
                    toMisty.goMisty();
                    break;

                }
                if (answer.equals("B") || (answer.equals("b"))){
                    System.out.println("To be honest, I'm relieved! Watchtower it is!");
                    theWatchtower toTheTower = new theWatchtower();
                    toTheTower.goTower();
                    break;
                } else {
                    System.out.println("Still A or B only...should I even say this?");
                }
            }
        } while (true);


    }

    private void goTower() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...signal lost...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...reconnection attempted...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...reconnection failed...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...reconnection attempted...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...connection established...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hey...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm back! I turned off the com so I don't lose battery...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I've reached the Watchtower without dying so...YAY");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I had to swim through the Bronze Gate but otherwise uneventful...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("So...I'm at the door...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...should I just go in?");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("__________________________________________");
        System.out.println("A Duh!");
        System.out.println("B Maybe you should inspect the door first...");
        System.out.println("__________________________________________");

        do {
            if (goingIn.hasNextLine()) {
                String answer = goingIn.nextLine();
                if (answer.equals("A") || (answer.equals("a"))) {
                    System.out.println("Right! I'm going in...uh oh...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("This doesn't look right...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Avery?...");
                    endGame choke = new endGame();
                    choke.loseGame();
                    break;
                }
                if (answer.equals("B") || (answer.equals("b"))) {
                    System.out.println("You are probably right...");
                    break;
                } else {
                    System.out.println("How hard it really is to remember two letters?");
                }
            }
        } while (true);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I found some weird letters near the door on the stone wall...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I think you can press them in or something...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm sending you the layout...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("________________________________________________________________\n\n");
        System.out.println("   A   B   C   D   E   F  \n");
        System.out.println("1     RES KEN SUN RES    ");
        System.out.println("2 SUN SUN TRE RES ASU KEN");
        System.out.println("3 TRE RES KEN SUN RES ASU");
        System.out.println("4 SUN     ASU KEN     TRE");
        System.out.println("5 ASU SUN RES TRE KEN RES");
        System.out.println("6     TRE KEN ASU RES    ");
        System.out.println("7     KEN ASU RES SUN    ");
        System.out.println("8     RES KEN SUN RES   ");
        System.out.println("\n\n________________________________________________________________");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Which ones should I press?");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("(Each tile is formed of three-letter groups...");
        System.out.println("...to help Jared, send him tile-locations, such as A2, B4, etc...The results should form one word...");
        System.out.println("...he needs to press five tiles (locations) to find the right word and open the door...");

        if (pressStone.hasNextLine()) {
            String answer = pressStone.nextLine();
            if (answer.equals("D3, D4, D5, D6, D7") || (answer.equals("D3 D4 D5 D6 D7") || (answer.equals("d3, d4, d5, d6, d7") || (answer.equals("d3 d4 d5 d6 d7"))))) {
                System.out.println("I'm IN!");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I can see the radio station!");
                theWatchtower radio = new theWatchtower();
                radio.thisIsTheEnd();
            } else {
                endGame dieAgain = new endGame();
                dieAgain.loseGame();
            }
        }



    }

    private void goMisty() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...signal lost...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...reconnecting...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[...connection established...]");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hey Avery? I think I'm in trouble...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I can't see shit in this fog and I'm pretty sure I'm going in circles...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Should I go back?");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("__________________________________________");
        System.out.println("A Yeah...it's probably wise to head for the Watchtower instead!");
        System.out.println("B Keep going! It's just a little fog, that's all");
        System.out.println("__________________________________________");

        do{
            if (deadlyFog.hasNextLine()) {
                String answer = deadlyFog.nextLine();
                if (answer.equals("A") || (answer.equals("a"))) {
                    System.out.println("Hahh, okay! I'm heading back...it sure was getting creepy here...");
                    theWatchtower goBack = new theWatchtower();
                    goBack.goTower();
                    break;
                }
                if (answer.equals("B") || (answer.equals("b"))) {
                    System.out.println("I'm not sure that was a good idea...but I trust you...");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hey look! I think I can see the helicop...[static]");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("...ter...[static]...Aver..[static]...y?");
                    endGame justDieAlready = new endGame();
                    justDieAlready.loseGame();
                    break;
                } else {
                    System.out.println("(For ffs press A or B)");
                }
            }

        } while(true);

    }

    private void thisIsTheEnd() {
        System.out.println("This place is so weird...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Oh hey! There is a picture of you on the wall!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hang on...I never asked how you've left the Island...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...unless...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...I mean it's pretty weird that this com has only YOUR number in it...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...unless...what if YOU'VE NEVER LEFT THE ISLAND???");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm probably going crazy....I'm sorry, Avery...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Still...tell me the truth!");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("___________________________________________________");
        System.out.println("<Type A to reveal your EVIL intentions to Jared>");
        System.out.println("<Type B to reveal your HELPFUL intentions to Jared>");
        System.out.println("___________________________________________________");

        do{
            if (intentions.hasNextLine()) {
                String answer = intentions.nextLine();
                if (answer.equals("A") || (answer.equals("a"))) {
                    endGame winGame = new endGame();
                    winGame.winGameEvil();
                    break;
                }
                if (answer.equals("B") || (answer.equals("b"))) {
                    endGame winGame = new endGame();
                    winGame.winGameHelpful();
                    break;
                }
            } else {
                System.out.println("Until you can remember something so simple as A OR B you should refrain from playing games like this...");
            }


        } while(true);




    }
}
