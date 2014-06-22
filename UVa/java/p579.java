/**
 * 
 */
package ClockHands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Clock Hands - 579
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));		
		List<String> out = new ArrayList<String>();
		
		try{
			String read;
			while(!(read = input.readLine()).equals("0:00")){
				String[] time = read.split(":");
				int hour = Integer.parseInt(time[0]);
				int minutes = Integer.parseInt(time[1]);
				
				int hourDegree = hour * 30;
				double minutesDegree = minutes * 5.5;
								
				double result = Math.abs(hourDegree - minutesDegree);
				
				//Para pegar o menor ângulo.
				if(result > 180){
					result = 360 - result;
				}

				DecimalFormat decimal = new DecimalFormat("0.000");
				out.add(decimal.format(result));
			}
			
		}catch(Exception e){
			
		}
		
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));

		}
	}
}
