package Start1;
interface Resizeable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangle implements Resizeable{
	private int width;
	private int height;
	public Rectangle(int w, int h) {
		width=w;
		height=h;
	}
	public void resizeWidth(int wi) {
		width=wi;
	}
	public void resizeHeight(int hi) {
		height=hi;
	}
	public void print() {
		System.out.println("\nWidth: "+width+" Height: "+height);
	}
}
public class Resizeableprogram {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100,500);
		r1.print();
		r1.resizeHeight(200);
		r1.resizeWidth(400);
		r1.print();
	}
}
