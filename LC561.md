# 561. Array Partition

#### Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
#### such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

##### Example 1:
#####    Input: nums = [1,4,3,2]
#####    Output: 4
##### Example 2: 
#####    Input: nums = [6,2,6,5,1,2]
#####    Output: 9


```
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i <= nums.length-2 ;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189463931-e87579da-7f2f-42f0-97ca-93be47d5fc2c.png)
