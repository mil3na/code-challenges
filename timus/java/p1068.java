

import java.util.Scanner;

public class p1068 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		int saida = 0;

		if(numero < 1){
			for (int i = numero; i <= 1; i++) {
				saida += i;
			}
		}else{
			for (int i=1; i<=numero; i++){
				saida +=i;
			}
		}		
		System.out.println(saida);
	}
}
