/**
 * 
 */
package AllInAll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * All in All - 10340
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<String>();

		while(true){
			try{
				String aux;
				while((aux = input.readLine()) != null){
					String[] frase = aux.split("\\s");
					char[] sub = frase[0].toCharArray();
					char[] sequence = frase[1].toCharArray();
					List<Character> chars = new ArrayList<Character>();
					for (int i = 0; i < sequence.length; i++) {
						chars.add(sequence[i]);
					}

					int size =0;
					int pos = 0;
					for (int i = 0; i < sub.length; i++) {
						for (int j = pos; j < chars.size(); j++) {
							if(sub[i] == chars.get(j)){
								size++;
								pos=j;
								chars.remove(j);
								break;
							}
						}
					}

					if(size == sub.length){
						out.add("Yes");
					}else{
						out.add("No");
					}
				}
				break;
			}catch(Exception e){

			}		
		}

		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));

		}
	}
}
