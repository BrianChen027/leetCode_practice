# 2144. Minimum Cost of Buying Candies With Discount

#### A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.
#### The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought.
#### For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4.

#### Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies.

##### Example 1:
#####    Input: cost = [1,2,3]
#####    Output: 5
##### Example 2: 
#####    Input: cost = [6,5,7,9,2,2]
#####    Output: 23


```
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        int count = 1;
        for(int i = cost.length-1; i >= 0; i--){
            if(count%3 == 0){
                count = 1;
                continue;
            }
            total += cost[i];
            count++;
        }
        return total;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189375231-36276b7f-2e04-4d69-a20e-e9b696b0dc70.png)
