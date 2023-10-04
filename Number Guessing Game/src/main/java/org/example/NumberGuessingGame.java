package org.example;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange-minRange+1)+ minRange;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("* Welcome to the Number Guessing Game *");
        System.out.println("*---------------------------*-----------------------*---------------------*");
        System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ". Try to guess it.");

        while (!hasGuessedCorrectly){
            System.out.println("Enter your Guess : ");
            int guess = sc.nextInt();
            attempts++;

            if (guess < minRange || guess > maxRange){
                System.out.println("Please guess a number within the specified range.");
            } else if (guess < numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("The number is lower. Try again.");
            }else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        sc.close();
    }
}
