import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p1025 {

	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		
		int aux;
		int soma = 0;
		int numeroDeGrupos = input.nextInt();
		List<Integer> tamanhos = new ArrayList<Integer>();
		
		for(int i = 0; i< numeroDeGrupos; i++){
			aux = input.nextInt();
			tamanhos.add(aux);			
		}
		
		Collections.sort(tamanhos);
		
		for (int i = 0; i< (numeroDeGrupos/2)+1; i++){
			soma += (tamanhos.get(i)/2)+1;
		}
		
		System.out.println(soma);
	}

}