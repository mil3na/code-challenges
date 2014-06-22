/*
 * feynman.cpp
 *
 *  Created on: 21/11/2008
 *      Author: Milena
 */

#include <iostream>
#include <math.h>
using namespace std;

int main(){
	int input;
	cin >> input;
	while(input != 0){
		double out = 0;
		for (int var = input; var > 0; var--) {
			out += pow(var,2);
		}
		cout << out << "\n";
		cin >> input;
	}

	return 0;
}
