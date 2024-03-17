//Hari Venkataraman
//Arrays practice programs
//Arrays Assignment

class Main {
  static int min = 0;
  static int max = 0;
  static int firstHighest = 0;
  static int secondHighest = 0;
  static int thirdHighest = 0;
  static int smallest = 0;
  static int smallest2 = 0;
  static int count2 = 0;
  static double sum2 = 0;
  static double max2 = 0;
  static String position4;//These are all initialized variables that will be useful and accessible throughout the program

  public static void main(String[] args) {
    KeyboardReader reader = new KeyboardReader();
    while(true){
        int result = reader
        .readInt("Enter 1 to run the maxMinAvg program, 2 to run the highValues program, and 3 to run the bonus: ");
    if (result == 1) {
      maxMinAvg();// basic looping menu to run the methods below
      continue;
    } else if (result == 2) {
      highValues();
      continue;
    } else if (result == 3) {
      arraysAssignmentBonus();
      continue;
    }
    }
    
  }

  public static void maxMinAvg(){
    double sum = 0;
    int count = 0;
    double avg = 0;
    KeyboardReader reader = new KeyboardReader();
    int[] store = new int[10];//initializing an array of size 10
    for(int i=0; i<store.length; i++){
      count++;//this is here to calculate average
      int num = reader.readInt("Enter number " + count + ":   ");
      store[i]=num;//10 values stored in the array
    }
    max = store[0];
    min = store[0];
    count = 0;
    for(int i=0; i<store.length; i++){
      count++;
       sum = sum+store[i];//Adds consecutive numbers to calculate the sum
       
       if(store[i] < min){
         min = store[i];//sorting through values in the array for minimum
       }
       if(store[i] > max){
         max = store[i];//sorting for maximum
       }
     }
     avg = sum/count;
     System.out.println("The maximum of the entered values is: " + max);
     System.out.println("The minimum of the entered values is: " + min);
     System.out.println("The average(mean) of the entered values is: " + avg);//Prints out the results
     for(int i=0; i<store.length; i++){
       System.out.print(store[i] + " ");
     }
     
  }

  public static void highValues() {
    int count3 = 0;
    KeyboardReader reader = new KeyboardReader();
    int input = reader.readInt("How many numbers would you like to enter? ");
    int[] arr = new int[input];//initializing array depending on the input
    for(int i=0; i<input; i++){
      count3++;
      int num2 = reader.readInt("Enter value " + count3 + ":  ");
      arr[i] = num2;//adds the values of num2 into the array
      }
      firstHighest = arr[1];//constant value to find the first highest 
      int position1 = 0;//Used to find the sequence at wich the number was the greatest
    for(int i=0; i<arr.length; i++){
      if(arr[i] > firstHighest){
        firstHighest = arr[i];//sets the first highest equal to the corresponding maximum
        position1 = i+1;//Sets position1 to the corresponding Sequence #. Arrays start at 0 so that's the reason for the addition of 1
      } 
    }
    smallest = arr[1];//Sets smallest equal to the value associated with the index of 0
    for(int i=0; i<arr.length; i++){
      if(arr[i] < smallest){
         smallest = arr[i];//initialization  of smallest number in array given by user
      }
    }
    secondHighest = smallest;//Sets the second highest equal to the smallest number
    int position2 = 0;
    for(int i=0; i<arr.length; i++){
       if(arr[i] > secondHighest && arr[i] < firstHighest){//second highest number must be lower than the first highest
         secondHighest = arr[i];//second highest number would be equal to that corresponding value at that index
         position2 = i+1;
       }
    }
    int position3 = 0;//Used to find the sequence number of the highest numbers
    smallest2 = arr[1];
    for(int i=0; i<arr.length; i++) {
      if(arr[i] < smallest2){
        smallest2 = arr[i];//Repeats the process for the initialization of smallest
        position3 =i+1;
      }
    }
    if(arr.length == 3){
      thirdHighest = smallest2;
    }
    thirdHighest = smallest2;
    
    if(arr.length > 3){
       for(int i=0; i<arr.length; i++){
        if(arr[i]==firstHighest || arr[i] == secondHighest){
          continue;
        }
      else {
        if(arr[i] > thirdHighest && arr[i] < secondHighest){//The third highest must be lower than the second highest
        thirdHighest = arr[i];
        position3 = i+1;//Arrays are from 0 so the addition of 1 converts to actual starting
        
      }
      }
    }
    } 
     
    
      for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");//Prints out all the values in the order they were entered
      }
      
      System.out.println("\nThere were a total of " + input + " numbers entered");
      System.out.println("The highest number was in sequence #" + position1);
      System.out.println("The second highest number was in sequence #" + position2);
      System.out.println("The third highest number was in sequence #" + position3);//Prints out the results
  }

  public static void arraysAssignmentBonus() {
    KeyboardReader reader = new KeyboardReader();
    String[] str = new String[40];//This array's here to read in the names 
    int[] arr = new int[40];//This array's here to read in the grades
    for(int i=0; i<str.length; i++) {
      count2++;//Used to calculate average
      String names = reader.readLine("Enter name " + count2 + " or enter zzz as the name or -999 as the grade when you're finished: ");//Reads in the names with a Sentinel mentioned in the statement
      
      if(names.equalsIgnoreCase("zzz")){
        count2--;//Decrements the count so it won't be counted in average since "zzz" is a Sentinel
        break;
      }
      int num3 = reader.readInt("Enter grade " + count2 + ": ");//Reads in the names
      
      
      if(num3 == -999){
        count2--;//Also Decrements count so the -999 won't be counted in average
        break;
      }
      str[i] = names;//Adds the names into the String array
      sum2 = sum2+num3;//Adds consecutive numbers to find sum
      arr[i]=num3;//Adds the grades into the Int array initialized up top.
      if(arr[i] > max2){
        max2 = arr[i];//Tests the condition for consecutive values and the greatest of the numbers will be printed
        position4 = str[i];//The specific name in the array that will get the stars around their name
        //highestGrdadeIndex = i;
      }
      
    }
    double avg2 = sum2/count2;//Calculation of average
    for(int i=0; i<arr.length; i++){
      if(arr[i] == max2){//For the printing
        System.out.println("Name: " + "*" + str[i] + "*" + "\tGrade: " + arr[i]);//Prints the stars for the person(s) with highest grade
      } else if(str[i]!=null){
         System.out.println("Name: " + str[i] + "\t\tGrade: " + arr[i]);
         //If user enters less than 40 inputs then the rest would be null so the nulls would be removed after this line is executed
      }
      
    }
    System.out.println("\nDifference between mean score and highest score: " + (max2 - avg2));//Prints the difference between the mean grade and the highest grade 
  }
}