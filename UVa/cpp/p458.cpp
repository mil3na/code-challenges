/*
 * decoder.cpp
 *
 *  Created on: 15/11/2008
 *      Author: Milena
 */

#include <iostream>
#include <stdio.h>
using namespace std;

int main(){
	char input;
	while((input = getchar()) != EOF){
		if(input != 10){
			char out = input - 7;
			cout << out;

		}else{
			cout << "\n";
		}
	}

	return 0;
}
