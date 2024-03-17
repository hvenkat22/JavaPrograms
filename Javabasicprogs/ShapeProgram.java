package Start1;
import java.util.Scanner;
class Shape{
	public double getPerimeter() {
		return 0;
	}
	public double getArea() {
		return 0;
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double rad) {
		radius=rad;
	}
	public double getPerimeter() {
		return(2*Math.PI*radius);
	}
	public double getArea() {
		return(Math.PI*radius*radius);
	}
}
public class ShapeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter radius of Circle: ");
		radius=sc.nextDouble();
		Circle c1 = new Circle(radius);
		System.out.println("\nCircumference of Circle: "+c1.getPerimeter());
		System.out.println("Area of Circle: "+c1.getArea());
	}
}
