

import java.util.Scanner;

/**
 * Taxi - 1607
 * @author Milena Araujo
 *
 */

public class p1607{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pFirst = input.nextInt();
		int pRaise = input.nextInt();
		int tFirst = input.nextInt();
		int tRaise = input.nextInt();

		int petr = pFirst;
		int taxi = tFirst;
		
		
		while (taxi - petr > pRaise) {
			taxi -= tRaise;
			petr += pRaise;
		}

		int best = petr;
		
		if(petr < taxi){
			best = taxi;
		}
	
		System.out.println(best);
	}

}
