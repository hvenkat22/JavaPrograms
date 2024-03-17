package Start1;

import java.util.Scanner;
class sumofarray {
  public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<size; i++){
      arr[i]=sc.nextInt();
    }
    for(int j=0; j<size; j++){
      sum+=arr[j];
    }
    System.out.println("The sum of the elements in the array is: "+sum);
  }
}