package com.catadventure;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

//make this more interesting with a puzzle that generates random numbers...and locations
//another time...maybe
//this is probably overkill though - could have just get numbers into the String...

class numberArray {
   private int[] firstRow = {2, 8, 5, 4, 1};
   private int[] secondRow = {8, 6, 3, 1, 5};
   private int[] thirdRow = {6, 2, 5, 4, 8};

    void codePad() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("________________________________________________________________________________");
        System.out.println("First row: " + Arrays.toString(firstRow) + "\n");
        System.out.println("In the first row, one number is correct but is in the wrong place.\n ");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("_________________________________________________________________________________");
        System.out.println("Second row " + Arrays.toString(secondRow) + "\n");
        System.out.println("In the second row, two numbers are correct but only one is in the right place.\n ");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("__________________________________________________________________________________");
        System.out.println("Third row " + Arrays.toString(thirdRow) + "\n");
        System.out.println("In the third row, two numbers are correct and are in the right place.\n ");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("_________________________________________________________________________________");
        System.out.println("\nThe last two digits are the sum of two of the three first digits");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Uhh, I think this is the code for the door...Let me check...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I saw a pin pad on the door that locked behind me when I came in to the Observatory");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Here it is! It says...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

