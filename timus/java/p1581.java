import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1581 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		String saida="";

		int qnts = input.nextInt();

		for(int i=0; i< qnts; i++){
			numeros.add(input.nextInt());
		}

		int count=1;
		for (int i = 1; i <= qnts; i++) {
			try{
				if(numeros.get(i-1) == numeros.get(i)){
					count++;
				}else{
					saida+= count+ " " +numeros.get(i-1) + " ";
					count=1;
				}
			}catch(Exception e){
				saida+= count+ " " +numeros.get(i-1) + " ";
			}			
		}		
		System.out.println(saida.trim());
	}
}
