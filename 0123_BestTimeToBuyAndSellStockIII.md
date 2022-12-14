# 123. Best Time to Buy and Sell Stock III

#### You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

#### Find the maximum profit you can achieve. You may complete "at most two" transactions.
#### Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).


##### Example 1:
#####    Input: prices = [3,3,5,0,0,3,1,4]
#####    Output: 6
##### Example 2: 
#####    Input: prices = [1,2,3,4,5]
#####    Output: 4

### Dynamic Programing Version(Saving more space)

```
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        // 0: buy first time, 1: sell first time, 2: buy second time, 3: sell second time
        int[] dp = new int[4];
        dp[0] = -prices[0];
        dp[1] = 0;
        dp[2] = -prices[0];
        dp[3] = 0;
        //把buy當作支出 也就是"負數"
        //sell是把現在金額去補足之前的buy空缺
        //ex: 第一天buy 3 --> -3
        //ex: 第二天的價格是 5 --> sell --> -3 + 5 = 2 --> 賺2
        //ex: 但要是第二天價格是 2 --> sell --> -3 + 2 = -1 --> 虧 --> 不sell
        //dp[2] --> 把第一次買賣賺的餘額去購買第二次 --> (dp[1] - price) + price --> 賺
        for(int i = 1 ; i <= prices.length ; i++){
            dp[0] = Math.max(dp[0], -prices[i-1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i-1]);
            dp[2] = Math.max(dp[2], dp[1] - prices[i-1]);
            dp[3] = Math.max(dp[3], dp[2] + prices[i-1]);
        }
        return dp[3];
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/196938222-3112eff8-2606-4c03-b134-8b7f777f843e.png)

### Dynamic Programing Version
```
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int[][] dp = new int[prices.length][5];
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i][3] + prices[i]);
        }

        return dp[prices.length-1][4];
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/196935101-51a523ff-fe55-445a-abdb-ad530b1c3070.png)

