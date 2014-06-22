/**
 * 
 */
package WordScramble;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Word Scramble - 483
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		try{
			String in;
			while((in= input.readLine()) != null){
				String[] words = in.split(" ");
				String aux = "";
				for (int i = 0; i < words.length; i++) {
					aux += (new StringBuilder(words[i]).reverse() + " ");
				}
				out.append(aux.trim() + "\n");
			}
				
		}catch(Exception e){
			
		}
		out.delete(out.lastIndexOf("\n"), out.lastIndexOf("\n") +1);
		System.out.println(out);
	}
}
