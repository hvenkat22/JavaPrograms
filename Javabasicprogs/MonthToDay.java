package Start1;
import java.util.Scanner;
public class MonthToDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month;
		int days=0;
		System.out.println("Enter month name: ");
		month=sc.next();
		switch(month) {
			case "January":
				days=31;
				break;
			case "February":
				days=59;
				break;
			case "March":
				days=90;
				break;
			case "April":
				days=120;
				break;
			case "May":
				days=151;
				break;
			case "June":
				days=181;
				break;
			case "July":
				days=212;
				break;
			case "August":
				days=243;
				break;
			case "September":
				days=273;
				break;
			case "October":
				days=304;
				break;
			case "November":
				days=334;
				break;
			case "December":
				days=365;
				break;
			default:
				days=-1;
				break;
		}
		if(days==-1) {
			System.out.println("\nInvalid Month name...");
		}else {
			System.out.println("\nEntered month name to days: "+days);
		}
	}
}
