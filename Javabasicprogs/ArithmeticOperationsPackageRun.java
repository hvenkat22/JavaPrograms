package Start1;
import arithmeticPackage.Ops;
import java.util.Scanner;

public class ArithmeticOperationsPackageRun {
	public static void main(String[] args) {
		int a,b;
		Ops op = new Ops();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		a=sc.nextInt();
		System.out.println("Enter number 2: ");
		b=sc.nextInt();
		System.out.println("\n"+a+" + "+b+" = "+op.addtwo(a, b));
		System.out.println("\n"+a+" - "+b+" = "+op.subtwo(a, b));
		System.out.println("\n"+a+" * "+b+" = "+op.multwo(a, b));
		System.out.println("\n"+a+" / "+b+" = "+op.divtwo(a, b));
		sc.close();
	}
}
