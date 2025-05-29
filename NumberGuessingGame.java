package newproject;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int numberToGuess = random.nextInt(100) + 1; // Random number from 1 to 100
	        int guess;
	        int numberOfTries = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

	        while (true) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfTries++;

	            if (guess == numberToGuess) {
	                System.out.println("🎉 Congratulations! You guessed the number in " + numberOfTries + " tries.");
	                break;
	            } else if (guess < numberToGuess) {
	                System.out.println("Too low. Try again.");
	            } else {
	                System.out.println("Too high. Try again.");
	            }
	        }

	        scanner.close();
	    }

	

}
