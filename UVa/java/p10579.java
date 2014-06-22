package Fibonaccinumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Fibanacci Numbers - 10579
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String in;
			while ((in = input.readLine()) != null) {
				out.append(fibonacci(Integer.parseInt(in)) + "\n");
			}
		}catch(Exception e){

		}

		System.out.println(out.toString().trim());

	}

	private static String fibonacci (int n){
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");

		if(n == 0){
			return "0";
		}else{
			for (int i = 0; i < n; i++) {
				b = b.add(a);
				a = b.subtract(a);
			}
		}		
		return a.toString();		
   }
}
