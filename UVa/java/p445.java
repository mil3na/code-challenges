package MarvelousMazes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Marvelous Mazes - 445
 * @author Milena Araujo
 *
 */
class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer out = new StringBuffer();

		while(true){
			try{
				String aux = reader.readLine();
				StringBuffer manipulation = new StringBuffer();
				while (aux != null){
					if(aux.equals(" ")){
						out.append(Main.manipulateString(manipulation.toString()) + "\n");
						manipulation = new StringBuffer();
					}else{
						manipulation.append(aux + "\n");
					}
					aux = reader.readLine();

				}
				out.append(Main.manipulateString(manipulation.toString()));
				break;
			}catch (Exception e ){
				break;
			}
		}
		System.out.print(out);
		System.exit(0);		
	}

	static StringBuffer manipulateString(String code){
		StringBuffer output = new StringBuffer();
		char[] tokens = code.toCharArray();
		int quantos = tokens[0] - 48;
		for (int i = 1; i < tokens.length ; i++) {
			if (Character.isDigit(tokens[i])){
				if(Character.isDigit(tokens[i-1])){
					quantos += tokens[i] - 48;
				}else{
					quantos = tokens[i] - 48;
				}
			}else{
				if(tokens[i] == 'b'){
					for (int j = 0; j < quantos; j++) {
						output.append(" ");
					}
				}else{
					if(tokens[i] == '!' || tokens[i] == '\n'){
						output.append("\n");
					}else{
						for (int j = 0; j < quantos; j++) {
							output.append(tokens[i]);
						}
					}
				}
			}
		}

		return output;
	}
}
