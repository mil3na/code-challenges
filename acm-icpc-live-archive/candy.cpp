/*
 * candy.cpp
 *
 *  Created on: 23/11/2008
 *      Author: Milena
 */

#include <iostream>
using namespace std;

void change(int array[], int size){
	for(int j =0; j < size; j++){
		array[j] = 0;
	}
}


bool hasNumber(int matrix[], int size){
	for(int i=0; i < size; i++){
		if(matrix[i] != 0){
			return true;
		}
	}
	return false;
}

int main(){

	int n;
	int m;
	cin >> n >> m;
	while(n != 0 && m !=0){
		int out = 0;
		int matrix[n][m];
		for(int i=0; i <n; i++){
			for(int j =0; j < m; j++){
				cin >> matrix[i][j];
			}
		}
		bool enterLoop = true;

		while(enterLoop){
			enterLoop = false;
			int max = 0;
			int linha = 0;
			int coluna = 0;
			for(int i=0; i < n; i++){
				for(int j =0; j < m; j++){
					if(matrix[i][j] > max){
						max  = matrix[i][j];
						linha = i;
						coluna = j;
					}
				}
			}


			out += matrix[linha][coluna];
			if(linha > 0 && linha < m-1){
				change(matrix[linha-1], m);
				change(matrix[linha+1], m);
			}else{
				if(linha == 0){
					change(matrix[linha+1], m);
				}else{
					change(matrix[linha-1], m);
				}
			}
			matrix[linha][coluna] = 0;
			if(coluna > 0 && coluna < n-1){
				matrix[linha][coluna-1] = 0;
				matrix[linha][coluna+1] = 0;
			}else{
				if(coluna == 0){
					matrix[linha][coluna+1] = 0;
				}else{
					matrix[linha][coluna-1] = 0;
				}

			}

			for(int i =0; i < n; i++){
				if(hasNumber(matrix[i], m)){
					enterLoop = true;
					break;
				}
			}
		}

		cout << out << "\n";
		cin >> n >> m;
	}

	return 0;
}
