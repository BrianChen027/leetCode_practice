# 209. Minimum Size Subarray Sum

#### Given an array of positive integers nums and a positive integer target,
#### return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which
#### the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

##### Example 1:
##### Input: target = 7, nums = [2,3,1,2,4,3]
##### Output: 2
##### Explanation: The subarray [4,3] has the minimal length under the problem constraint.

```
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        while(right <= nums.length-1){
            sum += nums[right];
            while(sum >= target){
                result = Math.min(result, (right - left + 1));
                sum -= nums[left];
                left++;
            }  
            right++;
        }
        return result == Integer.MAX_VALUE?0:result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184287476-febfcacc-5da9-4d3d-868f-4cd25092832c.png)
