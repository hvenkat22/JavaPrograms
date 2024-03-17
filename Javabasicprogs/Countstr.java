package Start1;
import java.util.Scanner;
public class Countstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="";
		int digits=0,letters=0;
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if((ch>='a' && ch <='z') || (ch>='A' && ch<='Z')) {
				letters++;
			}else if(ch>='0' && ch<='9') {
				digits++;
			}
		}
		System.out.println("\nNumber of Letters in the Given String: "+letters);
		System.out.println("Number of Digits in the Given String: "+digits);
	}
}
