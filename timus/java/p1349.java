import java.util.Scanner;

/**
 * Farm
 * Teorema de Fermat ! :P
 * @author Milena Araujo
 *
 */

public class p1349 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		
		if(in ==1){
			System.out.println("1 2 3");
		}else{
			if(in == 2){
				System.out.println("3 4 5");
			}else{
				System.out.println(-1);
			}
		}
	}
}
