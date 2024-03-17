package Start1;
import java.util.Scanner;
public class Rightarrowpattern {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the pattern: ");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
