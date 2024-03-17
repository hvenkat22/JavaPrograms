package Start1;
import java.util.Scanner;
public class Revword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word="",rev="";
		System.out.println("Enter the word to reverse: ");
		word=sc.next();
		for(int i=word.length()-1; i>=0; i--) {
			rev+=word.charAt(i);
		}
		System.out.println("The reversed word is: "+rev);
	}
}
