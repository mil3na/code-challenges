import java.util.Scanner;

/**
 * Hotel
 * @author Milena Araujo
 *
 */

public class p1319 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size = input.nextInt();

		int[][] keys = new int[size][size];

		if(size == 1){
			System.out.println("1");
		}else{
			fillMain(keys);
			fillUp(keys);
			fillDown(keys);
			
			for (int i = 0; i < keys.length; i++) {
				for (int j = 0; j < keys.length; j++) {
					System.out.print(keys[i][j]+ " ");
				}
				System.out.println();
			}
		}


	}

	private static void fillDown(int[][] keys) {
		int k = 0;
		int x=0;
		int y=1;
		for (int i = 0; i < keys.length; i++) {
			k = keys.length;
			x = keys[i][i];
			y = i+1;
			while(y < keys.length){
				x += k;
				keys[y][i] = x;
				k--;
				y++;
			}
		}
	}

	private static void fillUp(int[][] keys) {
		int k = 0;
		int x=0;
		int y=1;
		for (int i = 0; i < keys.length; i++) {
			k = keys.length;
			x = keys[i][i];
			y = i-1;
			while(y >= 0){
				x -= k;
				keys[y][i] = x;
				k--;
				y--;
			}
		}

	}

	private static void fillMain(int[][] keys) {
		int first = first(keys.length);
		for (int i = 0; i < keys.length; i++) {
			keys[i][i] = first;
			first++;
		}

	}
	
	private static int first(int size){
		int t = 2;
		
		for (int i = 2; i < size; i++) {
			t += i;
		}
		
		return t;
	}



}
