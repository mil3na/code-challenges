/**
 * 
 */
package CamelTrading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Camel Trading - 10700
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<String>();

		try{
			int qnts = Integer.parseInt(input.readLine());
			for (int i = 0; i < qnts; i++) {
				String expression = input.readLine();
				String[] numbers = expression.split("(\\+|\\*)");
				List<String> exp = new ArrayList<String>();
				int pos = 0;
				for (int j = 0; j < numbers.length; j++) {
					exp.add(numbers[j]);
					if(numbers[j].length() == 1){
						pos++;
						if(pos + j < expression.length()-1){
							exp.add(expression.substring(pos+j,pos+j+1));
						}						
					}else{
						pos +=2;
						if(pos + j < expression.length()-1){
							exp.add(expression.substring(pos+j,pos+j+1));
						}
					}					
				}

				out.add("The maximum and minimum are "+ maximum(exp)+ " and " + minimum(exp) + ".");			
			}

		}catch(Exception e){
			System.out.println(e.fillInStackTrace());
		}
		
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}

	}

	private static long minimum(List<String> expression) {
		List<String> aux = new ArrayList<String>();
		aux.addAll(expression);

		while(aux.contains("*")){
			int pos = aux.indexOf("*");
			Long newNumber = Long.parseLong(aux.get(pos-1)) * Long.parseLong(aux.get(pos+1));
			aux.remove(pos-1);
			aux.remove(pos-1);
			aux.remove(pos-1);
			aux.add(pos-1, newNumber.toString());
		}
		long out =0;
		for (int i = 0; i < aux.size(); i++) {
			if(!aux.get(i).equals("+")){
				out += Long.parseLong(aux.get(i));
			}
		}
		return out;
	}


	private static long maximum(List<String> expression) {
		List<String> aux = new ArrayList<String>();
		aux.addAll(expression);
		
		while(aux.contains("+")){
			int pos = aux.indexOf("+");
			Integer newNumber = Integer.parseInt(aux.get(pos-1)) + Integer.parseInt(aux.get(pos+1));
			aux.remove(pos-1);
			aux.remove(pos-1);
			aux.remove(pos-1);
			aux.add(pos-1, newNumber.toString());
		}
		long out =1;
		for (int i = 0; i < aux.size(); i++) {
			if(!aux.get(i).equals("*")){
				out *= Long.parseLong(aux.get(i));
			}
		}
		return out;
	}
}
