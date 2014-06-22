/**
 * 
 */
package AboveAverage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Above Average - 10370
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		try{
			int classes = Integer.parseInt(input.readLine());
			for (int i = 0; i < classes; i++) {
				String ins = input.readLine();
				int ppl = Integer.parseInt(ins.split(" ")[0]);
				while(ppl != ins.split(" ").length -1){
					ins  += input.readLine();
				}
				String[] alumns = ins.split(" ");

				double average = 0;
				for (int j = 1; j < alumns.length ; j++) {
					average += Integer.parseInt(alumns[j]);

				}
				average = average / ppl;
				double qnts = 0;
				for (int j = 1; j < alumns.length; j++) {
					if(Integer.parseInt(alumns[j]) > average){
						qnts++;
					}
				}
				double percentage = (qnts /ppl) *100;
				DecimalFormat decimal = new DecimalFormat("0.000");
				out.append(decimal.format(percentage) + "%\n");
			}



		}catch(Exception e){

		}
		System.out.println(out.toString().trim());
	}
}
