

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1563  {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);

		String aux;
		int bayan = 0;
		List<String> lojas = new ArrayList<String>();		
		int qtsLojas = in.nextInt();		

		for (int i = 0; i <= qtsLojas; i++) {
			aux = in.nextLine();
			if (lojas.contains(aux)){
				bayan++;
			}else{
				lojas.add(aux);
			}
		}
		System.out.println(bayan);
	}
}
