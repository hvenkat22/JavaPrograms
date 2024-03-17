package Start1;
import java.util.Scanner;
public class ArithmeticOpsUsingOverloading {
	static int add(int a,int b) {
		return(a+b);
	}
	static int add(int a,int b, int c) {
		return(a+b+c);
	}
	static int sub(int a,int b) {
		return(a-b);
	}
	static int sub(int a,int b,int c) {
		return(a-b-c);
	}
	static int mul(int a,int b) {
		return(a*b);
	}
	static int mul(int a,int b,int c) {
		return(a*b*c);
	}
	static float div(int a,int b) {
		return((float)a/b);
	}
	static float div(int a,int b,int c) {
		return((float)a/b/c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,choice,nums;
		System.out.println("Enter the number of entries: ");
		nums=sc.nextInt();
		System.out.println("\nEnter 1 to Add, 2 to Subtract, 3 to Multiply, or 4 to Divide: ");
		choice=sc.nextInt();
		if(nums==2) {
			System.out.println("Enter the two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			if(choice==1) {
				System.out.println("Sum is: "+add(a,b));
			}else if(choice==2) {
				System.out.println("Difference is: "+sub(a,b));
			}else if(choice==3) {
				System.out.println("Product is: "+mul(a,b));
			}else if(choice==4) {
				System.out.println("Quotient is: "+div(a,b));
			}
		}else if(nums==3) {
			System.out.println("Enter the three numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if(choice==1) {
				System.out.println("Sum is: "+add(a,b,c));
			}else if(choice==2) {
				System.out.println("Difference is: "+sub(a,b,c));
			}else if(choice==3) {
				System.out.println("Product is: "+mul(a,b,c));
			}else if(choice==4) {
				System.out.println("Quotient is: "+div(a,b,c));
			}
		}else {
			System.out.println("Please enter 2 or 3.");
		}
		
		
	}
}
