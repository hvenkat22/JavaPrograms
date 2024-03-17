//Hari Venkataraman
 

import java.util.ArrayList;
 
public class Main
{
  public static void main(String[]args)
  {
    KeyboardReader reader = new KeyboardReader();
    
    int prog, caseNum;
    StringAnalysis s1, s2;
    ArrayList a1;
    String st1, search;
//    String[] sarray;
    do
    {
      System.out.println("\n#############################################");
      System.out.println("\nWelcome to the String Project test cases.");
      System.out.println("What Test Case # do you want to run?\n\n"+
                  "0. getArrayList/Constructor Testing\n"+
                  "1. getNumVowels Testing\n"+
                  "2. isAlphabetized Testing\n"+
                  "3. isPalindrome Testing\n"+
                  "4. wordCount Testing\n\n"+
                  "5. isPalindromeBONUS Testing -- must be uncommented\n"+
                  "6. wordCount BONUS Testing\n"+
                  "7. displayAnalysisBONUS() Testing -- must be uncommented\n" +
                  "8. Exit\n");
      System.out.println("#############################################");
      prog = reader.readInt("Please select a testing option: ");
                  
      if(prog == 0)  //getArrayList Testing -- really testing the constructor
      {
        System.out.println("\n\ngetArrayList and constructor -- Test Case 0");
        s1 = new StringAnalysis("Rupert is my friend.");
        a1 = s1.getArrayList();
        System.out.println("The test case is: \"" + s1 + "\"");
        for(Object o: a1)
        {
          System.out.println("##" + o + "##");
        }
        System.out.println("\nConfirm that the four words are printed between the ## ## with NO SPACES and NO PERIOD.");
        System.out.println("\nIf correct, check the box for 2 points.");
        reader.pause();
        
      }
      else if(prog == 1)  //getNumVowels
      {
        System.out.println("\n\ngetNumVowels -- Test Case 1a");
        s1 = new StringAnalysis("Rupert is my friend.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.getNumVowels());
        System.out.println("CORRECT ANSWER:  5");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
 
        System.out.println("\n\ngetNumVowels -- Test Case 1b");
        s1 = new StringAnalysis("All day I eat figs with everybody but Dougie.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.getNumVowels());
        System.out.println("CORRECT ANSWER:  15");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
      }
      else if(prog == 2)  //isAlphabetized
      {
        System.out.println("\n\nisAlphabetized -- Test Case 2a");
        s1 = new StringAnalysis("apple Bob cat Dog.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isAlphabetized());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the box for 2 points.");
        reader.pause();
 
        System.out.println("\n\nisAlphabetized -- Test Case 2b");
        s1 = new StringAnalysis("zebra yak apple bob.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isAlphabetized());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
 
        System.out.println("\n\nisAlphabetized -- Test Case 2c");
        s1 = new StringAnalysis("apple Apple apple Apple.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isAlphabetized());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
 
        System.out.println("\n\nisAlphabetized -- Test Case 2d");
        s1 = new StringAnalysis("doglike DoG.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isAlphabetized());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
 
        System.out.println("\n\nisAlphabetized -- Test Case 2e");
        System.out.println("\nIf no points were missed on isAlphabetized, " +
          "the sheet should automatically check the box for 1 point.");
        reader.pause();
 
      }
      else if(prog == 3)  //isPalindrome
      {
        System.out.println("\n\nisPalindrome -- Test Case 3a");
        s1 = new StringAnalysis("bob.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindrome());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nisPalindrome -- Test Case 3b");
        s1 = new StringAnalysis("amana.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindrome());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nisPalindrome -- Test Case 3c");
        s1 = new StringAnalysis("racecar.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindrome());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nisPalindrome -- Test Case 3d");
        s1 = new StringAnalysis("moon.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindrome());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nisPalindrome -- Test Case 3e");
        s1 = new StringAnalysis("amanaplanacanalpanama.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindrome());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nisPalindrome -- Test Case 3f");
        System.out.println("\nIf no points were missed on isPalindrome, " +
          "the sheet should automatically check the box for 1 point.");
        reader.pause();     }
 
      else if(prog == 4)   //wordCount testing
      {
        System.out.println("\n\nwordCount -- Test Case 4a");
        s1 = new StringAnalysis("Dog faced Dogbert ran doggedly into the dog house to study endogamous dogma.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 1");
        System.out.println("search = \"DOG\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(1, "DOG"));
        System.out.println("CORRECT ANSWER:  2");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4b");
        s1 = new StringAnalysis("Dog faced Dogbert ran doggedly into the dog house to study endogamous dogma.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 2");
        System.out.println("search = \"DOG\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(2, "DOG"));
        System.out.println("CORRECT ANSWER:  6");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4c");
        s1 = new StringAnalysis("Dog faced Dogbert ran doggedly into the dog house to study endogamous dogma.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 3");
        System.out.println("search = \"DOG\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(3, "DOG"));
        System.out.println("CORRECT ANSWER:  6");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4d");
        s1 = new StringAnalysis("Pompoms are used by the pompom people who put pomade in their mops and ride mopeds.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 1");
        System.out.println("search = \"pom\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(1, "pom"));
        System.out.println("CORRECT ANSWER:  0");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4e");
        s1 = new StringAnalysis("Pompoms are used by the pompom people who put pomade in their mops and ride mopeds.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 2");
        System.out.println("search = \"pom\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(2, "pom"));
        System.out.println("CORRECT ANSWER:  5");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4f");
        s1 = new StringAnalysis("Pompoms are used by the pompom people who put pomade in their mops and ride mopeds.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 3");
        System.out.println("search = \"pom\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(3, "pom"));
        System.out.println("CORRECT ANSWER:  3");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4g");
        s1 = new StringAnalysis("Cat cut catatonic cat cat catcatcat.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 1");
        System.out.println("search = \"Cat\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(1, "Cat"));
        System.out.println("CORRECT ANSWER:  3");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4h");
        s1 = new StringAnalysis("Cat cut catatonic cat cat catcatcat.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 2");
        System.out.println("search = \"Cat\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(2, "Cat"));
        System.out.println("CORRECT ANSWER:  7");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4i");
        s1 = new StringAnalysis("Cat cut catatonic cat cat catcatcat.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 3");
        System.out.println("search = \"Cat\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(3, "Cat"));
        System.out.println("CORRECT ANSWER:  5");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4j");
        s1 = new StringAnalysis("The cattle scat dog catatonic dog scat.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 2");
        System.out.println("search = \"Cat\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(2, "Cat"));
        System.out.println("CORRECT ANSWER:  4");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4k");
        s1 = new StringAnalysis("A dog a cat a.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 1");
        System.out.println("search = \"A\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(1, "A"));
        System.out.println("CORRECT ANSWER:  3");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
        System.out.println("\n\nwordCount -- Test Case 4m");
        s1 = new StringAnalysis("Wait.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 1");
        System.out.println("search = \"wait\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(1, "wait"));
        System.out.println("CORRECT ANSWER:  1");
        System.out.println("\nIf the answers match, check the box for 1 point.");
        reader.pause();
        
      } 
/////////////////////////////////////////////////////////////     
      else if(prog == 5)  //isPalindromeBONUS -- MUST BE UNCOMMENTED
      {
      
       System.out.println("\n\nisPalindromeBONUS -- Test Case 5a");
        s1 = new StringAnalysis("Sit on a potato pan Otis.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindromeBONUS());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nisPalindromeBONUS -- Test Case 5b");
        s1 = new StringAnalysis("Madam Im Adam.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindromeBONUS());
        System.out.println("CORRECT ANSWER:  true");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nisPalindromeBONUS -- Test Case 5c");
        s1 = new StringAnalysis("ab.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindromeBONUS());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nisPalindromeBONUS -- Test Case 5d");
        s1 = new StringAnalysis("moon.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.isPalindromeBONUS());
        System.out.println("CORRECT ANSWER:  false");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nisPalindromeBONUS -- Summary");
        System.out.println("\nIf all boxes are checked,"+
          " the sheet should automatically give +1 point.");
        reader.pause();
      
      }
/////////////////////////////////////////////////////////////  
      else if(prog == 6)   //wordCount BONUS Choice 4 testing
      {
        System.out.println("\n\nwordCount BONUS -- Test Case 6a");
        s1 = new StringAnalysis("Pompoms are used by the pompom people who put pomade in their mops and ride mopeds.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 4");
        System.out.println("search = \"POM\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(4, "pom"));
        System.out.println("CORRECT ANSWER:  7");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nwordCount BONUS -- Test Case 6b");
        s1 = new StringAnalysis("I like to take a nap with a panda while eating pancakes and using napkins.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 4");
        System.out.println("search = \"nap\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(4, "nap"));
        System.out.println("CORRECT ANSWER:  4");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nwordCount BONUS -- Test Case 6c");
        s1 = new StringAnalysis("Nobody likes onyx pony noses more than conservationist liopleurodons.");
        System.out.println("The test case is: \"" + s1 + "\"");
        System.out.println("choice = 4");
        System.out.println("search = \"no\"");
        System.out.println("\nSTUDENT ANSWER:  " + s1.wordCount(4, "no"));
        System.out.println("CORRECT ANSWER:  7");
        System.out.println("\nIf the answers match, check the checkbox.");
        reader.pause();
 
        System.out.println("\n\nwordCount BONUS -- Summary");
        System.out.println("\nIf all boxes are checked,"+
          " the sheet should automatically give +1 point.");
        reader.pause();
      }
        
 
    }while(prog !=8);
    
    System.out.println("\n\n\nGoodbye!  I hope that you have a pleasant day and an enjoyable life.");
  }
}
 
///  /////// ///// / ////////////////////

