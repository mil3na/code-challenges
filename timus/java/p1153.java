import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Supercomputer
 * @author Milena Araujo
 *
 */

public class p1153 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.next();
		BigInteger number = new BigInteger(n);
		
		number = number.multiply(new BigInteger("8"));
		number = number.add(new BigInteger("1"));
		number = bigSqrt(number.toString());
		number = number.subtract(new BigInteger("1"));
		number = number.divide(new BigInteger("2"));
		
//		double x = (-1 + Math.sqrt(1 + (8*n)))/2;
		
		
		System.out.println( number.toString());
	}
	
	private static BigInteger bigSqrt(String n){
		BigDecimal myNumber = new BigDecimal(n);
		int firsttime = 0;
		BigDecimal g = new BigDecimal("1");
		BigDecimal my2 = new BigDecimal("2");
		BigDecimal epsilon = new BigDecimal("0.0000000001");
 
		BigDecimal nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
 
		//Get the value of n/g 
		BigDecimal nBygPlusg = nByg.add(g);
 
		//Get the value of "n/g + g 
		BigDecimal nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
 
		//Get the value of (n/g + g)/2 
		BigDecimal  saveg = nBygPlusgHalf;
		firsttime = 99;
 
		do
		{
			g = nBygPlusgHalf;
			nByg = myNumber.divide(g, 9, BigDecimal.ROUND_FLOOR);
			nBygPlusg = nByg.add(g);
			nBygPlusgHalf =  nBygPlusg.divide(my2, 9, BigDecimal.ROUND_FLOOR);
			BigDecimal  savegdiff  = saveg.subtract(nBygPlusgHalf);
 
			if (savegdiff.compareTo(epsilon) == -1 )
			{
			    firsttime = 0;
			}
			else
			{
			    saveg = nBygPlusgHalf;
			}
 
		} while (firsttime > 1);
		return saveg.toBigInteger();
	}

}
