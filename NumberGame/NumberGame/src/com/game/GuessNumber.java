package com.game;

import java.util.*;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int min = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int max = scanner.nextInt();
        GuessNumber gn = new GuessNumber();
        int generatedNumber = gn.getRandomNumberInRange(min, max);

        while (true) {
            System.out.print("Guess the number between given range: ");
            int guessNumber = scanner.nextInt();
            if (guessNumber == generatedNumber) {
                System.out.println("Woo!, You Guessed the number & it is: " + generatedNumber);
                break;
            } else {
                if (guessNumber > generatedNumber) {
//                    too big
                    System.out.println("Number is too big, try again");
                } else {
//                    too small
                    System.out.println("Number is too small, try again");
                }
            }
        }
    }

    public int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1);
        return randomNumber + min;
    }
}
