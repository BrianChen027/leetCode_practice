# 53. Maximum Subarray

#### Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
#### A subarray is a contiguous part of an array.

##### Example 1:
#####    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
#####    Output: 6
##### Example 2: 
#####    Input: nums = [1]
#####    Output: 1

```
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int temp = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i:nums){    
            if(sum < 0){
                sum = 0;
            }
            sum += i;
            if(temp < sum){
                temp = sum;
            }
        }
        return temp;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187980623-50f167d4-d196-4e3c-99be-ea838975a24b.png)

