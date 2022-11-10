# 81. Search in Rotated Sorted Array II

#### There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
#### Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) 
#### such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
#### For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

#### Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

#### You must decrease the overall operation steps as much as possible.

##### Example 1:
#####    Input: nums = [2,5,6,0,0,1,2], target = 0
#####    Output: true
##### Example 2: 
#####    Input: nums = [2,5,6,0,0,1,2], target = 3
#####    Output: false

### Normal Version
```
class Solution {
    public boolean search(int[] nums, int target) {
        for(int n:nums){
            if(n == target){
                return true;
            }
        }
        return false;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/196696290-75d8f812-9a78-4ad6-8996-b931b8148317.png)

### Two Point Version
```
class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] == nums[mid]){
                left++;
            }else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/196696338-9dab1e70-ddf4-497d-a084-8c0611dfa13e.png)
