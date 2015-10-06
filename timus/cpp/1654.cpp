/*
 * 1654.cpp
 *
 *  Created on: Aug 27, 2015
 *      Author: milena
 */

#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>
#include <regex>
using namespace std;

int main(){

	string message;

	cin >> message;

	regex doubs("(\\w)\\1");

	while (regex_search(message,doubs))
	{
		message = regex_replace(message, doubs, "");
	}
	cout << message <<  "\n";
	return 0;
}