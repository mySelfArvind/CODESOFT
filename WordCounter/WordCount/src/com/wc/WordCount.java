package com.wc;

import java.util.*;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string message: ");
        String message = scanner.nextLine();
        WordCount wc = new WordCount();
        int words = wc.totalWords(message);
        System.out.println("Total Words in given String is: " + words);
    }

    public int totalWords(String message) {
        int count = 0;

        String[] arrOfMessage = message.split("\\s+[<>,.]");
        
        for (String c : arrOfMessage) {
            count++;
        }

        return count;
    }

}
