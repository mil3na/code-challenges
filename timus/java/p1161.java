

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class p1161 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qnts = input.nextInt();
		
		List<Double> pesos = new ArrayList<Double>();
		for (int i = 0; i < qnts; i++) {
			pesos.add(input.nextDouble());
		}
		
		Comparator<Double> decrescente = Collections.reverseOrder();
		Collections.sort(pesos, decrescente);
		
		while(pesos.size() > 1){
			double aux = 2*(Math.sqrt(pesos.get(0) * pesos.get(1)));
			pesos.remove(0);
			pesos.remove(0);
			pesos.add(aux);
			Collections.sort(pesos, decrescente);
		}
		BigDecimal big = new BigDecimal(pesos.get(0));
		System.out.println(big.setScale(2,BigDecimal.ROUND_HALF_UP));		
	}
}
