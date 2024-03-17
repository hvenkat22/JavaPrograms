package Start1;
import java.util.Scanner;
class Count extends Thread{
	private String str;
	private int count;
	public Count(String k) {
		str=k;
		count=0;
	}
	public void run() {
		if(Thread.currentThread().equals("ThreadA")) {
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				if(ch>='0'&&ch<='9') {
					count++;
				}
			}
			System.out.println("Digit count: "+count);
		}else if(Thread.currentThread().equals("ThreadB")) {
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {
					count++;
				}
			}
			System.out.println("Letter count: "+count);
		}
	}
}
public class CharCountThreads {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k;
		System.out.println("Enter a String: ");
		k=sc.next();
		Count tA = new Count(k);
		Count tB = new Count(k);
		tA.setName("ThreadA");
		tB.setName("TheadB");
		tA.start();
		tB.start();
	}
}
