

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p1431 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> rows2 = new ArrayList<Integer>();
		
		int qnts = input.nextInt();
		
		for (int i = 0; i < qnts; i++) {
			rows.add(input.nextInt());
		}
		
		Collections.sort(rows);
		boolean juntou = false;
		do{
			if(rows.size() < 2){
				juntou = false;
			}
			for (int i = 1; i < rows.size(); i++) {
				if(Math.abs(rows.get(i-1) - rows.get(i)) == 1){
					rows2.add(rows.get(i-1) + rows.get(i));
					rows.remove(i-1);
					rows.remove(i-1);					
					juntou = true;
					break;					
				}
				juntou = false;
			}		
			
		}while(juntou);			
		System.out.println(rows2.size() + rows.size());
	}
}
