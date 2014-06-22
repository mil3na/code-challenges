/*
 * 100.cpp
 *
 *  Created on: Jan 29, 2011
 *      Author: milena
 */
#include <iostream>
using namespace std;

int calcSize(int num){
	unsigned long n= num;
	int i = 1;

	while(n != 1){
		if( n%2 == 0){
			n= n/2;
		}else{
			n = 3*n + 1;
		}
		i++;
	}
	return i;
}

int main(){

	string s = "";

	int i;
	int j;
	int max =0;

	int k;
	int l;


	while(cin >> i >> j){
		cout << i << " " << j << " ";

		if(i > j){
			k = j;
			l = i;
		}else{
			k = i;
			l = j;
		}

		max =0;

		for (int m = k; m <= l; m++) {

			int temp = calcSize(m);

			if(temp > max){
				max = temp;
			}
		}

		cout << max << "\n";
	}

	return 0;
}
