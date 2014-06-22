import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Flat Spots
 * @author Milena Araujo
 *
 */

public class p1617 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			ar.add(input.nextInt());
		}
		
		Collections.sort(ar);
		
		int num = ar.get(0);
		int cicle = 1;
		int cars = 0;
		for (int i = 1; i < n; i++) {
			if(ar.get(i) == num){
				cicle++;
				if(cicle == 4){
					cicle = 0;
					cars++;
				}
			}else{
				num = ar.get(i);
				cicle = 1;
			}
			
		}
		
		System.out.println(cars);
	}
	
}
