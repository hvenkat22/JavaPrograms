//Hari Venkataraman

public class ProperFraction extends Fraction{
  public ProperFraction(int n, int d){
    super(n,d);//Passes the two parameters of ProperFraction constructor to the 2nd constructor of Fraction (Parent Class).
  }
  public int getWhole(){
    int whole = (int)(getNumerator()/getDenominator());//The integer portion of Numerator divided by the denominator is the whole numebr of the mixed or proper fraction.
    return whole;
  }
  public int getRemainder(){
    int remainder = (int)(getNumerator()%getDenominator());//The modulus of the numerator and the denominator is the remainder and that would be the numerator of the proper fraction.
    return remainder;
  }
  public void print(){
    System.out.println(this);//Calls the toString method.
  }
  public String toString(){
    String frac = "";//Declares string
    int n = getRemainder();//To manipulate the value of getRemainder.
    if(getRemainder() < 0){
      n = -1*getRemainder();//If the remainder is negative, then it has to be made positive.
      frac = getWhole() + " " + n + "/" + getDenominator();//Prints the fraction accordingly
    } else if(getRemainder() == 0){
      frac = "" + getWhole();//If the denominator of the original fraction is 1 or if the remainder is 0, then the proper fraction would just be the whole number
    } else {
      frac = getWhole() + " " + n + "/" + getDenominator();//Prints accordingly
    }
     return frac;//Returns the string.
    
  }
}