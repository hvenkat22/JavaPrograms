package Start1;
import java.util.Scanner;
public class PasswdValid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pwd;
		int lower=0,special=0,digit=0,upper=0;
		while(true) {
			System.out.println("\nEnter a possible password. A valid password contains at least one uppercase and one lowercase letter, a number from 0 to 9, and a special character ($,#,or @): ");
			pwd=sc.next();
			if(pwd.length()<6 || pwd.length()>16) {
				System.out.println("\nPassword should be of minimum length 6 characters and maximum 16.");
				continue;
			}else {
				for(int i=0; i<pwd.length(); i++) {
					char c = pwd.charAt(i);
					if(c>='a' && c<='z') {
						lower++;
					}else if(c>='A' && c<='Z') { 
						upper++;
					}else if(c=='$' || c=='#' || c=='@') {
						special++;
					}else if(c>='0' && c<='9') {
						digit++;
					}
				}
				if(lower>=1 && digit>=1 && special>=1 && upper>=1) {
					System.out.println("\nGreat! This is a Valid Password!");
					sc.close();
					break;
				}else {
					System.out.println("\nPassword is Invalid. Try Again...");
					continue;
				}
			}
		}
		
		
		
	}
}
