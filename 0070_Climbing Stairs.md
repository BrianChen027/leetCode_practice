# 70. Climbing Stairs

#### You are climbing a staircase. It takes n steps to reach the top.
#### Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

##### Example 1:
#####    Input: n = 2
#####    Output: 2
##### Example 2: 
#####    Input: n = 2
#####    Output: 3


```
class Solution {
    public int climbStairs(int n) {
        int[] fb = new int[n+1];
        fb[0] = 1;
        fb[1] = 1;
        
        for(int i = 2; i <= n ; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
        return fb[n];
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189466041-20291244-d323-4379-985d-de4630d70a5d.png)
