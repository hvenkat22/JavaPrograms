package Start1;
import java.util.Scanner;
public class Numberpattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter the size of the pattern: ");
		n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
