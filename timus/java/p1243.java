import java.math.BigInteger;
import java.util.Scanner;

public class p1243 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String num = input.next();
		String sete = "7";
		
		System.out.println(new BigInteger(num).mod(new BigInteger(sete)));
	}
}
