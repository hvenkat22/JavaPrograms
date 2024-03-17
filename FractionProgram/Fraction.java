//Fraction.java
//Hari Venkataraman

public class Fraction{
  private int myNum;
  private int myDenom;
	//constructors
	public Fraction(){
    myNum = 0;
    myDenom = 1;
  }      
	public Fraction(int n, int d) {
    myNum = n;
    myDenom = d;
   // Fraction result = new Fraction(n,d);
    this.simplify();
  }//creates a fully simplified fraction n/d
  public int getNumerator() {
    return myNum;
  }  	//returns numerator
	public int getDenominator(){
    return myDenom;
  }	//returns denominator
  public Fraction(double db){
    this.myDenom = 1;
    String s = String.valueOf(db);//Converts double to String
    int digitsDec = s.length() - 1 - s.indexOf('.');//Takes away the decimal point
    for(int i=0; i<digitsDec; i++){
      db=db*10;
      this.myDenom = this.myDenom*10;
    }
    this.myNum = (int)Math.round(db);//Rounds the double value and stores it in the numerator. 
    this.simplify();
  }   // Creates a Fraction equivalent of the decimal parameter.
      // Passing in (.3) would create the fraction 3/10
//private method
	private void simplify(){
    if(this.myDenom == 0){
      System.out.println("Error.Denominator can't be 0.");//If the denominator of any fraction is 0, it throws an error message.
      this.myNum = 0;//Sets the numerator to 0 and the denominator to 1 is the if loop condition is true.
      this.myDenom = 1;
      this.print();//Prints accordingly
    }
    
    int findGcd = gcd(myNum, myDenom);
     myNum = myNum/findGcd;//Simplifies numerator
     myDenom = myDenom/findGcd;//Simplifies denominator
     if(this.myNum > 0 && this.myDenom < 0 ){
      this.myNum = -this.myNum;//Moves the negative sign from the denominator to the numerator
      this.myDenom = Math.abs(this.myDenom);//Denominator will be positive

    }
    if(this.myNum < 0 && this.myDenom < 0){
      this.myNum = Math.abs(this.myNum);
      this.myDenom = Math.abs(this.myDenom);//Changes both numerator and denominator to positive if both are negative
    }
    this.print();//Prints the resulting fraction


  }		//fully reduces the Fraction

  private int gcd(int num, int denom) {
    if(num == 0){
      return denom;
    }
    int result = gcd(denom%num, num);//Recursively calling gcd method. 
    return result;
  }

//public methods
	public Fraction add(Fraction f) {
      Fraction answer = new Fraction();
     answer.myDenom = this.myDenom*f.myDenom;
     answer.myNum = f.myDenom*this.myNum + f.myNum*this.myDenom;
     answer.simplify();
     return answer;
  }  
public Fraction subtract(Fraction f) {
  Fraction answer2 = new Fraction();
  answer2.myDenom = this.myDenom*f.myDenom;
  answer2.myNum = f.myDenom*this.myNum - f.myNum*this.myDenom;
  answer2.simplify();
  return answer2;
}  //returns this minus f
public Fraction multiply(Fraction f){
  Fraction answer3 = new Fraction();
  answer3.myDenom = this.myDenom*f.myDenom;
  answer3.myNum = this.myNum*f.myNum;
  answer3.simplify();
  return answer3;
}
public Fraction divide(Fraction f){
  Fraction answer4 = new Fraction();
  answer4.myDenom = this.myDenom*f.myNum;
  answer4.myNum = this.myNum*f.myDenom;
  answer4.simplify();
  return answer4;
}
	public double toDouble(){
    double quotient = ((double)this.myNum)/this.myDenom;//Divides the fraction to get the double value
    return quotient;
  }	   // converts the fraction to a double

	public int compareTo(Fraction f){
    if(this.toDouble() > f.toDouble()){
      return 1;
    } else if(f.toDouble() == this.toDouble()){
      return 0;
    } else if(f.toDouble() > this.toDouble()){
      return -1;
    }
    return 1;
  } // returns 1 if this is bigger than f 
   // returns 0 if this and f are equal
   // returns -1 if f is bigger than this
	
public boolean equals(Fraction f)	{
  if(f.toDouble() == this.toDouble()){
    return true;
  } else {
    return false;
  }
}
public boolean equals(double dd) {
  if(this.toDouble() == dd){
    return true;
  } else {
    return false;
  }
  }
  // two doubles within .00000001 are considered equal 	
public boolean equals(int n, int d)	{
  if(this.myNum == n && this.myDenom == d){
    return true;
  } else {
     return false;
  }
}

//accessors
	
	public void print()	{
    System.out.println(this);
  }	//fractions should look like this:  -3/4, 13/23, 4/1 
	public String toString(){
    String s = myNum + "/" + myDenom;
    return s;
  }
  
  }
