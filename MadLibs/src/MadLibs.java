import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's play a game");
		System.out.println("Your task will be to provide: the color, the verb in the past tense, the adjective and the noun");
		System.out.println("Here we go");
		
		String color = "";
		String pastTenseVerb = "";
		String adjective = "";
		String noun = "";
		
		System.out.println("Enter the color:");
		color = scan.nextLine();
		System.out.println("Enter the verb in the past tense:");
		pastTenseVerb = scan.nextLine();
		System.out.println("Enter the adjective:");
		adjective = scan.nextLine();
		System.out.println("Enter the noun");
		noun = scan.nextLine();
		
		System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
		System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
		System.out.println(noun + " Karol ," + pastTenseVerb + "królowej Karolinie ,korale koloru " + color);
		
		scan.close();
	}
}
