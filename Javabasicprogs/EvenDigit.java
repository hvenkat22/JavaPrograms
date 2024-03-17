package Start1;

public class EvenDigit {
	public static void main(String[] args) {
		for(int i=100;i<=400; i++) {
			if(evenDigits(i)) {
				if(i==400) {
					System.out.print(i);
				}else {
					System.out.print(i+", ");
				}
			}
		}
	}
	public static boolean evenDigits(int num) {
		while(num != 0) {
			int digit = num%10;
			if(digit%2!=0) {
				return false;
			}
			num/=10;
		}
		return true;
	}
}
