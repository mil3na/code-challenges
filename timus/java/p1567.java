import java.util.Scanner;


public class p1567 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int preco =0;
		
		String slogan = input.nextLine();
		
		char[] oSlogan = slogan.toCharArray();
				
		for (int i = 0; i< oSlogan.length; i++){
			if (oSlogan[i] != ' '){
				if (((oSlogan[i] - 'a') % 3) == 0 || oSlogan[i] == '.'){
					preco++;
				}else if (((oSlogan[i] - 'b') % 3) == 0 || oSlogan[i]== ','){
					preco += 2;
				}else if (((oSlogan[i] - 'c') % 3) == 0 || oSlogan[i] == '!'){
					preco += 3;
				}
			}else{
				preco++;
			}
		}
		
		System.out.println(preco);

	}
}
