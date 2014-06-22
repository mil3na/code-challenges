/**
 * 
 */
package TeXQuotes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * TeX Quotes - 
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			String in;
			int quotes = 1;
			while( (in = input.readLine()) != null){
				char[] aux = in.toCharArray();
				for (int i = 0; i < aux.length; i++) {
					if(aux[i] == '\"'){
						if(quotes %2 ==0){
							out.append("''");
							quotes++;
						}else{
							out.append("``");
							quotes++;
						}
					}else{
						out.append(aux[i]);
					}
				}
				out.append("\n");
			}
			
		}catch(Exception e){
			
		}
		System.out.println(out.toString().trim());

	}

}
