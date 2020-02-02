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

```text

bool isPalindrome ( string word){
	if(word.length() <=1)
		return true;

	for(int i=0; i < (word.length()+1)/2; i++){
		if(word[i]!= word[word.length()-1-i])
			return false;
	}

	return true;
}

int main(){
	
	cout<<"isPalindrome "<< boolalpha<< isPalindrome("Tact Coa" )<<endl;
}
```



question 5

```text
bool checkOneEditSameLength(string word1, string word2){
	bool oneEdit = false;
	for(int i=0; i < word1.length(); i++){
		if(word1[i]!=word2[i]){
			if(oneEdit)
				return false;
			else
				oneEdit = true;
		}
	}
	return true;
}

bool checkOneEditDifferentLength(string word1, string word2){
	int length1 = word1.length();
	int length2 = word2.length();

	if(abs(length1-length2)>1){
		return false;
	}

	string shortWord;
	string longWord;

	if( length1 < length2){
		shortWord = word1;
		longWord = word2;
	}
	else{
		shortWord = word2;
		longWord = word1;
	}

	int numDifference = 0;

	int longIndex =0;
	int shortIndex =0;

	while (longIndex < longWord.length() && shortIndex < shortword.length()){
		if(shortword[shortIndex] != longWord[longIndex]){
			if(shortIndex!=longIndex)
				return false;
			longIndex++;
		}else{
			shortIndex++;
			longIndex++;
		}
	}

	return true;

}



bool oneAway( string word1, string word2){

	if(word1 == word2 )
		return true;

	if(word1.length()==word2.length()){
		return checkOneEditSameLength(word1, word2);
	}
	else{
		return checkOneEditDifferentLength(word1, word2);
	}
```



question 6

```text
string compression2(string word){
	string result ;

	
	char prev = word [0];

	result += prev;

	int count = 0;

	for(char x : word){
		if(x == prev)
			count++;
		else{
			prev = x;
			result+= to_string(count);
			result+=x;
			count = 1;
		}
	}

	result += to_string(count); 

	if(result.length() >= word.length()){
		return word;
	}
	else{
		return result; 
	}
}


		

int main(){
	
	cout<<"Compressed - "<< compression2("aabccccaaa" )<<endl;
}
```



