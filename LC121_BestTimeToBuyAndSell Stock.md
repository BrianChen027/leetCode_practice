# 121. Best Time to Buy and Sell Stock

#### You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
#### You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
#### Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

##### Example 1:
#####    Input: prices = [7,1,5,3,6,4]
#####    Output: 5
##### Example 2: 
#####    Input: prices = [7,6,4,3,1]
#####    Output: 0


```
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowerFlag = Integer.MAX_VALUE;
        for(int i:prices){
            if(lowerFlag > i){
                lowerFlag = i;
            }
            if(i - lowerFlag > profit){
                profit = i - lowerFlag;
            }
        }
        return profit;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187980226-971aa77a-5d52-4dc9-a03c-6cd2d970ca4c.png)
