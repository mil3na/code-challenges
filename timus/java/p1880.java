import java.util.ArrayList;
import java.util.Scanner;

/**
 * Psych Up's Eigenvalues
 * @author Milena Araujo
 *
 */

public class p1880 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Long> numbers1 = new ArrayList<Long>();
		ArrayList<Long> numbers2 = new ArrayList<Long>();
		ArrayList<Long> numbers3 = new ArrayList<Long>();

		int result = 0;
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			numbers1.add(input.nextLong());
		}
		
		num = input.nextInt();
		for (int i = 0; i < num; i++) {
			numbers2.add(input.nextLong());
		}
		
		num = input.nextInt();
		for (int i = 0; i < num; i++) {
			numbers3.add(input.nextLong());
		}
		
		long temp = 0;
		for (int i = 0; i < num; i++) {
			temp = numbers3.get(i);
			if(numbers2.contains(temp) && numbers1.contains(temp)){
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}
