function FirstReverse(str) { 

	var i;
	var x = "";
	for(i=str.length-1; i>=0; i--){
		x += str[i] 
	}
	return x; 
         
}

// console.log(FirstReverse("Milena"));
// print(FirstReverse(readline()));    

function FirstFactorial(num){
	var i;
	var x = 1;
	for(i=num; i>0; i--){
		x = x*i; 
	}
   return x; 
}

// console.log(FirstFactorial(4));
// print(FirstFactorial(readline()));    

function LargestWord(str){
	var bigger = "";

	var words = str.replace(/[^A-Za-z0-9_\s]/g, "").split(" ");

	for (var i = 0; i < words.length; i++) {
		if(words[i].length > bigger.length){
			bigger = words[i];
		}
	};

	return bigger;
}

// print(LongestWord(readline()));   
// console.log(LargestWord("Milena Sales%%% Araujo"))