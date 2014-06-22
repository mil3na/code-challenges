/*
 * electricity.cpp
 *
 *  Created on: 22/11/2008
 *      Author: Milena
 */

#include <iostream>
using namespace std;

bool bissexto(int year){

	 if(year % 400 == 0){
		 return true;
	 }else{
		 if(year%100 == 0){
			 return false;
		 }else{
			 if(year%4 == 0){
				 return true;
			 }
		 }
	 }
	 return false;
}

int main(){
	int input;

	while((cin >> input) && input != 0){

		int day[input];
		int month[input];
		int year[input];
		int cons[input];

		for (int var = 0; var < input; var++) {
			cin >> day[var] >> month[var] >> year[var] >> cons[var];
		}

		int days =0;
		int totalCons = 0;
		for (int var = 1; var < input; var++) {
			if(year[var -1] == year[var]){
				if(month[var -1] == month[var]){
					if(day[var -1] +1 == day[var]){
						totalCons += cons[var] - cons[var -1];
						days++;
					}
				}else{
					if(month[var -1] +1 == month[var]){
						if(month[var -1] == 1 || month[var -1] == 3 || month[var -1] == 5 || month[var -1] == 7 || month[var -1] == 8 || month[var -1] == 10){
							if(day[var -1] == 31 && day[var] == 1){
								totalCons += cons[var] - cons[var -1];
								days++;
							}
						}
						if(month[var -1] == 4 || month[var -1] == 6  || month[var -1] == 9 || month[var -1] == 11){
							if(day[var -1] == 30 && day[var] == 1){
								totalCons += cons[var] - cons[var -1];
								days++;
							}
						}
						if(month[var -1] == 2){
							if(bissexto(year[var -1])){
								if(day[var -1] == 29 && day[var] == 1){
									totalCons += cons[var] - cons[var -1];
									days++;
								}
							}else{
								if(day[var -1] == 28 && day[var] == 1){
									totalCons += cons[var] - cons[var -1];
									days++;
								}
							}
						}
					}
				}
			}else{
				if(year[var -1]+ 1 == year[var] ){
					if(month[var -1] == 12 && month[var] == 1){
						if(day[var -1] == 31 && day[var] == 1){
							totalCons += cons[var] - cons[var -1];
							days++;
						}
					}
				}
			}

		}
		cout << days << " " << totalCons << endl;
	}

	return 0;
}
