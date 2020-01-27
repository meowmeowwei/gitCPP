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

2\) 

```text
//note the below is only for getting one path 
// for dynamic , record down the failed points 

bool getPath(vector<vector<int>> maze, int row, int col, vector<Point> & path){
	if(col < 0 || row < 0 || !maze[row][col]){
		return false;
	}

	bool isAtOrigin = (row == 0) && (col ==0);

	if (isAtOrigin || getPath(maze, row, col-1, path) || getPath(maze, row-1, col, path)){
		Point p (row, col);
		path.push_back(p);
		return true;
	}
	return false;
}


vector<Point> getPath(vector<vector<int>> maze){
	if(!maze || maze.size() == 0)
		return NULL;
	vector<Point> path;
	if(getPath(maze, maze.size()-1, maze[0].size()-1, path)){
		return path;
	}
	return NULL;

}
```

