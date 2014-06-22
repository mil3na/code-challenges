package Minesweeper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Minesweeper - 10189
 * @author Milena Araujo
 *
 */
class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> out = new ArrayList<String>();
		
		while(true){
			String line = null;
			try{
				line =reader.readLine();
				String[] ij = line.split("\\s");
				int linha = Integer.parseInt(ij[0]);
				int coluna = Integer.parseInt(ij[1]);
				int count = 0;
				while( linha != 0 && coluna != 0 ){	
					count++;
					char[][] field = new char[linha][coluna];
					char[] items = null;
					for (int i = 0; i < linha; i++) {
						line = reader.readLine();
						items = line.toCharArray();
						for (int j = 0; j < line.length(); j++) {
							field[i][j] = items[j];							
						}
					}
					String fieldOut = "";
					fieldOut +=("Field #"+ count +":\n");
					for (int i = 0; i < linha; i++) {
						for (int j = 0; j < coluna; j++) {
							if( field[i][j] == '*'){
								fieldOut += ("*");
							}else{
								fieldOut += (Main.quantasMinas(i, j, field));								
							}
						}
						fieldOut += ("\n");
					}
					fieldOut.trim();
					out.add(fieldOut);
					line =reader.readLine();
					ij = line.split("\\s");
					linha = Integer.parseInt(ij[0]);					
					coluna = Integer.parseInt(ij[1]);
				}
				break;
			}catch( Exception e ){
				break;
			}
			
		}
		for (int i = 0; i < out.size(); i++) {
			if(i < out.size()-1){
				System.out.println(out.get(i));
			}else{
				System.out.print(out.get(i));
			}			
		}
		System.exit(0);
	}
	
	
	static char quantasMinas(int linha, int coluna, char[][] field){
		int count =0;
		if(linha > 0 && coluna > 0 && field[linha -1][coluna -1] == '*'){
			count++;
		}
		if(linha > 0 && field[linha - 1][coluna] == '*'){
			count++;
		}
		if(linha > 0 && coluna < field[linha].length -1 && field[linha - 1][coluna + 1] == '*'){
			count++;
		}
		if(coluna > 0 && field[linha][coluna-1] == '*'){
			count++;
		}
		if(coluna < field[linha].length -1 && field[linha][coluna+1] == '*'){
			count++;
		}
		if(linha < field.length -1 && coluna > 0 && field[linha+1][coluna-1] == '*'){
			count++;
		}
		if(linha < field.length -1  && field[linha+1][coluna] == '*'){
			count++;
		}
		if(linha < field.length -1  && coluna < field[linha].length -1 && field[linha+1][coluna +1] == '*'){
			count++;
		}
		
		return (char) (48 + count);
	}

}
