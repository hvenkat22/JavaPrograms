package Start1;
import bSort.Bubble;
import selSort.Selection;
import java.util.Scanner;

public class SelectionandBubbleSortPackageRun {
	public static void main(String[] args) {
		Bubble b1 = new Bubble();
		Selection s1 = new Selection();
		Scanner sc = new Scanner(System.in);
		int[] arr1= {23,67,21,3,2,9,90,103,1,-4,73};
		int[] arr2= {40,55,63,17,22,68,89,97,89,34};
		b1.bubble_sort(arr1);
		s1.selection_sort(arr2);
		System.out.println("The first array after Bubble Sort: ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println("\nThe second array after Selection Sort: ");
		for(int e:arr2) {
			System.out.print(e+" ");
		}
	}
}
