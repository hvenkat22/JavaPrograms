package Start1;
interface Flyable{
	void fly_obj();
}
class SpaceCraft implements Flyable{
	public void fly_obj() {
		System.out.println("\nSpaceCraft is Flying!");
	}
}
class Airplane implements Flyable{
	public void fly_obj() {
		System.out.println("\nAirplane is Flying!");
	}
}
class Helicopter implements Flyable{
	public void fly_obj() {
		System.out.println("\nHelicopter is Flying!");
	}
}
public class FlyableProgram {
	public static void main(String[] args) {
		SpaceCraft scft = new SpaceCraft();
		Airplane air = new Airplane();
		Helicopter heli = new Helicopter();
		scft.fly_obj();
		air.fly_obj();
		heli.fly_obj();
	}
}
