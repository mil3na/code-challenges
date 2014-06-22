import java.util.Scanner;


public class p1313 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numeroDePixels = input.nextInt();
		int matriz[][] = new int[numeroDePixels][numeroDePixels];

		for(int i = 0; i< numeroDePixels; i++){
			for (int j=0; j< numeroDePixels; j++){
				matriz[i][j] = input.nextInt();
			}		
		}

		for (int k =0; k< numeroDePixels*2; k++){
			for(int i = 0; i< numeroDePixels; i++){
				for (int j=0; j< numeroDePixels; j++){
					if (i + j == k){
						System.out.print(matriz[j][i] + " ");
					}
				}		
			}
		}
	}

}
