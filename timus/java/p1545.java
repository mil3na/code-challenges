

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1545 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qnts = input.nextInt();
		String hiero[] = new String[qnts+1];
		
		for (int i = 0; i < hiero.length; i++) {
			hiero[i] = input.nextLine();
		}
		
		String letra = input.nextLine();
		List<String> out = new ArrayList<String>();
		
		for (int i = 0; i < hiero.length; i++) {
			if (hiero[i].startsWith(letra)){
				out.add(hiero[i]);
			}
		}
		
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}

	}

}
