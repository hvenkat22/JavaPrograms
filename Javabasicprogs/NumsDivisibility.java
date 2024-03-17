package Start1;
public class NumsDivisibility {
	public static void main(String[] args) {
		System.out.println("The numbers divisible by 8 and a multiple of 5 are: \n");
		for(int i=1000; i<=2000; i++) {
			if(i%8==0 && i%5==0) {
				if(i!=2000) {
					System.out.print(i+", ");
				}else {
					System.out.print(i);
				}
			}
		}
	}
}
