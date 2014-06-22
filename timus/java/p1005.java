import java.util.Scanner;

/**
 * Stone Pile
 * @author Milena Araujo
 *
 */

public class p1005 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stones = input.nextInt();

		int[] bricks = new int[stones]; 
		for (int i = 0; i < stones; i++) { 
			bricks[i] = input.nextInt(); 
		}
		
		// this algo is not mine !!
		final int lim = 1 << stones; 
		int min = Integer.MAX_VALUE; 
		// scanning through all possible ways of splitting, each is encoded in a single integer
		for (int i = 0; i < lim; i++) {
			// copying is done so that this value could be modified
			int k = i; 
			int sum1 = 0; 
			int sum2 = 0; 
			// here we are decoding the current splitting by analyzing the bits of the loop's counter
			for (int j = 0; j < stones; j++) { 
				// if the last bit is 1
				if ((k & 1) > 0) { 
					sum1 += bricks[j]; 
				}
				else { 
					sum2 += bricks[j]; 
				}
				// we move on to the next bit
				k >>= 1; 
			}
			min = Math.min(min, Math.abs(sum1 - sum2)); // is the solution we just found better?
		}
		System.out.println(min);

	}
}
