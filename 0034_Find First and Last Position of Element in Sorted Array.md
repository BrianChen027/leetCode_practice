# 34. Find First and Last Position of Element in Sorted Array

#### Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
#### If target is not found in the array, return [-1, -1].

##### You must write an algorithm with O(log n) runtime complexity.

```
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int point = binarySearch(nums, target);
        int p1 = point;
        int p2 = point;
        if(point == -1){
            return new int[]{-1, -1};
        }else if((p1>0 && nums[p1 - 1] == target) || (p2 < (nums.length-1) && nums[p2 + 1] == target)){
            while(p1>0 && nums[p1 - 1] == target){
                p1--;
            }
            while(p2 < (nums.length-1) && nums[p2 + 1] == target){
                p2++;
            }
        } 
        return new int[]{p1, p2};
    }
    
    public int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid;
            }
        }
        return -1;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184140731-9241d9b9-6152-48c1-9b57-a922aaa189f6.png)

