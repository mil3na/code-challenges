import java.util.Scanner;

/**
 * Chocolate 2
 * @author Milena Araujo
 *
 */

public class p1639 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		int t = m*n;
		
		if (t%2 ==0) {
			System.out.println("[:=[first]");
		}else{
			System.out.println("[second]=:]");
		}
	}
}
