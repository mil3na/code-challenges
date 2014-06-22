
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hashmat the brave warrior - 10055
 * @author Milena
 *
 */

class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer out = new StringBuffer();

		while(true){
			try{
				String aux = reader.readLine();
				if(aux == null){
					break;
				}else{
					long numero1 = Long.parseLong(aux.substring(0, aux.indexOf(" ")));
					long numero2 = Long.parseLong(aux.substring(aux.indexOf(" ") +1 , aux.length()));
					if(numero1 > numero2){
						out.append(numero1 - numero2);
					}else{
						out.append(numero2 - numero1);
					}
					out.append("\n");
				}				
			}catch(Exception e){
				break;
			}
		}		

		System.out.print(out);	
		System.exit(0);
	}	
}
