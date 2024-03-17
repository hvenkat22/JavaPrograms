//Made by: Hari Venkataraman
//PolygonRunner.java 

public class Main
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();

// Let's add a polygon here
    Polygons[] poly = new Polygons[4];
    poly[0] = new Triangle(3,4,"right");//1st Triangle.
    poly[1] = new Rectangle(6,7);//1st Rectangle.
    poly[2] = new Triangle(4,5,"obtuse");//1st Triangle.
    poly[3] = new Rectangle(12,12);//2nd Rectangle (Square).
    for(int i=0; i<poly.length; i++){
      poly[i].displayInfo();//Displays information correspondingly.
      poly[i].getArea();//Displays the according areas of the polygons.
    }

	}	
}