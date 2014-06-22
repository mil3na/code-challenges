/**
 * 
 */
package EcologicalPremium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ecological Premium - 10300
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int qnts = Integer.parseInt(input.readLine());
			for (int i = 0; i < qnts; i++) {
				int sum = 0;
				int farmers = Integer.parseInt(input.readLine());
				for (int j = 0; j < farmers; j++) {
					String[] in = input.readLine().split(" ");
					sum += (Integer.parseInt(in[0]) * Integer.parseInt(in[2]));
					
				}
				out.append(sum + "\n");
			}
			
		}catch(Exception e){
			
		}
		System.out.println(out.toString().trim());
	}
}
