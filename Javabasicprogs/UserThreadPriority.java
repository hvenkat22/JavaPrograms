package Start1;
import java.util.Scanner;
class ThreadPrior extends Thread{
	private String k;
	private char c;
	public ThreadPrior(String name) {
		super(name);
	}
	public void setK(String str) {
		k=str;
	}
	public void setC(char ch) {
		c=ch;
	}
	public void run(){
		System.out.println("Thread "+getName()+" is running with k: "+k+" and c: "+c);
	}
}
public class UserThreadPriority {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String k = sc.nextLine();
		System.out.println("Enter a Character: ");
		char c = sc.next().charAt(0);
		ThreadPrior threadobj1 = new ThreadPrior("ThreadA");
		ThreadPrior threadobj2 = new ThreadPrior("ThreadB");
		threadobj1.setK(k);
		threadobj1.setC(c);
		threadobj2.setK(k);
		threadobj2.setC(c);
		threadobj1.start();
		threadobj2.start();
	}
}
