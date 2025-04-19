package onSiteTask;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberToGuess = (int)(Math.random() * 20) + 1;
		Scanner scanner = new Scanner(System.in);
		int guess = Integer.parseInt(scanner.nextLine());
		int tries = 0;
		
		while (tries < 5) {
			if (guess > numberToGuess) {
				System.out.println("Zu groß!");
				tries++;
			} else if(guess < numberToGuess) {
				System.out.println("Zu klein!");
				tries++;
			} else {
				System.out.println("Richtig!");
				break;
			}
		 guess = Integer.parseInt(scanner.nextLine());	
		}
		if(tries == 5) {
			System.out.println("u lose !");
		}
	}

}
