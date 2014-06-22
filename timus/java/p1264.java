import java.util.Scanner;


public class p1264 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tamanhoArray = input.nextInt();
		int numero = input.nextInt();

		numero++;

		int segundos = numero*tamanhoArray;

		System.out.println(segundos);

	}
}
