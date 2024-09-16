import java.util.Random;
import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		Scanner g = new Scanner (System.in);
		// Generates random number [1 - 100]
		//User enters their guess
		//Tell user if the guess is higher or low than the generated number (If statement)
		//User only 3 tries(while loop & count how many times they tried)
		
		System.out.println("The computer has generated a number between 1 and 100. \nTry and guess the generated number but you only have 3 attempts");
		
		Random randNumber = new Random();
		int answer = randNumber.nextInt(100);
		answer += 1; // [1 - 100]
	
		System.out.println(answer);
		
		/*
		 * System.out.println("Enter your guessed number: "); int guess = g.nextInt();
		 */
		
		// while (guess != answer)
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println("Attempt "+ i +": Enter your guessed number: ");
			int guess = g.nextInt();
			
			if  (guess == answer) 
			{
				System.out.print("Well done! "+ guess +" is the correct answer");
				break;
			}
			else if (guess > answer) 
			{
				System.out.println("Sorry your guess is higher than the generated number ");
			}
			else if (guess < answer) 
			{
				System.out.println("Sorry your guess is lower than the generated number ");
			}
		}
		
		/*
		 * if (guess == answer) { System.out.print("Well done! "+ guess
		 * +" is the correct answer"); } else if (guess > answer) {
		 * System.out.print("Sorry your guess is higher than the generated number "); }
		 * else if (guess < answer) {
		 * System.out.print("Sorry your guess is lower than the generated number "); }
		 */
		
		// TODO Auto-generated method stub

	}

}
