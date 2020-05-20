# Word Permutation

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

	string input = "After beating the eggs, Dana read the next step";

	unordered_map <string, int> words;

	string word ="";
	for(int i=0; i < input.length(); i++){
		if(isalpha(input[i])){
			word+=tolower(input[i]);
		}
		else{
			if(words.find(word)!=words.end()){
				words[word] ++;
			}
			else{
				if(word!="" && word!=" ")
				   words.insert(make_pair(word, 1));
			}
			word = "";
		}
	}

	for(auto x : words){
		cout << x.first << " - " << x.second << endl;
	}

}

```

