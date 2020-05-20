---
description: >-
  https://www.interviewcake.com/question/cpp/reverse-words?course=fc1&section=array-and-string-manipulation
---

# Reverse Words

**You're working on a secret team solving coded transmissions.**

Your team is scrambling to decipher a recent message, worried it's a plot to break into a major European National Cake Vault. The message has been _mostly_ deciphered, but all the words are backward! Your colleagues have handed off the last step to you.

Write a function reverseWords\(\) that takes a message as a string and reverses the order of the words in place. ↴

For example:

```text
  string message = "cake pound steal";

reverseWords(message);

cout << message << endl;
// prints: "steal pound cake"
```

CC\#C++JavaJavaScriptObjective-CPHPPython 2.7Python 3.6RubySwift

When writing your function, assume the message contains only letters and spaces, and all words are separated by one space.



```cpp

void reverse(string & str, int start, int end)
{
    if (str.empty()) {
        return;
    }

    size_t leftIndex = start;
    size_t rightIndex = end;

    while (leftIndex < rightIndex) {
        // swap characters
        swap(str[leftIndex], str[rightIndex]);

        // move towards middle
        ++leftIndex;
        --rightIndex;
    }
}




int main(){

string words = "cake pound steal"; 

reverse(words, 0, words.length()-1);

cout << words << endl;

int index =0;

for(int i =0 ; i <= words.length(); i++){

	if(i == words.length() || words[i] == ' '){
		reverse(words, index, i-1);
		index = i+1;
	}

}

cout << words << endl;

}


```

