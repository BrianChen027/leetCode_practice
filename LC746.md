# 746. Min Cost Climbing Stairs

#### You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
#### You can either start from the step with index 0, or the step with index 1.
#### Return the minimum cost to reach the top of the floor.

##### Example 1:
#####    Input: cost = [10,15,20]
#####    Output: 15
##### Example 2: 
#####    Input: cost = [1,100,1,1,1,100,1,1,100,1]
#####    Output: 6


```
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] likeFB = new int[cost.length+1];
        likeFB[0] = 0;
        likeFB[1] = 0;
        
        for(int i = 2; i <= cost.length ; i++){
            likeFB[i] = Math.min(likeFB[i-1]+cost[i-1], likeFB[i-2]+cost[i-2]);
        }
        
        return likeFB[cost.length];
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189467222-4460146b-eb23-49d3-a2ed-352be392eaf8.png)
