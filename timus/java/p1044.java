

import java.util.Scanner;

public class p1044 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int qnts = input.nextInt();
		int saida=0;

		if (qnts == 2) {
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					if (a == b){
						saida++;
					}
				}
			}
		}

		if (qnts == 4){
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++) {
						for (int d = 0; d < 10; d++) {
							if (a+b == c+d){
								saida++;
							}
						}
					}
				}
			}
		}

		if (qnts == 6) {
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++) {
						for (int d = 0; d < 10; d++) {
							for (int e = 0; e < 10; e++) {
								for (int f = 0; f < 10; f++) {
									if(a + b + c == d+e+f){
										saida++;
									}
								}
							}
						}
					}
				}
			}
		}

		if (qnts == 8){
			for (int a = 0; a < 10; a++) {
				for (int b = 0; b < 10; b++) {
					for (int c = 0; c < 10; c++) {
						for (int d = 0; d < 10; d++) {
							for (int e = 0; e < 10; e++) {
								for (int f = 0; f < 10; f++) {
									for (int g = 0; g < 10; g++) {
										for (int h = 0; h < 10; h++) {
											if(a+b+c+d == e+f+g+h){
												saida++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(saida);
	}

}
