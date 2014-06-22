import java.util.Scanner;

/**
 * Factorials!!!
 * @author Milena Araujo
 *
 */

public class p1083 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.next().length();
		
		int x = n;
		long result = 1;
		
		if(n%k == 0){
			
			while(x >= k){
				result *= x;
				x= x-k;
			}
		}else{
			while(x >= n%k){
				result *= x;
				x= x-k;
			}
		}
		System.out.println(result);
		
	}
}
