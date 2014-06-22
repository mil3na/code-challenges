import java.util.Scanner;

public class p1493 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String numero = input.next();
		char[] numeros1 = numero.substring(0, 3).toCharArray();
		char[] numeros2 = numero.substring(3,6).toCharArray();

		int soma1=0;
		int soma2=0;

		for (int i =0; i< numeros1.length; i++){
			soma1 += numeros1[i] -48;
		}

		for (int i =0; i< numeros2.length; i++){
			soma2 += numeros2[i] -48;
		}

		if (Math.abs(soma1 - soma2) != 1){
			System.out.println("No");
		}else{
			Integer aux = Integer.parseInt(numero.substring(3,6)) +1;
			numeros2= aux.toString().toCharArray();
			int somaAux =0;
			for (int i =0; i< numeros2.length; i++){
				somaAux += numeros2[i] -48;
			}	
			aux = Integer.parseInt(numero.substring(3,6)) - 1;
			numeros2= aux.toString().toCharArray();
			int somaAux2 =0;
			for (int i =0; i< numeros2.length; i++){
				somaAux2 += numeros2[i] -48;
			}
			if (soma1 - somaAux != 0 && soma1-somaAux2 != 0){
				System.out.println("No");
			}else {

				System.out.println("Yes");
			}				
		}
	}
}