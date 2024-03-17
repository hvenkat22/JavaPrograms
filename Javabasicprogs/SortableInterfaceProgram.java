package Start1;
import java.util.Scanner;
interface Sortable{
	public void sort(int[] arr);
}
class BubbleSort implements Sortable{
	public void sort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
class SelectionSort implements Sortable {
	  public void sort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	      int minIndex = i;
	      for (int j = i + 1; j < n; j++) {
	        if (arr[j] < arr[minIndex]) {
	          minIndex = j;
	        }
	      }
	      int temp = arr[i];
	      arr[i] = arr[minIndex];
	      arr[minIndex] = temp;
	    }
	  }
}
public class SortableInterfaceProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of the array: ");
		n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		BubbleSort bbl = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		bbl.sort(arr);
		System.out.println("\nArray after Bubble Sort: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		ss.sort(arr);
		System.out.println("\nArray after Selection Sort: ");
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
	}
}
