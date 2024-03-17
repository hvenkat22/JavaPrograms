package Start1;
import java.util.Random;
import java.util.Scanner;

class Square extends Thread{
	int num;
	Square(int n){
		num=n;
	}
	public void run() {
		int res=num*num;
		System.out.println("Square of "+num+" is: "+res);
	}
}
class Cube extends Thread{
	int num;
	Cube(int n){
		num=n;
	}
	public void run() {
		int res=num*num*num;
		System.out.println("Cube of "+num+" is: "+res);
	}
}
class Rand extends Thread{
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number of times to generate number: ");
		int n = sc.nextInt();
		Random ra = new Random();
		for(int i=0;i<n;i++) {
			int randint = ra.nextInt(1000);
			if(randint%2==0) {
				Square s = new Square(randint);
				s.start();
			}else {
				Cube c = new Cube(randint);
				c.start();
			}
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
		
	}
}
public class SquareCubeMultithread {
	public static void main(String[] args) {
		Rand r = new Rand();
		r.start();
	}
}
