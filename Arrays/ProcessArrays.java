//Hari Venkataraman
//ProcessArrays.java
//Processing Arrays and ArrayLists.
import java.util.ArrayList;
public class ProcessArrays{
   public void remove(int[] arnold, ArrayList <Integer> albert, int killUs){
     if (killUs % 2 == 0)
    {
      // Array
      for (int i = 0; i < arnold.length; i++)
      {
        if (arnold[i] % 2 == 0)
        {
          arnold[i] = -1;
        }
      }
      // ArrayList
      for (int i = 0; i < albert.size(); i++)
      {
        if (albert.get(i).intValue() % 2 == 0)
        {
          albert.remove(i);
          i--; // Moves the index back to avoid errors
        }
      }
    } else // Removing odd values
    {
      // Array
      for (int i = 0; i < arnold.length; i++)
      {
        if (arnold[i] % 2 != 0)
        {
          arnold[i] = 0;
        }
      }
      // ArrayList
      for (int i = 0; i < albert.size(); i++)
      {
        if (albert.get(i).intValue() % 2 != 0)
        {
          albert.remove(i);
          i--; // Moving the index back to avoid errors
        }
      }
    }
   }
   public void sortUs(int[] arnold, ArrayList<Integer> albert){
     int index;
     int r;
     int tmp;
     for(int i=0; i<arnold.length; i++){
       index = i;
       for(int j=i; j<arnold.length; j++){
         if(arnold[j] > arnold[index]){
           index = j;
         }
       }
       tmp = arnold[i];
       arnold[i] = arnold[index];
       arnold[index] = tmp;//Swaps the values. This is the selection sort to sort the array.
     }
     for(int i=1; i<albert.size(); i++){
       r=i;
       while(r > 0 && albert.get(r-1).compareTo(albert.get(r)) < 0){
         tmp = albert.get(r-1).intValue();//Because albert contains Big I Integers.
         albert.set(r-1,albert.get(r));
         albert.set(r,tmp);
         r--;//Simple swapping to order the ArrayList from smallest to greatest.
       }
     }
   }
   public TwoAnswer sum(int[] arnold, ArrayList<Integer> albert){
     int s1 = 0;
     int s2 = 0;
     for(int n: arnold){
       s1+=n;//Adds consecutively.
     }
     for(Integer n2: albert){
       s2+=n2.intValue();//Albert contains Integers.
     }
     return new TwoAnswer(s1, s2);
   }
   public TwoAnswer largest(int[][] twoDArray){
     int bR = Integer.MIN_VALUE;//Used to find maximum.
     int s = 0;
     for(int[] row: twoDArray){
       s = 0;//Resets the sum to 0 so that the calculated sum won't be repeated.
       for(int num: row){
         s+=num;//Adds values in rows.
       }
       if(s > bR){
         bR = s;//Basic sort to find maximum of rows.
       }
     }
     int bC = Integer.MIN_VALUE;//Used to find maximum for the columns.
     for(int i=0; i<twoDArray[0].length; i++){
       s = 0;
       for(int j = 0; j<twoDArray.length; j++){
         s+=twoDArray[j][i];//Adds with columns.
       }
       if(s > bC){
         bC = s;//Repeats basic sort conducting for row max.
       }
     }
     return new TwoAnswer(bR, bC);//Creates new TwoAnswer by taking the row and column maximum.
   }
   public int[] countDigits(int[] arnold, ArrayList<Integer> albert){
     int[] result = new int[10];
    for (int i = 0; i < result.length; i++)
    {
      result[i] = 0;
    }

    for (int val: arnold)
    {
      while (val > 10)
      {
        result[val % 10]++; // Counts the last digit and moves over.
        val = val / 10; // Deletes the last digit and moves on to next digit.
      }
      result[val]++; // Counts the final digit
    }

    for (Integer val: albert)
    {
      int iint = val.intValue();
      while (iint > 10)
      {
        result[iint % 10]++;
        iint = iint / 10;//Same thing repeated but for the ArrayList and since it's all Integers, the intValue method is used.
      }
      result[iint]++;
    }

    return result;
       }
     public void makeMeLaugh(){
       System.out.println("Please click this link: https://www.youtube.com/watch?v=dQw4w9WgXcQ");
     }
     
   }
   
