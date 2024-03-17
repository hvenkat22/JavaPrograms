package Start1;

import java.util.Scanner;
class palindrome {
  public static boolean isPalindrome(String s){
    String rev = "";
    int len = s.length();
    for(int i=len-1; i>=0; i--){
      rev=rev+s.charAt(i);
    }
    if(s.toLowerCase().equals(rev.toLowerCase())){
      return(true);
    }
    return(false);
  }
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
    String str = sc.next();
    if(isPalindrome(str)){
      System.out.println(str+" is a Palindrome String.");
    }else{
      System.out.println(str + " is not a palindrome string");
    }
  }
}