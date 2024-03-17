//Hari Venkataraman 
//Testing LinkedBST.java
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Main {
  public static void main(String[] args) {
    KeyboardReader reader = new KeyboardReader();
    LinkedBST j = new LinkedBST();
    while(true){
      int answer = reader.readInt("1. Add a value to the tree" + "\n" + "2. Display preOrder\n" + "3. Display inOrder\n" + "4. Display postOrder\n"  + "5. Search for a Value\n"+"6. Delete a Node\n"+"7. Count Number of Leaf Nodes\n"+"8. findPath\n"+"9. countNode\n"+"42. Hard Coded Test Case\n"+"99. Automated Test Case\n"+ "10. Display LevelOrder\n"+"0. Exit\n");
    if(answer == 1){
      if(j.addNode(reader.readLine("\nEnter a new node:   "))){//If the operation was successful or the addNode method returns true.
        System.out.println("\nThe Node has been added successfully.");
      } else {
        System.out.println("Error. Duplicate value. Node wasn't added.");
      }
      continue;
    } else if(answer == 2){
        System.out.println(j.preOrder());//Prints preordered values
        continue;
    } else if(answer == 3){
        System.out.println(j.inOrder());
        continue;
    } else if(answer == 4){
        System.out.println(j.postOrder());
        continue;
    } else if(answer == 5){
        if(j.search(reader.readLine("\nEnter the value to search for in the tree: "))){
          System.out.println("\nThe value was found in the tree\n");
        } else {
           System.out.println("\nThat value was not found in the tree\n");
        }
        continue;
    } else if(answer == 6){
        if(j.deleteNode(reader.readLine("\nEnter the value to delete:  "))){
          System.out.println("\nThat value was successfuly removed from the tree\n");
        } else {
          System.out.println("\nThat value was not found in the tree. Nothing was removed.\n");
        }
    } else if(answer == 7){
      System.out.println("There are " + j.countLeaf() + " leaf nodes in the tree.");
    } else if(answer == 8){
      Comparable search = reader.readLine("\nWhat would you like to find the path for?");
      System.out.println("\nThe Result of findPath: " + j.findPath(search));
    } else if(answer == 9){
       System.out.println("\nThere are " + j.countNode() + " total Nodes in the tree.");
    } else if(answer == 10){
       System.out.println(j.levelOrder());
    }
      else if(answer == 42){
        j.addNode("5");
        j.addNode("2");
        j.addNode("4");
        j.addNode("7");
        j.addNode("1");
        j.addNode("9");
        System.out.println("Successfully added!");
    } else if(answer == 99){
       // PASTE ALL OF THIS CODE INTO YOUR OPTION 99
   KeyboardReader reader1 = new KeyboardReader();
    LinkedBST treeterter;
    int selection;
    int casenum;
    boolean result = false; // records addNode return
    boolean result1 = false;
    boolean result2 = false;
    List answerTree;
    
    do
    { 
      // These options are for Part III -- delete and recursive methods   
      System.out.println("Welcome to the LinkedBST Automated Test Cases Sub Menu");
      System.out.println("\n1.) Test Group A -- Removing leaves"+
      "\n2.) Test Group B -- Removing root node from small trees"+
      "\n3.) Test Group C -- More complex trees"+
      "\n0.) Exit ");
      selection = reader1.readInt("Enter a selection: ");
      
      //Test Cases -- Group A       
      if (selection == 1)
      {
        treeterter = new LinkedBST();
        casenum = 1;  //used to increment the case number
        //Test Cases -- Group A       
        System.out.println("Test Group A\n\n");
                
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Add 10, 5, 15, 3, 6, 12, 20 to an empty tree and delete 3 ***\n");
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.addNode(new Integer(15));
        treeterter.addNode(new Integer(3));
        treeterter.addNode(new Integer(6));
        treeterter.addNode(new Integer(12));
        treeterter.addNode(new Integer(20));
        treeterter.deleteNode(new Integer(3));
 
        System.out.println("The CORRECT display is: \n[5, 6, 10, 12, 15, 20]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        //casenum++;
        
        //2
        casenum = 2;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 6 from the same tree ***\n");
        treeterter.deleteNode(new Integer(6));
 
        System.out.println("The CORRECT display is: \n[5, 10, 12, 15, 20]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        
        //3
        casenum = 3;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 12 from the same tree ***\n");
        treeterter.deleteNode(new Integer(12));
 
        System.out.println("The CORRECT display is: \n[5, 10, 15, 20]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
 
        //4
        casenum = 4;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 20 from the same tree ***\n");
        treeterter.deleteNode(new Integer(20));
 
        System.out.println("The CORRECT display is: \n[5, 10, 15]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
 
 
        //5
        casenum = 5;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 5 from the same tree ***\n");
        treeterter.deleteNode(new Integer(5));
 
        System.out.println("The CORRECT display is: \n[10, 15]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
 
        //6
        casenum = 6;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 15 from the same tree ***\n");
        treeterter.deleteNode(new Integer(15));
 
        System.out.println("The CORRECT display is: \n[10]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
 
        //7
        casenum = 7;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** delete 10 from the same tree ***\n");
        treeterter.deleteNode(new Integer(10));
 
        System.out.println("The CORRECT display is: \n[]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
      }
      //Test Cases -- Group B       
      else if (selection == 2)
      {
        treeterter = new LinkedBST();
        casenum = 1;  //used to increment the case number
        //Test Cases -- Group B       
        System.out.println("Test Group B\n\n");
                
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Add 10 to an empty tree and delete 10 ***\n");
        result1 = treeterter.addNode(new Integer(10));
        result2 = treeterter.deleteNode(new Integer(10));
 
        System.out.println("The CORRECT display is: \ntrue true []\n");
        System.out.println("The STUDENT's display is: \n" + result1 + " " + result2 + " " + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        
        //2
        casenum = 2;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 5, 15 to the tree and deleting 5***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.addNode(new Integer(15));
        treeterter.deleteNode(new Integer(5));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[10, 15]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        
        //3
        casenum = 3;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 5, 15 to the tree and deleting 15***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.addNode(new Integer(15));
        treeterter.deleteNode(new Integer(15));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[5, 10]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
 
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
 
        //4
        casenum = 4;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 5, 15 to the tree and deleting 10***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.addNode(new Integer(15));
        treeterter.deleteNode(new Integer(10));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[5, 15]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        //5
        casenum = 5;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 5, to the tree and deleting 10***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.deleteNode(new Integer(10));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[5]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        //6
        casenum = 6;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 5, to the tree and deleting 5***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(5));
        treeterter.deleteNode(new Integer(5));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[10]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        
        //7
        casenum = 7;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 15, to the tree and deleting 10***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(15));
        treeterter.deleteNode(new Integer(10));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[15]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        //8
        casenum = 8;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 10, 15, to the tree and deleting 15***\n");
        treeterter = new LinkedBST();
        treeterter.addNode(new Integer(10));
        treeterter.addNode(new Integer(15));
        treeterter.deleteNode(new Integer(15));
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[10]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give .5/.5 point.\n\n");
        reader1.pause();
        casenum++;
        //2  When done
 
 
      }
      //Test Cases -- Group C       
      else if (selection == 3)
      {
        treeterter = new LinkedBST();
        casenum = 1;  //used to increment the case number
        //Test Cases -- Group C       
        System.out.println("Test Group C\n\n");
                
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Nasty test cases ***\n");
        System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and countLeaf ***\n");
        treeterter.addNode(new Integer(1));
        treeterter.addNode(new Integer(0));
        treeterter.addNode(new Integer(9));
        treeterter.addNode(new Integer(7));
        treeterter.addNode(new Integer(3));
        treeterter.addNode(new Integer(8));
        treeterter.addNode(new Integer(2));
        treeterter.addNode(new Integer(4));
        treeterter.addNode(new Integer(6));
        treeterter.addNode(new Integer(5));
 
        System.out.println("The CORRECT display is: \n4\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.countLeaf()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
        
        //2
        casenum = 2;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Nasty test cases ***\n");
        System.out.println("*** Add 1, 0, 9, 7, 3, 8, 2, 4, 6, 5 to an empty tree and delete 7 ***\n");
        treeterter.deleteNode(new Integer(7));
 
        System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8, 9]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
        
        //3
        casenum = 3;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Nasty test cases ***\n");
        System.out.println("*** delete 9 ***\n");
 
        treeterter.deleteNode(new Integer(9));
 
        System.out.println("The CORRECT display is: \n[0, 1, 2, 3, 4, 5, 6, 8]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
 
        //4
        casenum = 4;
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Nasty test cases ***\n");
        System.out.println("*** delete 3 ***\n");
 
        treeterter.deleteNode(new Integer(3));
 
        System.out.println("The CORRECT display is: \n[0, 1, 2, 4, 5, 6, 8]\n");
        System.out.println("The STUDENT's display is: \n" + treeterter.inOrder()+"\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
      }
      //Test Cases -- Old Group A
      //Part I and II
      else if (selection == 11)
      {
        treeterter = new LinkedBST();
        casenum = 1;  //used to increment the case number
        //Test Cases -- Group A       
        System.out.println("Test Group A\n\n");
                
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 5 to an empty tree ***\n");
        result = treeterter.addNode(new Integer(5));
 
        System.out.println("The CORRECT display is: \ntrue\n");
        System.out.println("The STUDENT's display is: \n" + result + "\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
        
        //2
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Adding 3, 4, 2, and 7 to the tree ***\n");
        if(treeterter.addNode(new Integer(3)))
          System.out.println("3 was successfully added.");
        if(treeterter.addNode(new Integer(4)))
          System.out.println("4 was successfully added.");
        if(treeterter.addNode(new Integer(2)))
          System.out.println("2 was successfully added.");
        if(treeterter.addNode(new Integer(7)))
          System.out.println("7 was successfully added.");
 
        System.out.println("\nCase " + casenum + ": If 3, 4, 2, and 7 were successfully added, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
        
        //3
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Displaying preOrder ***\n");
        answerTree = treeterter.preOrder();
 
        System.out.println("The CORRECT display is:   \t[5, 3, 2, 4, 7]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
        
        //4
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Displaying inOrder ***\n");
        answerTree = treeterter.inOrder();
 
        System.out.println("The CORRECT display is:   \t[2, 3, 4, 5, 7]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
 
        //5
        System.out.println("\nCASE " + casenum + ": ");
        System.out.println("*** Displaying postOrder ***\n");
        answerTree = treeterter.postOrder();
 
        System.out.println("The CORRECT display is:   \t[2, 4, 3, 7, 5]\n");
        System.out.println("The STUDENT's display is: \t" + answerTree + "\n");
 
        System.out.println("\nCase " + casenum + ": If the CORRECT display matches the STUDENT's display, "
                  + "give 1/1 point.\n\n");
        reader1.pause();
        casenum++;
 
      }
      else if (selection == 0)
      {
        //When done
        System.out.print("\nI hope that this has been a pleasant testing experience.\n");
        System.out.print("\nCongratulations on creating your first Binary Search Tree!\n");
        System.out.print("\nThis program will terminate when you ");
        reader1.pause();
        System.exit(0);
 
        
      }     
    }while (selection != 0);


    } else if(answer == 0){
       System.out.println("Thank you. Have a great day!");
       break;
    } else {
       System.out.println("Please enter a number in the given range.\n");
       continue;
    }
    }
  }
}