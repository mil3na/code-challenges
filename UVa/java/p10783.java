package OddSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Odd Sum - 10783
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int in = Integer.parseInt(input.readLine());
			for (int i = 0; i < in; i++) {
				int first = Integer.parseInt(input.readLine());
				int second = Integer.parseInt(input.readLine());
				int sum = 0;
				for (int j = first; j <= second; j++) {
					if(j%2 == 1){
						sum+=j;
					}
				}
				out.append("Case "+ (i+1) + ": "+ sum + "\n");
			}

		}catch(Exception e){

		}
		System.out.println(out.toString().trim());
	}
}
