//Money.java
//Grader's Name: 
//Score after regrade: 
//I didn't do any BONUS.
//This simple class consists of only 2 instance variables, containing dollars and cents values.
//It is both incomplete and incorrect.
//Your task:  Complete, fix it, and thoroughly test it in the MoneyRunner file (Main).

//Regrader: Karis Liu
//Regraded Score: 1/0 (+1 bonus point!)

public class Money             
{
	// private instance variables
	private int myDollars;
	private int myCents;
	
	// default constructor method -- no parameters
	public Money()
	{
		myDollars = 0;
		myCents = 0;
	}
	// constructor method to input dollars and cents
	public Money(int newDollars, int newCents)
	{
		myDollars = newDollars;
		myCents = newCents;
    this.normalize();
	}

	//Accessor methods -- return the private variable values
	public int getDollars()
	{
		return myDollars;
	}
	
	public int getCents()
	{
		return myCents;
	}
	
	//  One Money parameter add method
	//  This method combines the totals in this and the parameter amount
	public Money add(Money amount)
	{
		Money result = new Money();
		
		result.myCents = this.myCents + amount.myCents;
		result.myDollars = this.myDollars + amount.myDollars;
		
		result.normalize();
		return result;
	}
	// 	Two int parameter add method  -- YOU WILL ADD THIS AND MUCH MORE!!!
	//  This method gets passed dollars and cents instead of a Money object
 public Money add(int d, int c){
   Money secondResult = new Money(d,c);
   return add(secondResult);//Calls previous add method for operation
  
 }
 public Money subtract(Money amount)
	{
		Money thirdResult = new Money();
		
		thirdResult.myCents = this.myCents - amount.myCents;
		thirdResult.myDollars = this.myDollars - amount.myDollars;//Repeats add method process for subtraction
		
		thirdResult.normalize();
		return thirdResult;
	}
 public Money subtract(int d, int c){
   Money fourthResult = new Money(d,c);
   return subtract(fourthResult);//Calls previous Subtract method for operation.
 }
 public Money multiply(int f){
   Money fifthResult = new Money();
   fifthResult.myCents = this.myCents*f;
   fifthResult.myDollars = this.myDollars*f;//Repeats same process but for multiplication
   fifthResult.normalize(); 
   
    return fifthResult;
 }



	//This method should fix the problem of myCents > 99 or myCents < 0
	//Think carefully about which methods should call normalize()
	//COMPLETING THIS METHOD IS THE MAIN PART OF THIS ASSIGNMENT
	private void normalize()
	{
    int newDoll = myDollars;
    if(myCents > 99){
      int roundDollars = myCents/100;//Dollar portion of the cents to dollars
      newDoll = roundDollars + myDollars;//Adds dollar portion of cents to dollars
      int roundCents = myCents - (roundDollars*100);//Subtracts the dollar portion from the cents
      myCents = roundCents;
    } 
    int totalCents = (newDoll*100) + myCents;//Gets the total net amount of cents to easily normalize
   if(totalCents < 0){
     myDollars = 0;//Sets the Dollars and Cents equal to zero if values are negative
     myCents = 0;
   } else{
     myDollars = totalCents/100;
     myCents = totalCents % 100;
   }
		
		
	}

	//This method (sometimes incorrectly) displays the values to the screen 
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public void print()
	{
   System.out.println(this);//Prints the value from the toString method.
	}

	
	// This method (sometimes incorrectly) converts the object to a String and returns it	
	// THIS METHOD REQUIRES ONLY A SMALL MODIFICATION TO WORK PROPERLY
	public String toString()
	{
		String s1;
    if(myCents < 10){
      s1 = "$" + myDollars + ".0"+ myCents;
    } else{
      s1 = "$" + myDollars + "." + myCents;
    }
		return s1;
    
	}

  public static void SortMoney(){
    int count = 0;
    int track;
    int[] dollarArray = new int[100];
    int[] centsArray = new int[100];
    KeyboardReader reader = new KeyboardReader();
    System.out.println("Welcome to the Sort Money program. Enter the amount of dollars first and then enter the amount of cents next. Enter -999 as dollars to print the results." + "\n");//Welcome message with instructions for the user
    while(true){
      int d = reader.readInt("\nEnter the amount of dollars: ");//Reads in the dollars
      if(d == -999) {
         break;//Entry won't be counted
      }
      int c = reader.readInt("\nEnter the amount of cents: ");//Reads in the cents
      dollarArray[count] = d;
      centsArray[count] = c;
      count++;//Increments for the next entry
      
    }

    Money[] moneyArr = new Money[count];
    for(int i=0; i<count; i++){
          moneyArr[i] = new Money(dollarArray[i], centsArray[i]);
          moneyArr[i].normalize();
    }
    sorting(moneyArr);
  }
      private static int convertToCents(Money cash){
          int cents2 = (cash.myDollars*100)+cash.myCents;
          return cents2;
      } 
      private static void sorting(Money[] argArray){
        for(int i=0; i<argArray.length; i++){
          for(int j=i+1; j<argArray.length; j++){
            int a1 = convertToCents(argArray[i]);
            int a2 = convertToCents(argArray[j]);
            Money temp1 = argArray[i];
            Money temp2 = argArray[j];
            if(a1 < a2){
              argArray[i] = temp2;
              argArray[j] = temp1;
            }
          }
        }
        for(int i=0; i<argArray.length; i++){
          argArray[i].print();
        }
      }

  }







