package com.taskfirst.codsoft;

import java.util.Random;
import java.util.Scanner;   

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("**Welcome to the Number Guessing Game!**");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempt = 0;
            int maxAttempts = 5;

            System.out.println("I have selected a number between 1 and 100. Can you guess it?");

            while (attempt < maxAttempts) {
                System.out.print("Enter your guess Number: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempt++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempt + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("low Number! Try again.");
                } else {
                    System.out.println("high Number! Try again.");
                }
            }

            if (attempt >= maxAttempts) {
                System.out.println("Sorry, The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score : " + score);

        scanner.close();
    }

	
}
