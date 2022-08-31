# 217. Contains Duplicate

#### Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
#### There is only one repeated number in nums, return this repeated number.
#### You must solve the problem without modifying the array nums and uses only constant extra space.

##### Example 1:
#####    Input: nums = [1,2,3,1]
#####    Output: true
##### Example 2: 
#####    Input: nums = [1,2,3,4]
#####    Output: false

```
class Solution {
   public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int i=0; i <= nums.length-1 ; i++){ 
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }  
        }
        return 0;
    }     
}
```

![image](https://user-images.githubusercontent.com/97871497/187750439-48bc4ebd-328a-4117-ba5c-524c0ae8fae9.png)
