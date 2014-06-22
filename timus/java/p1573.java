import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p1573 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int B = input.nextInt();
		int R = input.nextInt();
		int Y = input.nextInt();
		int saida = 0;

		int qnts = input.nextInt();
		
		List<String> cores = new ArrayList<String>();
		for (int i = 0; i < qnts; i++) {
			String aux = input.next();
			cores.add(aux);
		}
		
		if(qnts == 1){
			if(cores.contains("Blue")){
				saida = B;
			}else{
				if(cores.contains("Red")){
					saida = R;
				}else{
					if(cores.contains("Yellow")){
						saida = Y;
					}
				}
			}
		}
		
		if(qnts == 2){
			if(cores.contains("Blue")){
				if(cores.contains("Red")){
					saida = B*R;
				}else{
					saida = B*Y;
				}
			}else{
				saida = R*Y;
			}
		}
		
		if(qnts == 3){
			saida = B*R*Y;
		}
		
		System.out.println(saida);
	}
}
