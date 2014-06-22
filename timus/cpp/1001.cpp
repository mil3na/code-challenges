/*
 * 1001.cpp
 *
 *  Created on: Jan 30, 2011
 *      Author: milena
 */

#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>
using namespace std;

bool comp (int i,int j) { return (i>j); }

int main(){

	double x;
	vector<double> vec;

	while(cin >> x){
		vec.push_back(sqrt(x));
	}

	for (int i=vec.size() -1; i >=0 ; i--){
		printf("%.4f\n", vec.at(i));
	}

	return 0;
}
