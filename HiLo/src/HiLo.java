import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		
		do {
			
			System.out.println("Let's play a game.");
			System.out.println("You task will be to guess a number between 1 and 10.");
			System.out.println("You only have four attempts to guess the number");
			System.out.println("Good luck!");
			System.out.println("Give me a number:");
			
			int theNumber = (int)(Math.random()*10+1);
			// System.out.println(theNumber);
			int guess = 0;
			int numberOfAttempts = 4;
			int attempt = 1;
			while(guess != theNumber) {
				
				
				guess = scan.nextInt();
				
				
				if(guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber) 
					System.out.println(guess + " is too heig. Try again.");
				else
					System.out.println(guess + " is correct. You win!");
				
				System.out.println("It was your " + attempt + " attempt");
				
				if(attempt >= numberOfAttempts) {
					System.out.println("You lost!");
					break;
				}
				attempt++;
			}
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();

	}

}
