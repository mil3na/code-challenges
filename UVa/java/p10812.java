package BeatTheSpread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Beat the Spread - 10812
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		try{
			int qnts = Integer.parseInt(input.readLine());
			for (int i = 0; i < qnts; i++) {
				String[] nums = input.readLine().split("\\s");
				int sum = Integer.parseInt(nums[0]);
				int diff = Integer.parseInt(nums[1]);
				
				if( diff > sum || ((sum + diff) % 2 == 1) || ((sum - diff) % 2 == 1)){
					out.append("impossible\n");
				}else{
					int num1 =( sum + diff ) / 2;
					int num2 = ( sum - diff ) / 2;
					
					if(num1 > num2){
						out.append(num1 + " " + num2 + "\n");
					}else{
						out.append(num2 + " " + num1 + "\n");
					}					
				}
			}
				
		}catch(Exception e){
			
		}
		out.delete(out.lastIndexOf("\n"), out.lastIndexOf("\n") +1);
		System.out.println(out);
	}
}
