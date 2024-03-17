package Start1;
import java.util.Scanner;
class Person {
	private String name;
	private int age;
	public Person(String na, int years){
		name=na;
		age=years;
	}
	public void display() {
		System.out.println("\nName: "+name+" Age: "+age);
	}
}
public class PersonProg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1,name2;
		int age1,age2;
		System.out.println("Enter Name of Person 1: ");
		name1=sc.next();
		System.out.println("Enter Age of Person 1: ");
		age1=sc.nextInt();
		System.out.println("\nEnter Name of Person 2: ");
		name2=sc.next();
		System.out.println("Enter Age of Person 2: ");
		age2=sc.nextInt();
		Person p1 = new Person(name1,age1);
		Person p2 = new Person(name2,age2);
		p1.display();
		p2.display();
	}
}
