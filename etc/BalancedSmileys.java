import java.util.Scanner;

/**
 * 
 * @author Milena Araujo
 *
 */


public class BalancedSmileys {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int times = Integer.parseInt(input.nextLine());

		int smilies;
		int open;
		int closed;

		for (int i = 0; i < times; i++) {

			char[] letters = input.nextLine().toCharArray();
			
			smilies =0;
			for (int j = 0; j < letters.length; j++) {
				if(letters[j] == ':' && j < letters.length-1){
					if (letters[j+1] == '(' || letters[j+1] ==')') {
						smilies++;
					}
					
				}
			}
			
			open =0;
			closed =0;
			for (int j = 0; j < letters.length; j++) {
				if(letters[j] == '('){
					open++;
				}
				if(letters[j] == ')'){
					closed++;
				}
			}
			
			System.out.println(smilies+" "+open+" "+closed);
			
//			System.out.println("Case #"+(i+1)+": "+outcome);

		}

	}

}
