

import java.math.BigDecimal;
import java.util.Scanner;

public class p1263 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aux;
		double aux2;

		int candidatos = input.nextInt();
		int eleitores = input.nextInt();

		int votos[] = new int[candidatos];
		for (int i = 0; i < eleitores; i++) {
			aux = input.nextInt();
			votos[aux-1]++;
		}

		BigDecimal big;
		for (int i = 0; i < votos.length; i++) {
			aux2 = votos[i]*100;
			big = new BigDecimal(aux2/eleitores).setScale(2,BigDecimal.ROUND_HALF_UP);
			System.out.println(big+"%");
		}

	}

}
