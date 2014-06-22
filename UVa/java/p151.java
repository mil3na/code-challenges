/**
 * 
 */
package PowerCrisis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Power Crisis - 151
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int total;
			while(( total = Integer.parseInt(input.readLine())) !=  0){
				int answer = 1;
				while(!is13TheLast(answer, total)){
					answer++;					
				}
				out.append(answer + "\n");
			}
		}catch(Exception e){
			
		}

		System.out.println(out.toString().trim());
	}

	private static boolean is13TheLast(int answer, int total) {
		LinkedList<Integer> regions = makeList(total);
		ListIterator<Integer> it = regions.listIterator(0);
		while(regions.size() != 1){
			for(int i = 0; i< answer; i++){
				if(it.hasNext()){
					it.next();
				}else{
					it = regions.listIterator(0);
					i--;
				}				
			}
			it.remove();
		}
		
		if(regions.getFirst() == 13	){
			return true;
		}
		return false;
	}

	private static LinkedList<Integer> makeList(int total) {
		LinkedList<Integer> auxiliar = new LinkedList<Integer>();
		for(int i = 1; i< total; i++){
			auxiliar.add(i+1);
		}
		return auxiliar;
	}
}
