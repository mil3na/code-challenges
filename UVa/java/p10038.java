package JollyJumpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Jolly Jumpers - 10038
 * @author Milena Araujo
 *
 */
class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<String>();

		while(true){
			try{
				String aux;
				while((aux = reader.readLine()) != null){					
					String[] numbers = aux.split("\\s");
					int tamanho = Integer.parseInt(numbers[0]);
					boolean[] isJolly = new boolean[tamanho-1];
					for (int i = 2; i < numbers.length; i++) {
						int temp = Math.abs(Integer.parseInt(numbers[i-1]) - Integer.parseInt(numbers[i]));
						if(temp <= (tamanho -1) && temp >= 1){
							isJolly[temp-1] = true;						
						}
					}

					boolean print = true;
					for (int i = 0; i < isJolly.length; i++) {
						if(!isJolly[i]){
							print = false;
							break;
						}
					}

					if(print){
						out.add("Jolly");
					}else{
						out.add("Not jolly");
					}

				}
				break;
			}catch(Exception e){
				break;
			}
		}
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}
		System.exit(0);
	}

}
