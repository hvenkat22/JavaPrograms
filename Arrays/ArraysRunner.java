// Test Cases for Last Array Assignment
 
//Hari Venkataraman
//Return to arrays/ArrayLists with a hopefully easy assignment at the end of the class
 
import java.util.ArrayList; 
 
public class Main
{
  static KeyboardReader reader = new KeyboardReader();
  
  public static void main(String[] args)
  {
    ProcessArrays p = new ProcessArrays();
    int method;
 
    ArrayList<Integer> aL, cL;
    
    TwoAnswer t;
    
    do
    {
      System.out.println("***********************************************************************");
      System.out.println("**************** ProcessArrays Testing *************************************");
      method = reader.readInt("\n\nPlease select a testing option:\n"+
                  "1. Menu 1 -- remove \n"+
                  "2. Menu 2 -- sortUs \n"+
                  "3. Menu 3 -- sum \n"+
                  "4. Menu 4 -- largest \n"+
                  "5. Menu 5 -- countDigits \n"+
                  "6. Menu 6 -- makeMeLaugh\n"+
                  "7. Menu 7 -- isPrime -- MUST BE UNCOMMENTED\n"+
                  "0. exit\n");
      System.out.println("***********************************************************************");
      //#############################################################################################
      //#############################################################################################
      if(method == 1)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 1 -- remove\n");
        System.out.println("***** CASE 1 *****\n");
 
        int[] a1 = {1,2,3,4};
 
        int[] c1 = {1,-1,3,-1};
        int[] cal1 = {1, 3};
        
        aL = buildAL(a1);
        cL = buildAL(cal1);
        
        p.remove(a1, aL, 2);
                  
        System.out.println("The STUDENT array is: " + showAr(a1));
        System.out.println("The CORRECT array is: " + showAr(c1));
        reader.pause();
        System.out.println("\nThe STUDENT ArrayList is: " + aL);
        System.out.println("The CORRECT ArrayList is: " + cL);
 
        reader.pause();
        System.out.println("\n***** CASE 2 *****\n");
 
        int [] a2 = {1,2,3,4};
 
        int [] c2 = {0,2,0,4};
        int [] cal2 = {2,4};
        
        aL = buildAL(a2);
        cL = buildAL(cal2);
        
        p.remove(a2, aL, 1);
                  
        System.out.println("The STUDENT array is: " + showAr(a2));
        System.out.println("The CORRECT array is: " + showAr(c2));
        reader.pause();
        System.out.println("\nThe STUDENT ArrayList is: " + aL);
        System.out.println("The CORRECT ArrayList is: " + cL);
 
        reader.pause();
        System.out.println("\n***** CASE 3 *****\n");
 
        int [] a3 = {1,1,1,2,2,2,3,3,3};
 
        int [] c3 = {0,0,0,2,2,2,0,0,0};
        int [] cal3 = {2,2,2};
        
        aL = buildAL(a3);
        cL = buildAL(cal3);
        
        p.remove(a3, aL, 1);
                  
        System.out.println("The STUDENT array is: " + showAr(a3));
        System.out.println("The CORRECT array is: " + showAr(c3));
        reader.pause();
        System.out.println("\nThe STUDENT ArrayList is: " + aL);
        System.out.println("The CORRECT ArrayList is: " + cL);
        reader.pause();
      }
      //#############################################################################################
      //#############################################################################################
      else if(method == 2)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 2 -- sortUs\n");
        System.out.println("***** CASE 1 *****\n");
 
        int[] a1 = {1,2,3,4};
 
        int[] c1 = {4,3,2,1};
        int[] cal1 = {4,3,2,1};
        
        aL = buildAL(a1);
        cL = buildAL(cal1);
        
        p.sortUs(a1, aL);
                  
        System.out.println("The STUDENT array is: " + showAr(a1));
        System.out.println("The CORRECT array is: " + showAr(c1));
        reader.pause();
        System.out.println("\nThe STUDENT ArrayList is: " + aL);
        System.out.println("The CORRECT ArrayList is: " + cL);
        reader.pause();
        
        System.out.println("\n***** CASE 2 *****\n");
 
        int[] a2 = {1,1,1,2,2,2,3,3,3,4,4,4};
 
        int[] c2 = {4,4,4,3,3,3,2,2,2,1,1,1};
        int[] cal2 = {4,4,4,3,3,3,2,2,2,1,1,1};
        
        aL = buildAL(a2);
        cL = buildAL(cal2);
        
        p.sortUs(a2, aL);
                  
        System.out.println("The STUDENT array is: " + showAr(a2));
        System.out.println("The CORRECT array is: " + showAr(c2));
        reader.pause();
        System.out.println("\nThe STUDENT ArrayList is: " + aL);
        System.out.println("The CORRECT ArrayList is: " + cL);
 
        reader.pause();
      }
 
      //#############################################################################################
      //#############################################################################################
      else if(method == 3)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 3 -- sum\n");
        System.out.println("***** CASE 1 *****\n");
 
        int[] a1 = {1,2,3,4};
 
        int c1 = 10;
        
        aL = buildAL(a1);
        
        t = p.sum(a1, aL);
                  
        System.out.println("The STUDENT getanswer1 is: " + t.getanswer1());
        System.out.println("The CORRECT getanswer1 is: " + c1);
        reader.pause();         
        System.out.println("\nThe STUDENT getanswer2 is: " + t.getanswer2());
        System.out.println("The CORRECT getanswer2 is: " + c1);
 
        reader.pause();
        
        System.out.println("\n***** CASE 2 *****\n");
 
        int[] a2 = {};
 
        int c2 = 0;
        
        aL = buildAL(a2);
        
        t = p.sum(a2, aL);
                  
        System.out.println("The STUDENT getanswer1 is: " + t.getanswer1());
        System.out.println("The CORRECT getanswer1 is: " + c2);
        reader.pause();         
        System.out.println("\nThe STUDENT getanswer2 is: " + t.getanswer2());
        System.out.println("The CORRECT getanswer2 is: " + c2);
        reader.pause();
 
      }
      //#############################################################################################
      //#############################################################################################
      else if(method == 4)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 4 -- largest\n");
        System.out.println("***** CASE 1 *****\n");
 
        int[][] a1 = {{1,2,3,4},{5,6,7,8}};
 
        int r1 = 26;
        int c1 = 12;
 
        t = p.largest(a1);
                  
        System.out.println("The STUDENT getanswer1 is: " + t.getanswer1());
        System.out.println("The CORRECT getanswer1 is: " + r1);
        reader.pause();         
        System.out.println("\nThe STUDENT getanswer2 is: " + t.getanswer2());
        System.out.println("The CORRECT getanswer2 is: " + c1);
        reader.pause();
        
        System.out.println("***** CASE 2 *****\n");
 
        int[][] a2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
 
        r1 = 4;
        c1 = 5;
 
        t = p.largest(a2);
                  
        System.out.println("The STUDENT getanswer1 is: " + t.getanswer1());
        System.out.println("The CORRECT getanswer1 is: " + r1);
        reader.pause();         
        System.out.println("\nThe STUDENT getanswer2 is: " + t.getanswer2());
        System.out.println("The CORRECT getanswer2 is: " + c1);
        
        reader.pause();
        
      }
      //#############################################################################################
      //#############################################################################################
      if(method == 5)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 5 -- countDigits\n");
        System.out.println("***** CASE 1 *****\n");
 
        int[] a1 = {0,1,2,3,4,5,6,7,8,9};
 
        int[] c1 = {2,2,2,2,2,2,2,2,2,2};
        
        aL = buildAL(a1);
        cL = buildAL(c1);
        
        int[] d1 = p.countDigits(a1, aL);
                  
        System.out.println("The STUDENT digit count is: " + showAr(d1));
        System.out.println("The CORRECT digit count is: " + showAr(c1));
 
        reader.pause();
    
        System.out.println("\n***** CASE 2 *****\n");
        int[] a2 = {1,2,2,33,344,4,4,5};
        int[] al2 = {5555,60};
        
        int[] c2 = {1,1,2,3,4,5,1,0,0,0};
        
        aL = buildAL(al2);
        cL = buildAL(c2);
        
        int[] d2 = p.countDigits(a2, aL);
                  
        System.out.println("The STUDENT digit count is: " + showAr(d2));
        System.out.println("The CORRECT digit count is: " + showAr(c2));
        reader.pause();
 
      }
      //#############################################################################################
      //#############################################################################################
      if(method == 6)
      {
        //////////////////////////////////////////////////////////////////////
        System.out.println("\n\nMenu 6 -- makeMeLaugh\n");
        System.out.println("\n\n***** Your joke *****\n");
        p.makeMeLaugh();
        System.out.println("\nIf it displayed a joke that would not get Mr. McKeen fired, check the box to \n"
                  + "give 1/1 pt. \n");
        reader.pause();
        
      }
      //#############################################################################################
      //#############################################################################################
      
      
    }while (method !=0);
    
    System.out.println("\nThank you for using the ProcessArray Tester.");
    
  }  //ends main
 
  //////////////////////////////////////////////////////////////////////////////////////
  // Helper methods
  //////////////////////////////////////////////////////////////////////////////////////
  
  // Cleanly displays the values in an array a
  public static String showAr(int[] a)
  {
    String s = "[";
    for(int i: a)
    {
      s += i+", ";
      
    }
    if(s.length()>=2)
      s=s.substring(0, s.length()-2);
    s+="]";
    return s;
  }
 
  // Puts the values in an int[] into an ArrayList<Integer>
  public static ArrayList<Integer> buildAL(int[] a)
  {
    ArrayList<Integer> aL = new ArrayList<Integer>();
    for(int i: a)
    {
      aL.add(i);
    }
    return aL;
  }
} // ends class
 
 
 

