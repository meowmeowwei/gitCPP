---
description: 'answers 287/708 ,    reading 123/708'
---

# Chapter 5 Bits Manipulation

1\)

```cpp
int updateBits(int n, int m, int i, int j){

	int allOnes = ~0;

	int left = allOnes <<(j+1);
	
	int right = ((1 <<i) -1);

	int mask = left | right;

	int n_cleared = n & mask;
	int m_shifted = m <<i;

	return n_cleared | m_shifted;

}

int main(){

	cout<< updateBits(10000000000, 10011, 2, 6)<<endl;

	return 0;
		
}
```

2\) 



