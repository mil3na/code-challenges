/*
 * pole.cpp
 *
 *  Created on: 22/11/2008
 *      Author: Milena
 */

#include <iostream>
using namespace std;

int main(){
	int input;
	cin >> input;
	while(input != 0){
		int pole[input];
		int pos[input];
		int out[input];
		for (int var = 0; var < input; ++var) {
			pole[var] = 0;
			pos[var] = 0;
			out[var] = 0;
		}

		for (int i = 0; i < input; i++) {
			cin >> pole[i] >> pos[i];
		}

		bool printArray = true;
		for (int var = 0; var < input; var++) {
			int temp = var + pos[var];
			if((temp >= input) || (temp < 0) || (out[temp] !=0)){
				printArray = false;
				break;
			}else{
				out[temp] = pole[var];
			}
		}
		if(printArray){
			for (int var = 0; var < input; var++) {
					if(var == input -1){
						cout << out[var];
					}else{
						cout << out[var] << " ";
					}

				}

		}else{
			cout << -1;
		}
		cout << "\n";
		cin >> input;
	}

	return 0;
}
