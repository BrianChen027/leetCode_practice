# 1984. Minimum Difference Between Highest and Lowest of K Scores

#### You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
#### Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
#### Return the minimum possible difference.

##### Example 1:
#####    Input: nums = [90], k = 1
#####    Output: 0
##### Example 2: 
#####    Input: nums = [9,4,1,7], k = 2
#####    Output: 2


```
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = nums.length-1; i >= k-1 ; i--){
            if(i < k){
                min = Math.min(min, nums[i]-nums[0]);
            }else{
                min = Math.min(min, nums[i]-nums[(i+1)-k]);
            }
        }
        return min;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189463982-344f7bba-368f-4a81-ae0d-d2ca27abb976.png)
