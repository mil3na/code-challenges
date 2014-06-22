import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1496 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qnts = input.nextInt();
		
		List<String> equipes = new ArrayList<String>();
		List<String> repetidos = new ArrayList<String>();
		
		for (int i = 0; i < qnts; i++) {
			String aux = input.next();
			if( equipes.contains(aux)){
				if(!repetidos.contains(aux)){
					repetidos.add(aux);
				}				
			}else{
				equipes.add(aux);
			}
		}
		
		for (int i = 0; i < repetidos.size(); i++) {
			System.out.println(repetidos.get(i));
		}
	}
}
