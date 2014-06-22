package TwinPrimes;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Twin Primes - 10394
 * @author Milena Araujo
 *
 */
class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer out = new StringBuffer();


		int upperBound = 20000000;
		boolean[] primes = new boolean[upperBound];

		for (int i = 0; i < upperBound; i++) {
			primes[i] = false;
		}


		int upperBoundSquareRoot = (int) Math.sqrt(upperBound);
		boolean[] isComposite = new boolean[upperBound + 1];
		for (int m = 2; m <= upperBoundSquareRoot; m++) {
			if (!isComposite[m]) {
				primes[m] = true;
				for (int k = m * m; k <= upperBound; k += m)
					isComposite[k] = true;
			}
		}
		for (int m = upperBoundSquareRoot; m <= upperBound; m++)
			if (!isComposite[m])
				primes[m] = true;


		int[] ns = new int[100001];
		ns[0] = 0;
		for (int i = 1; i < ns.length; i++) {
			ns[i] = 0;
		}
		int num = 0;

		while(true){
			try{
				String aux = reader.readLine();
				while (aux != null){
					num = Integer.parseInt(aux);
					if(num - 1 == 0){
						out.append("(3, 5)\n");
					}else{
						int i = num;
						while(ns[i] == 0 && i > 1){
							i--;
						}
						while(i <= num){
							ns[i] = Main.findTwin(ns[i-1] +1, primes);
							i++;
						}
						
						if(Main.isTwinPositive(ns[num], primes)){
							out.append("(" +  (6*ns[num-1]+1) + ", " +  (6*ns[num-1]+3) + ")\n");
						}else{
							out.append("(" + (6*ns[num-1]-1) + ", " +  (6*ns[num-1]+1) + ")\n");
						}
					}
					
					
					
						

					aux = reader.readLine();

				}
				break;
			}catch (Exception e ){
				break;
			}
		}
		System.out.print(out);
		System.exit(0);		
	}

	static int findTwin(int num, boolean[] primes) {
		int i = num;
		while( !( (primes[6*i-1]) && (primes[6*i+1])) && !( (primes[6*i+1]) && (primes[6*i+3])) ){
			i++;
		}
		return i;
	}

	static boolean isTwinPositive(int num, boolean[] primes) {
		if(( (primes[6*num-1]) && (primes[6*num+1]))){
			return false;
		}else{
			return true;
		}

	}


}
