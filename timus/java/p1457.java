import java.util.Scanner;

public class p1457 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double saida=0;
		double quantos = input.nextInt();
		for (int i =0; i< quantos; i++){
			saida +=input.nextInt();
		}
		
		saida = saida/quantos;
		
		System.out.println(saida);

	}

}
