import java.io.IOException;
import java.util.Scanner;

public class p1585 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int countE =0;
		int countL =0;
		int countM = 0;
		int maior =0;
		String entrada;
		
		int numeroDePinguins = input.nextInt();		

		for (int i=0; i<= numeroDePinguins; i++){
			entrada = input.nextLine();
			if(entrada.equals("Emperor Penguin")){
				countE++;
			}
			if(entrada.equals("Little Penguin")){
				countL++;
			}
			if(entrada.equals("Macaroni Penguin")){
				countM++;
			}
		}

		maior = Math.max(Math.max(countE, countL), countM);
		
		if(maior == countE){
			System.out.println("Emperor Penguin");
		}
		if(maior == countL){
			System.out.println("Little Penguin");
		}
		if(maior == countM){
			System.out.println("Macaroni Penguin");
		}

	}

}
