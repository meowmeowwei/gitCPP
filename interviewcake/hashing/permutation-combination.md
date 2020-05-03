# Permutation Combination

bool permutationPalindrome\(string input\){ unordered\_map chars;

```cpp

bool permutationPalindrome(string input){
	unordered_map<char,int> chars;

	for(char c : input){
		if(chars.find(c)!=chars.end()){
			chars[c] ++;
		}
		else{
			chars.insert(make_pair(c, 1));
		}
	}


	int count =0;

	for(auto  it = chars.begin(); it != chars.end(); it ++){
		if (it->second %2 >0){
			count++;
			if (count >1)
				return false;
		}
	}

	return true;
}



int main(){

	string input = "ssw";

	cout << boolalpha << permutationPalindrome(input)<< endl;




}

```

