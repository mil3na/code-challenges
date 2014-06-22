

import java.util.Scanner;

public class p1370 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int qnts = input.nextInt();
		int primeiro = input.nextInt();

		int wheel[] = new int[qnts];

		for (int i = 0; i < qnts; i++) {
			wheel[i] = input.nextInt(); 
		}

		int i;
		String saida = "";
		i = primeiro % qnts;

		while (saida.length() < 10){
			if(i > qnts -1){
				i = 0;
			}
			saida += wheel[i];
			i++;
		}		
		System.out.println(saida);
	}
}
