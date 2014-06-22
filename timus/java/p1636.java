import java.util.Scanner;

/**
 * Penalty Time
 * @author Milena Araujo
 *
 */

public class p1636 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t1 = input.nextInt();
		int t2 = input.nextInt();
		
		for (int i = 0; i < 10; i++) {
			t2 -= input.nextInt() *20;
		}
		
		if(t1 <= t2){
			System.out.println("No chance.");
		}else{
			System.out.println("Dirty debug :(");
		}
	}
}
