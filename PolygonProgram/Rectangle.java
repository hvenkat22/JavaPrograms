//Hari Venkataraman
//Rectangles Class

public class Rectangle extends Polygons{
  private boolean isSquare = false;
  public boolean getisSquare(){
    return isSquare;
  }
  public Rectangle(double w, double h){
    super(w,h);
    if(getWidth() == getHeight()){
      isSquare = true;
    } else {
      isSquare = false;
    }
  }
  public double getArea(){
    return getWidth()*getHeight();
  }
  public void displayInfo(){
    System.out.println("\nSHAPE INFO:\n");
    if(isSquare == true){
      System.out.println("The figure is a Square.\n");
    } else if(isSquare == false) {
        System.out.println("This figure is a Rectangle.\n");
    }
    super.displayInfo();
    
  }
}