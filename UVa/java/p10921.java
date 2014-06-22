/**
 * 
 */
package FindTheTelephone;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Find The Telephone - 10921
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String in;
			while((in = input.readLine()) != null){
				char[] letters = in.toCharArray();
				for (int i = 0; i < letters.length; i++) {
					if(letters[i] == '0' || letters[i] == '1' || letters[i] == '-'){
						out.append(letters[i]);
						continue;
					}
					if(letters[i] == 'A' || letters[i] == 'B' || letters[i] == 'C'){
						out.append("2");
						continue;
					}
					if(letters[i] == 'D' || letters[i] == 'E' || letters[i] == 'F'){
						out.append("3");
						continue;
					}
					if(letters[i] == 'G' || letters[i] == 'H' || letters[i] == 'I'){
						out.append("4");
						continue;
					}
					if(letters[i] == 'J' || letters[i] == 'K' || letters[i] == 'L'){
						out.append("5");
						continue;
					}
					if(letters[i] == 'M' || letters[i] == 'N' || letters[i] == 'O'){
						out.append("6");
						continue;
					}
					if(letters[i] == 'P' || letters[i] == 'Q' || letters[i] == 'R' || letters[i] == 'S'){
						out.append("7");
						continue;
					}
					if(letters[i] == 'T' || letters[i] == 'U' || letters[i] == 'V'){
						out.append("8");
						continue;
					}
					if(letters[i] == 'W' || letters[i] == 'X' || letters[i] == 'Y' || letters[i] == 'Z'){
						out.append("9");
					}
				}
				out.append("\n");
			}
		}catch(Exception e){
			
		}		
		System.out.println(out.toString().trim());
	}
}
