---
description: pdf pg 407/708
---

# Chapter 10 - Sorting and Searching

1\)

note that both a and b are already sorted 

```text
void sorting(int * a, int * b, int aSize, int bSize) {
	int aIndex = aSize-1;
	int bIndex = bSize-1;
	int totalIndex = aSize + bSize - 1;

	while (bIndex >=0){
		if(a[aIndex]>b[bIndex]){
			a[totalIndex] = a[aIndex];
			aIndex --;
		}
		else {
			a[totalIndex] = b[bIndex];
			bIndex --;
		}
		totalIndex --;
	}

}
```

2\) 

try sorting twice 

```text
bool compareFunction(string a, string b){
	sort(a.begin(), a.end());
	sort(b.beign(), b.end());

	return a<b; 
}

void sort(vector<string> stringList){
	sort(stringList.begin(), stringList.end(), compareFunction);
}
```



