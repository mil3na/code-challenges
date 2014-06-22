import java.util.Scanner;

/**
 * Bicycle Codes
 * @author Milena Araujo
 *
 */

public class p1877 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lock1 = input.nextInt();
		int lock2 = input.nextInt();
		
		if(lock1%2 == 0 || lock2%2 == 1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}
}
