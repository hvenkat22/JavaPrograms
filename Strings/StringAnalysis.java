//Hari Venkataraman
//StringAnalysis.java
//String Assignment
import java.util.ArrayList;
public class StringAnalysis{
  private String str;
  private ArrayList<String> list = new ArrayList<String>();
  private String[] stringArr;
  public StringAnalysis(String str2){
    str = str2;//Initialize instance variable.
    String testStr = str;
    int index = 0;
    int numSpaces = 0;
    while(index != -1){
      index = testStr.indexOf(' ');
      if(index > 0){
        numSpaces++;
        String extract = testStr.substring(0, index);//Doesn't change original String (str).
        list.add(extract);
        testStr = testStr.substring(index+1);//After the space.
      }
    }
    if(testStr.length() != 0 || list.isEmpty()){
      int l = testStr.length();
      if(testStr.indexOf('.') > 0){
        l = testStr.length() - 1;//Accounts for the period at the end. The result would be the length of the String subtracted by 1.
      }
      list.add(testStr.substring(0,l));//Adds the rest of the words where there were no spaces left.
    }
    int j=0;
    stringArr = new String[str.length()-numSpaces];
    for(int i=0; i<str.length(); i++){
      String letter = str.substring(i,i+1);
      if(!letter.equals(" ")){
          stringArr[j] = letter;
          j++;//Independent of i.
        }
      
    }
  }
  public ArrayList<String> getArrayList(){
    return list;//Returns the private variable ArrayList of Strings.
  }
  public String[] getArray(){
    return stringArr;//Returns the private variable Array of Strings.
  }
  public void showArrayList(){
    for(String word : list){
      System.out.println(word);//Prints the values in the ArrayList using an Enhanced-For Loop.
    }   
  }
  public void showArray(){
    int count = 0;
    for(String letter : stringArr){
      System.out.print(letter);
      if(count < (stringArr.length-1)){
        System.out.print(", ");//Prints the values in the array using Enhanced-For Loop. Separated by commas and the if loops makes sure that there's no comma after the last value.
        count++;
      }
      
      
    }
  }
  public String toString(){
    return str;
  }
  public int getNumVowels(){
    int numVowels = 0;
    for(int i=0; i<stringArr.length; i++){
      if(stringArr[i].equalsIgnoreCase("a") || stringArr[i].equalsIgnoreCase("e") || stringArr[i].equalsIgnoreCase("i") || stringArr[i].equalsIgnoreCase("o") || stringArr[i].equalsIgnoreCase("u")){
        numVowels++;//Checks to see the number of vowels in the String regardless of case(UpperCase or LowerCase).
      }
      
    }
    return numVowels;//Returns the number of vowels in the String.
  }
  public boolean isAlphabetized(){
    int i=0;
    while(i < list.size()){
      String word = list.get(i).toLowerCase();
      i++;
      for(int j=i; j<list.size(); j++){
        if(word.compareTo(list.get(j).toLowerCase()) > 0){
          return false;
        }
      }
    }
    return true;
    
  }
  public boolean isPalindrome(){
    for(int i=0; i<(stringArr.length/2); i++){
      if(stringArr[i].equalsIgnoreCase(stringArr[stringArr.length-2-i])){
        //blank space.
      } else {
        return false;
      }
    }
    return true;
  }
  public boolean isPalindromeBONUS(){
     for(int i=0; i<(stringArr.length/2); i++){
      if(stringArr[i].equalsIgnoreCase(stringArr[stringArr.length-2-i])){
        //blank space.
      } else {
        return false;
      }
    }
    return true;
  }
  public int wordCount(int choice, String str){
    int numStr = 0;
    if(choice == 1){
      for(int i=0; i<list.size(); i++){
        if(list.get(i).equalsIgnoreCase(str)){
          numStr++;//Returns the number of times the Specific word is found BY ITSELF.
        }
      }
      return numStr;
    } else if(choice == 2){
        int num = 0;
        for(int i=0; i<list.size(); i++){
          int lastIndex = 0;
          while(lastIndex != -1){
            lastIndex = list.get(i).toLowerCase().indexOf(str.toLowerCase(), lastIndex);
            if(lastIndex != -1){
              num++;
              lastIndex+=str.length();//Adds the last index to the string. Words embedded anywhere.
            }
          }
        }
        return num;  
      
    } else if(choice == 3){
        int strNum = 0;
        for(int i=0; i<list.size(); i++){
          int index = list.get(i).toLowerCase().indexOf(str.toLowerCase());
          if(index >= 0){
            strNum++;//Checks if the specific word is embedded anywhere.
          }
        }
        return strNum;
    } else if(choice == 4){
        StringAnalysis s1;
        int num = 0;
        for(int i=0; i<list.size(); i++){
          int lastIndex = 0;
          while(lastIndex != -1){
            lastIndex = list.get(i).toLowerCase().indexOf(str.toLowerCase(), lastIndex);
            if(lastIndex != -1){
              num++;
              lastIndex+=str.length();//Adds the last index to the string. Words embedded anywhere.
            }
          }
        }
        String[] reverse = new String[str.length()];
        for(int i=0; i<reverse.length; i++){
          String letter = str.substring(i,i+1);
          reverse[str.length()-(i+1)] = letter;//Reverses the characters in the String.
        }
        String reverseStr = "";
       for(int j=0; j<reverse.length; j++){
         reverseStr+=reverse[j];
       }
       for(int i=0; i<list.size(); i++){
          int lIndex = 0;
          while(lIndex != -1){
            lIndex = list.get(i).toLowerCase().indexOf(reverseStr.toLowerCase(), lIndex);
            if(lIndex != -1){
              num++;
              lIndex+=reverseStr.length();//Adds the last index to the string. Words embedded anywhere.
            }
          }
        }
        return num;
        

    }
    return 0; 
  }

  
}