---
description: 353/708 pdf
---

# Chapter 8 - Recursion and Dynamic Programming

1\) 

```text
int countSteps(int n){

	if(n==0)
		return 1;
	if(n<0)
		return 0;
	return countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
}


int countStepsWithDP(int n){

	map <int, int> stepMap;

	if(n==1) return 1;
	if(n <= 0) return 0;
	if(stepMap.find(n)==stepMap.end()){
		stepMap[n] = countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
		return stepMap[n];
	}
	else{
		return stepMap[n];
	}

}
```

