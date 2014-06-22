package WhatsTheFrequency;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * What's The Frequency, Kenneth? - 499
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String in;
			while( (in = input.readLine()) != null){
				int[] lowerCase = new int[26];
				int[] upperCase = new int[26];

				char[] letters = in.toCharArray();
				for (int i = 0; i < letters.length; i++) {
					if(letters[i] < 91 && letters[i] > 64){
						upperCase[(letters[i] - 65)]++;
					}

					if(letters[i] < 123 && letters[i] > 96){
						lowerCase[(letters[i] - 97)]++;
					}
				}
				int biggerUp = bigger(upperCase);
				int biggerLow = bigger(lowerCase);

				if(biggerLow == biggerUp){
					for (int i = 0; i < upperCase.length; i++) {
						if(upperCase[i] == biggerUp){
							char aux = (char) (i + 65);
							out.append( aux );
						}						
					}
					for (int i = 0; i < upperCase.length; i++) {
						if(lowerCase[i] == biggerUp){
							char aux = (char) (i + 97);
							out.append( aux );
						}
					}
					out.append(" "+biggerUp + "\n");
				}else{
					if(biggerLow > biggerUp){
						for (int i = 0; i < upperCase.length; i++) {
							if(lowerCase[i] == biggerLow){
								char aux = (char) (i + 97);
								out.append( aux );
							}
						}
						out.append(" "+ biggerLow + "\n");
					}
					if (biggerUp > biggerLow) {
						for (int i = 0; i < upperCase.length; i++) {
							if(upperCase[i] == biggerUp){
								char aux = (char) (i + 65);
								out.append( aux );
							}
						}
						out.append(" "+ biggerUp + "\n");
					}
				}
			}	


		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(out.toString().trim());

	}

	private static int bigger(int[] array) {
		int big = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > big){
				big = array[i];
			}
		}
		return big;
	}

}
