//Hari Venkataraman
//APMatrix.java
//Matrix Assignment


public class APMatrix {
  private int[][] matrixArr;
  public APMatrix(int r, int c, boolean enter){
    KeyboardReader reader = new KeyboardReader();
    if(enter){
      matrixArr = new int[r][c];//Initializes instance variable
      for(int i=0; i < r; i++){//For loop for the rows
        for(int j=0; j < c; j++){//For the columns
          int enterNum = reader.readInt("Enter the number you would like to enter in cell " + (i+1) + "," + (j+1) + ": ");//Reads in values to enter into the matrix.
          matrixArr[i][j] = enterNum;//Adds the values into the matrix Array.
           
        }
      }
    } else {
       matrixArr = new int[r][c];//If the boolean value is false, it creates an empty matrix of size r for rows and c for columns.
    }
  }
  public APMatrix(int[][] copyMe){
    matrixArr = new int[copyMe.length][copyMe[0].length];//Instance variable should be the same length as the array that's passed in.
    for(int i=0; i<copyMe.length; i++){
      for(int j=0; j<copyMe[0].length; j++){
        matrixArr[i][j] = copyMe[i][j];//Copies the values from copyMe into the private variable
      }
    }
  }

  public int getRows(){
    return matrixArr.length;//Returns the number of rows in the matrix.
  }

  public int getColumns(){
    return matrixArr[0].length;//Returns the number of columns in the matrix.
  }
 
  public String toString(){
    String result = "";//Creates a String that's empty space.
    if(this != null){
      for(int i=0; i<this.getRows(); i++){
      result+="\n";//Enter after each row is complete
      for(int j=0; j<this.getColumns(); j++){
        result += matrixArr[i][j] + "\t\t" ;//Concatenates the String with the values at the indexes and a tab for formatting.
      }
    }
    }
    
    return result;//Returns the String.
  }
  public int sumCross(int r, int c){
    int row = r--;
    int col = c--;
    int rowSum = 0;
    int colSum = 0;
    int totalSum = 0;
    int rowlength = matrixArr[0].length;
    int colLength = matrixArr.length;
    if((row) > matrixArr.length || (col) > matrixArr[0].length){
      System.out.println("The column number or row number is out of bounds.");
      return -1;
    } else {
       for(int i=0; i<rowlength; i++){
         rowSum+=matrixArr[row-1][i];
       }
       for(int j=0; j<colLength; j++){
         if(j == (row-1)){
           continue;
         }
         
         colSum+=matrixArr[j][col-1];
      }
      totalSum = rowSum + colSum;
    
    }
    
    return totalSum;
  }
  public APMatrix matrixMultiply(APMatrix m1){
     int r1 = this.getRows();
     int c1 = this.getColumns();
     int c2 = m1.getColumns();
     int[][] resultingMatrix = new int[r1][c2];  
     if(this.getColumns() != m1.getRows()){
       System.out.println("Error: The Matrices cannot be multiplied.");
     } else {
        for(int i=0; i<r1; i++){
          for(int j=0; j<c2; j++){
            for(int k=0; k<c1; k++){
              resultingMatrix[i][j]+=matrixArr[i][k]*m1.matrixArr[k][j];
            }
            
          }
        }
        return new APMatrix(resultingMatrix);
        }
        return null;
        
     }

    public APMatrix removeCross(int r, int c){
       int removeRow = r-1;
       int removeCol = c-1;
       int rows = this.getRows();
       int cols = this.getColumns();
       APMatrix newMatrix = new APMatrix(rows-1,cols-1,false);
       int[][] arr = newMatrix.matrixArr;
       int newRow = 0;
       for(int i=0; i< rows; i++){
         if(i == removeRow){
           continue;//Removed row won't be included.
         }
         int newCols = 0;
         for(int j = 0; j<cols; j++){
           if(j == removeCol){
             continue;//Removed Column won't be included.
           }
           arr[newRow][newCols] = matrixArr[i][j];//New Matrix after removing cross.
           newCols++;
         }
         newRow++;//
       }
       return new APMatrix(arr);//Returns the new Matrix.
     }
  }
