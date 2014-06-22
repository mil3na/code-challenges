import java.util.Scanner;


public class p1409 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int harry = input.nextInt();
		int larry = input.nextInt();
		
		int total = (harry + larry) -1;
		
		harry = total - harry;
		larry = total - larry;		
		
		System.out.println(harry + " " + larry);

	}

}
