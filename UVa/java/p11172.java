/**
 * 
 */
package RelationalOperators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Relational Operators - 11172
 * @author Milena Araujo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int qnts = Integer.parseInt(input.readLine());
			for (int i = 0; i < qnts; i++) {
				String[] in = input.readLine().split(" ");
				long a = Long.parseLong(in[0]);
				long b = Long.parseLong(in[1]);
				if(a > b){
					out.append(">\n");
				}
				if(a < b){
					out.append("<\n");
				}
				if(a == b){
					out.append("=\n");
				}
			}
			

		}catch(Exception e){

		}
		System.out.println(out.toString().trim());
	}
}
