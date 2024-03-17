//Hari Venkataraman 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    char[][] board = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};
    System.out.println("Player 1: X");
    System.out.println("Player 2: O");
    char winner = 'Z';
    int pos1 = 0;
    int pos2 = 0;
    int count = 0;
    char[] filled = new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    while(winner == 'Z'){
      while(true){
         System.out.println("\nPlayer X. Where would you like to enter X (1-9 to play or enter 0 to exit)? ");
         
         pos1 = read.nextInt();
         if(filled[pos1] != ' '){
           System.out.println("Enter in a different position.");
           continue;
         } else {
           count++;
           if(count == 9){
             System.out.println("It's a tie!");
             return;
           }
           break;
         }
      }
      playGame(board, 'X', pos1);
      filled[pos1] = 'X';
      winner = getWinner(board);
      if(winner == 'X' || winner == 'O'){
         System.out.println("Player " + getWinner(board) + " wins!"); 
         break;
      }
      while(true){
         System.out.println("\nPlayer O. Where would you like to enter O (1-9 to play or enter 0 to exit)? ");
         
         pos2 = read.nextInt();
         if(filled[pos2] != ' '){
           System.out.println("Enter in a different position.");
           continue;
         } else {
           count++;
           if(count == 9){
             playGame(board, 'X', pos1);
             System.out.println("It's a tie!");
             return;
           }
           break;
         }
      }
      
      playGame(board, 'O', pos2);
      filled[pos2] = 'O';
      winner = getWinner(board);
      if(winner == 'X' || winner == 'O'){
         System.out.println("Player " + getWinner(board) + " wins!"); 
         break;
      }
    }
    
    
}
public static void printBoard(char[][] playBoard){
  for(char[] row : playBoard){
      for(char c : row){
         System.out.print(c);
      }
      System.out.println();
  
    }
}
public static void playGame(char[][] gameBoard, char player, int position1){
    switch(position1){
      case 1:
        gameBoard[0][0] = player;
        break;
      case 2:
        gameBoard[0][2] = player;
        break;
      case 3:
        gameBoard[0][4] = player;
        break;
      case 4:
        gameBoard[2][0] = player;
        break;
      case 5:
        gameBoard[2][2] = player;
        break;
      case 6:
        gameBoard[2][4] = player;
        break;
      case 7:
        gameBoard[4][0] = player;
        break;
      case 8:
        gameBoard[4][2] = player;
        break;
      case 9:
        gameBoard[4][4] = player;
        break;
      case 0:
        System.out.println("Thanks for playing.");
        break;
      default:
        System.out.println("Please enter a number 1-9 or 0 to exit.");
        break;
    } 
   printBoard(gameBoard);
  }
  public static char getWinner(char[][] ticBoard){
    if((ticBoard[0][0] == ticBoard[0][2]) &&(ticBoard[0][0] == ticBoard[0][4]) && (ticBoard[0][2] == ticBoard[0][4]) && (ticBoard[0][4] != ' ')){
        return ticBoard[0][0];//Returns the winner at that position
    }
    if((ticBoard[2][0] == ticBoard[2][2]) && (ticBoard[2][0] == ticBoard[2][4]) && (ticBoard[2][2] == ticBoard[2][4]) && (ticBoard[2][4] != ' ')){
      return ticBoard[2][0];
    }
    if((ticBoard[4][0] == ticBoard[4][2]) && (ticBoard[4][0] == ticBoard[4][4]) && (ticBoard[4][2] == ticBoard[4][4]) && (ticBoard[4][4] != ' ')){
      return ticBoard[4][0];
    }
    if((ticBoard[0][0] == ticBoard[2][2]) && (ticBoard[0][0] == ticBoard[4][4]) && (ticBoard[2][2] == ticBoard[4][4]) &&(ticBoard[4][4] != ' ')){
      return ticBoard[0][0];
    }
    if((ticBoard[0][4] == ticBoard[2][2]) && (ticBoard[0][4] == ticBoard[4][0]) && (ticBoard[2][2] == ticBoard[4][0]) && (ticBoard[4][0] != ' ')){
      return ticBoard[0][4];
    }
    if((ticBoard[0][0] == ticBoard[2][0]) && (ticBoard[0][0] == ticBoard[4][0]) && (ticBoard[2][0] == ticBoard[4][0]) && (ticBoard[4][0] != ' ')){
      return ticBoard[0][0];
    }
    if((ticBoard[0][2] == ticBoard[2][2]) && (ticBoard[0][2] == ticBoard[4][2]) && (ticBoard[2][2] == ticBoard[4][2]) && (ticBoard[4][2] != ' ')){
      return ticBoard[0][2];
    }
    if((ticBoard[0][4] == ticBoard[2][4]) && (ticBoard[0][4] == ticBoard[4][4]) && (ticBoard[2][4] == ticBoard[4][4]) && (ticBoard[4][4] != ' ')){
      return ticBoard[0][4];
    }

    return 'Z';
  }
}