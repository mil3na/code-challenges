import java.util.Scanner;

public class p1327 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int saida =0;
		int primeiroDia = input.nextInt();
		int segundoDia = input.nextInt();

		for (int i=primeiroDia; i<= segundoDia; i++){
			if (i%2 != 0){
				saida++;
			}
		}
	
		System.out.println(saida);
	}
}
