//Hari Venkataraman
 

 
public class Main
{
  public static void main(String[]args)
  {
    KeyboardReader reader = new KeyboardReader();
    
    ProperFraction[] farray = new ProperFraction[10];
   String[] carray = new String[10];
 
//Instantiate array of ProperFractions    
    farray[0] = new ProperFraction(8,3);
    farray[1] = new ProperFraction(25, 24);
    farray[2] = new ProperFraction(12, 2);
    farray[3] = new ProperFraction(-8, 1);
    farray[4] = new ProperFraction(9, -2);
    farray[5] = new ProperFraction(-7, -3);
    farray[6] = new ProperFraction(12321, 111);
    farray[7] = new ProperFraction(-41, 143);
    farray[8] = new ProperFraction(15, 10);
    farray[9] = new ProperFraction(1, 0);
 
   carray[0] = "2 2/3";
   carray[1] = "1 1/24";
   carray[2] = "6";
   carray[3] = "-8";
   carray[4] = "-4 1/2";
   carray[5] = "2 1/3";
   carray[6] = "111";
   carray[7] = "-41/143";
   carray[8] = "1 1/2";
   carray[9] = "0";
 
//Display values with print and toString
    System.out.println("Test Case One -- Constructors and print");
    int i;
    for(i = 0; i<farray.length; i++)
    {
      System.out.print("STUDENT #" + (i+1) + " = ");
      farray[i].print();
     System.out.print("\t CORRECT #" +(i+1) + " = " + carray[i]);
      System.out.println();
    }
    reader.pause();
    
    System.out.println("Test Case Two -- toString");
   for(i = 0; i<farray.length; i++)
   {
       System.out.print("STUDENT #" + (i+1) + " = " +
      farray[i]);
     System.out.println("\t CORRECT #" +(i+1) + " = " + carray[i]);  
    }
    reader.pause();
 
   
 
  }
 
}
    

