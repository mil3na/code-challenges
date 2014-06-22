/**
 * 
 */
package SkewBinary;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Skew Binary - 575
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String num;
			while(!(num = input.readLine()).equals("0")){
				char[] numbers = num.toCharArray();
				long sum = 0;
				int k = numbers.length;
				for (int i = 0; i < numbers.length ; i++) {
					sum += (Math.pow(2, (k)) -1) * (numbers[i] - 48);
					k--;
				}
				out.append(sum + "\n");
			}

		}catch(Exception e){

		}
		System.out.println(out.toString().trim());
	}
}


