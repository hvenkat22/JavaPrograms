package Start1;
import java.util.Scanner;
class basic2 {
  static void reverse(int arr[], int n){
    int[] arr2 = new int[n];
    int k=n;
    for(int i=0; i<n; i++){
      arr2[k-1]=arr[i];
      k-=1;
    }
    for(int j=0; j<n; j++){
      System.out.print(arr2[j]+" ");
    }
  }
  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("\nEnter the elements: ");
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("\nThe reverse of the entered array is: ");
    reverse(arr,n);
  }
}