# Chapter 1 - Arrays and Strings

question 1

```text
#include <iostream>
#include <string>
#include <iomanip>
#include <algorithm>
using namespace std;

bool isUnique(string word){
	int arr [256] ;

	for ( int i=0; i < word.length(); i++){
		if (arr[word[i]])
			return false;
		else
			arr[word[i]] =1;
	}
	return true;
}


bool isUnique2(string word){
	sort(word.begin(), word.end());

	char prev = word[0];
	for(int i=1; i < word.length(); i++){
		char curr = word[i];
		if(curr == prev)
			return false;
		prev = curr; 
	}

	return true;
}



int main(){
	
	cout<<"is unqiue "<< boolalpha<<isUnique("Sunwnei")<<endl;

	cout<<"is unqiue "<< boolalpha<<isUnique2("Sunwnei")<<endl;
}
```

question 2

```text
#include <iostream>
#include <string>
#include <iomanip>
#include <algorithm>
using namespace std;

bool isPermutation(string word, string word2){
	sort(word.begin(), word.end());
	sort(word2.begin(), word2.end());
	return word==word2;
}

int main(){
	
	cout<<"is permutation"<< boolalpha<<isPermutation("Sunwei", "Sunwei")<<endl;
}
```

question 3

```text
string urlIfy2(string word, int length){
	int spaceCount = 0;

	for(int i=0; i < length; i++){
		if(word[i] == ' ')
			spaceCount ++;
	}

	int modifiedLength = length + 2 * spaceCount;
	

	for(int k = length-1;  k>=0; k--){
		
		if(word[k] == ' '){
			
			word[--modifiedLength] = '0';
			word[--modifiedLength] = '2';
			word[--modifiedLength] = '%';
		}else{
			
			word[--modifiedLength] = word[k];
		}
	}

	return word;

}


int main(){
	
	cout<<"URLify "<< urlIfy("Sunw nei ", 8 )<<endl;

	cout<<"URLify "<< urlIfy2("Mr John Smith    ", 13);
}
```



question 4



