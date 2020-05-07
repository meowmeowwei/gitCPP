# Apple Prices

```cpp
int getMaxProfit(vector<int> & prices){
	if(!prices.size())
		return 0;

	int prev = prices[0];
	int profit = 0;
	for(int i=1; i < prices.size(); i++){
		if(prices[i]>prev){
			profit += (prices[i] - prev);
		}
		prev = prices[i];

	}
	return profit; 
}


int main(){
	
	vector<int> stockPrices{10, 7, 5, 8, 11, 9};

    cout << getMaxProfit(stockPrices);

}


```

