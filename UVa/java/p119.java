package GreedyGiftGivers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Greedy Gift Givers - 119
 * 
 * @author Milena Araujo
 *
 */
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		try{
			String in;
			while((in = input.readLine()) != null){
				int qnts = Integer.parseInt(in);
				List<String> people = new ArrayList<String>();
				int[] peoplesMoney = new int[qnts]; 
				String[] names = input.readLine().split("\\s");
				for (int i = 0; i < qnts; i++) {
					people.add(names[i]);
				}
				for (int i = 0; i < qnts; i++) {
					String[] inn = input.readLine().split("\\s");
					String gaver = inn[0];
					int qnt = Integer.parseInt(inn[1]);					
					int ppl = Integer.parseInt(inn[2]);
					if(ppl > 0){
						peoplesMoney[people.indexOf(gaver)] -= qnt;
						peoplesMoney[people.indexOf(gaver)] += qnt % ppl;
						for (int j = 0; j < ppl; j++) {
							peoplesMoney[people.indexOf(inn[j+3])] += qnt/ ppl;
						}
					}
										
				}
				for (int i = 0; i < qnts; i++) {
					out.append(people.get(i) + " " + peoplesMoney[i] + "\n");
				}
				out.append("\n");
				
			}
			System.out.println(out.toString().trim());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
