import java.util.HashMap;
import java.util.Scanner;

/**
 * Lonesome Knight
 * @author Milena Araujo
 *
 */
public class p1197 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tests = input.nextInt();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		
		int x,y = 0;
		
		for (int i = 0; i < tests; i++) {
			char[] place = input.next().toCharArray();
			x = map.get(place[0]);
			y = (int)place[1] - 48;
			
			System.out.println(moves(x,y));
			
		}

	}

	private static int moves(int x, int y) {
		int count = 0;
		
		if(x+2 <= 8){
			if(y+1 <= 8){
				count++;
			}
			if(y-1 > 0){
				count++;
			}
		}
		
		if(x-2 >0){
			if(y+1 <= 8){
				count++;
			}
			if(y-1 > 0){
				count++;
			}
		}
		
		if(y+2 <= 8){
			if(x+1 <= 8){
				count++;
			}
			if(x-1 > 0){
				count++;
			}
		}
		
		if(y-2 >0){
			if(x+1 <= 8){
				count++;
			}
			if(x-1 > 0){
				count++;
			}
		}
		
		return count;
	}

}
