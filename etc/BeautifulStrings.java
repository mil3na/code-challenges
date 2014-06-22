import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;


/**
 * 
 * @author Milena Araujo
 *
 */

public class BeautifulStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int times = Integer.parseInt(input.nextLine());

		int maxValue;
		int outcome;

		for (int i = 0; i < times; i++) {

			char[] letters = input.nextLine().toLowerCase().toCharArray();
			
			Hashtable<Character, Integer> test = new Hashtable<Character, Integer>(26);
			
			for (int j = 0; j < letters.length; j++) {
				if(letters[j] >96 && letters[j] <123){
					if(test.containsKey(letters[j])){
						test.put(letters[j], test.get(letters[j])+1);
					}else{
						test.put(letters[j], 1);
					}
					
				}
			}
			List<Integer> list = Collections.list(test.elements());
	        Collections.sort(list, Collections.reverseOrder());
	        
			maxValue = 26;
			outcome = 0;

	        for (Integer x : list) {
				outcome += x*maxValue;
				maxValue--;
			}

			System.out.println("Case #"+(i+1)+": "+outcome);

		}

	}

}
