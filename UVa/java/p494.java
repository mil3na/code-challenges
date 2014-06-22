package KindergartenCountingGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Kindergarten Counting Game - 494
 * @author Milena Araujo
 *
 */
class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> out = new ArrayList<Integer>();


		while(true){
			try{
				String aux;
				while((aux = reader.readLine()) != null){
					int count = 0;
					String teste = aux.replaceAll("[\\d[\\W]]", " ").replaceAll("(\\s\\s*)", " ");
					String[] tokens = teste.split("\\s");
					for (int i = 0; i < tokens.length; i++) {
						if(Main.isValidWord(tokens[i])){
							count++;
						}
					}
					out.add(count);
				}
				break;
			}catch(Exception e){
				break;
			}
		}

		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}
		System.exit(0);
	}

	static boolean isValidWord(String word) {
		char[] aux = word.toCharArray();
		int counter = 0;
		for (int i = 0; i < aux.length; i++) {
			if(Character.isLetter(aux[i])){
				counter++;
			}
		}
		if(counter > 0){
			return true;
		}
		return false;
	}
}