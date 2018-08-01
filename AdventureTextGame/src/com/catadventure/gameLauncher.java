package com.catadventure;

import java.util.concurrent.TimeUnit;

public class gameLauncher {
    public static void main(String[] args) {
        gameIntro intro = new gameIntro();
        intro.askHero();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        intro.whoAreYou();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        intro.helpMe();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        intro.allRight();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gameRiddle riddle = new gameRiddle();
        riddle.solveRiddle();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        findBottle search = new findBottle();
        search.searchBottle();

    }
}
