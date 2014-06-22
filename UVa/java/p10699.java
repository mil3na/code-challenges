/**
 * 
 */
package CountTheFactors;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Count The Factors - 10699
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			Integer n;
			while(( n = Integer.parseInt(input.readLine())) !=  0){
				Integer num = n;
				int qnts = 1;
				Integer lastPrime = 2;
				if (num % 2 == 0) {
					qnts++;
				}

				while( !(new BigInteger(num.toString()).isProbablePrime(20)) ){
					if(num % lastPrime == 0){
						num = num/lastPrime;
					}else{
						lastPrime = nextDiv(num, lastPrime);
						qnts++;
						num = num/lastPrime;
					}
				}					

				out.append(n +" : " + qnts + "\n");
			}
		}catch(Exception e){

		}

		System.out.println(out.toString().trim());
	}

	private static Integer nextDiv(Integer num, Integer lastPrime) {
		Integer aux = lastPrime;
		while(num % aux != 0 && aux < num){
			aux = new BigInteger(aux.toString()).nextProbablePrime().intValue();
		}
		return aux;
	}

}
