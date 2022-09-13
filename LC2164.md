# 2164. Sort Even and Odd Indices Independently

#### You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
#### Sort the values at odd indices of nums in non-increasing order.
#### For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
#### Sort the values at even indices of nums in non-decreasing order.
#### For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.

Return the array formed after rearranging the values of nums.

##### Example 1:
#####    Input: nums = [4,1,2,3]
#####    Output: [2,3,4,1]
##### Example 2: 
#####    Input: nums = [2,1]
#####    Output: [2,1]


```
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        findNum(nums, 0);
        findNum(nums, 1);
        
        return nums;
        
    }
        
    public void findNum(int[]nums , int startFrom){
        for(int i = startFrom; i < nums.length ; i+=2){
            for(int j = i + 2; j < nums.length ; j+=2){
                if(startFrom == 0 && nums[i] > nums[j]){                    
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                }else if(startFrom == 1 && nums[i] < nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;         
                }
            }
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189910789-72015b62-4f8f-472a-ba5d-bafb0f2ebed9.png)
