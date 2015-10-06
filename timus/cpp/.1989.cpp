/*
 * 1989.cpp
 *
 *  Created on: Aug 24, 2015
 *      Author: milena
 */

#include <iostream>
#include <math.h>
#include <algorithm>
#include <vector>
using namespace std;

bool isPalindrome(string text){
	// if (text == string(text.rbegin(), text.rend()))
	// {
	// 	return true;
	// }
	// return false;
	return equal(text.begin(), text.begin() + text.size()/2, text.rbegin());
}

// bool isPalindrome (string text) { 
// 	int left = 0;
// 	int right = text.length()-1;
// 	while (left < right){
// 		if (text[left] != text[right])
// 		{
// 			return false;
// 		}
// 		left++;
// 		right--;
// 	}
// 	return true;

// }

int main(){

	string word, check, temp, sub;
	int times, first, last, pos;
	char new_char;

	cin >> word;
	cin >> times;

	for (int i = 0; i < times; i++)
	{
		cin >> check;
		if (check[0] == 'c')
		{
			cin >> pos;
			cin >> new_char;
			word[pos -1] = new_char;
		}
		else if (check[0] == 'p')
		{
			cin >> first;
			cin >> last;
			sub = word.substr(first-1,last-first+1);
			if (isPalindrome(sub))
			{
				cout << "Yes" << "\n";
			}
			else{
				cout << "No" << "\n";
			}
		}
	}

	return 0;
}