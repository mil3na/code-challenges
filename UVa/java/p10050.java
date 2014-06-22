/**
 * 
 */
package Hartals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hartals - 10050
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int tests = Integer.parseInt(input.readLine());
			for (int i = 0; i < tests; i++) {
				int days = Integer.parseInt(input.readLine());
				
				
				List<Integer> fridays = makeDay(days,6);
				List<Integer> saturdays = makeDay(days, 7);
				List<Integer> done = new ArrayList<Integer>();
				
				
				int ppl = Integer.parseInt(input.readLine());
				int sum = 0;
				for (int j = 0; j < ppl; j++) {
					int h = Integer.parseInt(input.readLine());

					for (int k = 1; k <= days; k++) {
						if(k % h ==0){
							if(!fridays.contains(k) && !saturdays.contains(k)){
								if(!done.contains(k)){
									sum++;
									done.add(k);
								}								
							}
						}
					}
					
				}
				out.append(sum + "\n");
				
			}
			
			
		}catch(Exception e){
			
		}
		System.out.println(out.toString().trim());
	}

	private static List<Integer> makeDay(int days, int day) {
		List<Integer> aux = new ArrayList<Integer>();
		int num = day;
		while(num <= days){
			aux.add(num);
			num +=7;
		}
		return aux;
	}
}
