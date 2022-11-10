# 287. Find the Duplicate Number

#### Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
#### There is only one repeated number in nums, return this repeated number.
#### You must solve the problem without modifying the array nums and uses only constant extra space.

##### Example 1:
##### Input: nums = [1,3,4,2,2]
##### Output: 2
##### Example 2: 
##### Input: nums = [3,1,3,4,2]
##### Output: 3

#### HashSet Version

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

![image](https://user-images.githubusercontent.com/97871497/187628629-0cf0b069-23ec-402c-91e4-2a9a86223299.png)

#### Boolean Flag Version

```
class Solution {
   public int findDuplicate(int[] nums) {
        boolean[] mark = new boolean[nums.length];
        for(int i:nums){
            if(mark[i]){
                return i;
            }else{
                mark[i] = true;
            }   
        }
        return -1;
    }     
}
```

![image](https://user-images.githubusercontent.com/97871497/187632247-f475dd43-50a8-4a69-899a-be4746172456.png)


