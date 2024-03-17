package Start1;
import java.util.Scanner;
public class GuessingNumber1to9 {
	public static void main(String[] args) {
		int number = 1+(int)(9*Math.random()),guess;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\nEnter a number between 1 to 9 as a guess: ");
			guess=sc.nextInt();
			if(guess>9) {
				System.out.println("\nPlease enter a number 1 to 9...");
				continue;
			}
			else if(guess==number) {
				System.out.println("\nWell Guessed!");
				sc.close();
				break;
			}else {
				System.out.println("\nWrong Guess...");
				continue;
			}
		}
	}
}
