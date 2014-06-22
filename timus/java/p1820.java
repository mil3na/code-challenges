import java.util.Scanner;

/**
 * Ural Steaks
 * @author Milena Araujo
 *
 */

public class p1820 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int steaks = input.nextInt();
		int fit = input.nextInt();
		
		steaks *= 2;
		if (steaks == 2){
			System.out.println("2");
		}else{
			if(steaks % fit == 0){
				System.out.println(steaks/fit);
			}else{
				System.out.println(steaks/fit+1);
			}
		}		
		
	}
}
