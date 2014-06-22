package BoxofBricks;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Box of Bricks - 591
 * @author Milena Araujo
 *
 */

class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> out = new ArrayList<Integer>();
		

		while(true){			
			try{
				int stack = Integer.parseInt(reader.readLine());
				if(stack == 0){
					break;
				}else{
					String[] aux = reader.readLine().split("\\s");
					int [] heights = new int[aux.length];
					int total = 0;
					for (int i = 0; i < aux.length; i++) {
						heights[i] = Integer.parseInt(aux[i]);
						total += heights[i];
					}
					int maxSize = total/stack;
					int auxx =0;
					for (int i = 0; i < heights.length; i++) {
						if(heights[i] - maxSize > 0){
							auxx += Math.abs(heights[i] - maxSize);
						}						
					}
					out.add(auxx);
				}				
			}catch(Exception e){
				break;
			}
		}		

		for (int i = 0; i < out.size(); i++) {
			System.out.println("Set #"+(i+1));
			System.out.println("The minimum number of moves is "+ out.get(i)+".");
			System.out.println();
		}
		System.exit(0);
	}	
}