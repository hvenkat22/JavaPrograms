package Start1;
import java.util.Scanner;
public class Sum105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the first integer: ");
		n1=sc.nextInt();
		System.out.println("Enter the second integer: ");
		n2=sc.nextInt();
		System.out.println("Sum of the two numbers (Special) is: "+specialSum(n1,n2));
	}
	public static int specialSum(int a, int b) {
		int sum = a+b;
		if(sum>=105 && sum<=200) {
			return 200;
		}
		return sum;
	}
}
