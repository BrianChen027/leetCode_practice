# 1480. Running Sum of 1d Array

#### Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
#### Return the running sum of nums.

##### Example 1:
#####    Input: nums = [1,2,3,4]
#####    Output: [1,3,6,10]
##### Example 2: 
#####    Input: nums = [1,1,1,1,1]
#####    Output: [1,2,3,4,5]


```
class Solution {
    public int[] runningSum(int[] nums) {
        int temp = 0;
        for(int i = 0; i <= nums.length-1 ; i++){
            temp += nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189596366-50c50144-785b-4c06-beb8-779887d1f64d.png)
