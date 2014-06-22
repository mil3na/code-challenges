import java.util.Scanner;

/**
 * Cipher Grille
 * @author Milena Araujo
 *
 */

public class p1712 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[][] grille = new char[4][4];
		char[][] passwd = new char[4][4];
		
		char[] temp = null;
		
		String pass = "";
		
		for (int i = 0; i < grille.length; i++) {
			temp = input.next().toCharArray();
			for (int j = 0; j < temp.length; j++) {
				grille[i][j] = temp[j];
			}
		}
		
		for (int i = 0; i < passwd.length; i++) {
			temp = input.next().toCharArray();
			for (int j = 0; j < temp.length; j++) {
				passwd[i][j] = temp[j];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			pass += findFour(grille, passwd);
			grille = spinMatrix(grille);
		}
		
		System.out.println(pass);
	}
	
	private static String findFour(char[][] grille, char[][] passwd) {
		String result = "";
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[i].length; j++) {
				if(grille[i][j] == 'X'){
					result += passwd[i][j];
				}
			}
		}
		
		return result;
	}

	private static char[][] spinMatrix(char[][] matrix){
		char[][] temp = new char[4][4];
		int x =0;
		int y = 0;
		
		for (int j = 0; j < temp.length; j++) {
			for (int i = temp.length-1; i >=0 ; i--) {
				temp[y][x] = matrix[i][j];
				x++;
			}
			x=0;
			y++;
		}
		return temp;
		
	}
	
}
