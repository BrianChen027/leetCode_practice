# 704. Binary Search

#### Given an array of integers nums which is sorted in ascending order, and an integer target,
#### write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

##### You must write an algorithm with O(log n) runtime complexity.

```
class Solution {
    public int search(int[] nums, int target) {
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

![image](https://user-images.githubusercontent.com/97871497/184140980-f0918004-09c3-4979-9ce0-68e0f14651c1.png)

