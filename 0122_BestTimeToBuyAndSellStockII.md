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

### Normal Adding Version
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

### Dynamic Porgraming Version
```
class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[2];
        // 0: buy, 1: sell
        dp[0] = -prices[0];
        dp[1] = 0;
        for(int i = 1 ; i <= prices.length ; i++){
            dp[0] = Math.max(dp[0], dp[1] - prices[i-1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i-1]);
        }
        return dp[1];
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196929632-a1a2df35-c4e8-4638-a138-7f9b98db0c83.png)



