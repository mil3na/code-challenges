/**
 * 
 */
package ILoveBigNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * I Love Big Numbers ! - 10220
 * @author Milena Arujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String in;
			while( (in = input.readLine()) != null){
					out.append(sum(fatorial(in).toCharArray()) + "\n");
				}	
				
			
		}catch(Exception e){
			
		}
		System.out.println(out.toString().trim());

	}

	private static int sum(char[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i] - 48;
		}
		return sum;
	}

	private static String fatorial(String numberS) {
		BigInteger number = new BigInteger("1");
		int num = Integer.parseInt(numberS);
		for (int i = 2; i <= num; i++) {
			String aux = new Integer(i).toString();
			number = number.multiply(new BigInteger(aux));
		}
		return number.toString();
	}

}
