package Start1;
class TrafficLight{
	private String color;
	private int duration;
	public TrafficLight(String clr,int dur) {
		color=clr;
		duration=dur;
	}
	public void change(String newclr) {
		color=newclr;
	}
	public boolean isRed() {
		return color.equals("red");
	}
	public boolean isGreen() {
		return color.equals("green");
	}
	public void setDur(int dura) {
		duration=dura;
	}
	public int getDur() {
		return duration;
	}
}
public class TrafficLightProgram {
	public static void main(String[] args) {
		TrafficLight light = new TrafficLight("red", 30);
		System.out.println("The light is red: " + light.isRed());
	    System.out.println("The light is green: " + light.isGreen());
	    light.change("green");
	    System.out.println("The light is now green: " + light.isGreen());
	    System.out.println("The light duration is: " + light.getDur());
	    light.setDur(20);
	    System.out.println("The light duration is now: " + light.getDur());
	}
}
