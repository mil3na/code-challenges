import java.util.Scanner;

/**
 * Turn for MEGA
 * @author Milena Araujo
 *
 */

public class p1787 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int carsMax = input.nextInt();
		int minutes = input.nextInt();
		int total = 0;
		
		for (int i = 0; i < minutes; i++) {
			total += carsMax - input.nextInt();
			if(total >= 0){
				total = 0;
			}
		}
		
		System.out.println(Math.abs(total));
		
	}
}
