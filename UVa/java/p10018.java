/**
 * 
 */
package ReverseAndAdd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Reverse and Add - 10018
 * 
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<String>();
		
		try{
			int qnts = Integer.parseInt(input.readLine());
			for (int i = 0; i < qnts; i++) {
				Integer number = Integer.parseInt(input.readLine());
				out.add(palindromeAndIterations(number));
			}
			
		}catch(Exception e){

		}
		
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));

		}
	}

	private static String palindromeAndIterations(Integer number) {
		int iterations =1;
		StringBuilder palindrome = new StringBuilder(number.toString());
		BigInteger num = new BigInteger(palindrome.toString());
		BigInteger aux = num.add(new BigInteger(palindrome.reverse().toString()));		
		palindrome = new StringBuilder(aux.toString());		

		while(!(palindrome.toString().equals(palindrome.reverse().toString()))){
			iterations++;
			aux = aux.add(new BigInteger(palindrome.toString()));			
			palindrome = new StringBuilder(aux.toString());
		}	
		
		return iterations+ " " + palindrome;
	}

}
