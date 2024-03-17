//Hari Venkataraman

class Main {
  public static void main(String[] args) {

    KeyboardReader reader = new KeyboardReader();

    String[] names = {"Rita", "Himank", "Ben", "Max", "Yubin", "Alex",
    "Alex", "Minji", "Tamar", "Sneha", "Rohan", "Andrew", "Vincent", "Pranav", 
    "Grace", "Joy", "Joy", "Joy", "Zach", "Hugh", "Trevor", "Angel", "Nick", "Nick"};

    int[][] values = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,69}};

   
     int count = 0;
     String name  =  reader.readLine("Enter a name: ");
     for(String val: names){
       if(val.equals(name)){
         count++;
       }
     }
     System.out.println("That name was found "  + count + " times in the array.");
    

    for(int[] row: values){
      for(int val: row){
        System.out.print(val + "\t");
      }
      System.out.println();
    }

    
   }
}