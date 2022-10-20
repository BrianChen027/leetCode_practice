# 122. Best Time to Buy and Sell Stock II

#### You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
#### On each day, you may decide to buy and/or sell the stock.
#### You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

#### Find and return the maximum profit you can achieve.

##### Example 1:
#####    Input: prices = [7,1,5,3,6,4]
#####    Output: 7
##### Example 2: 
#####    Input: prices = [1,2,3,4,5]
#####    Output: 4


```
class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = Integer.MAX_VALUE;
        int total = 0;
        for(int i:prices){
            if(buyDay > i){
                buyDay = i;
            }else if(i - buyDay > 0){
                total += (i - buyDay);
                buyDay = i;
            }
        }
        return total;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187979960-0c5e66c4-2d2e-4e1c-9739-c24c89e8bb7f.png)

