# 35. Search Insert Position

#### Given a sorted array of distinct integers and a target value, return the index if the target is found.
#### If not, return the index where it would be if it were inserted in order.

##### You must write an algorithm with O(log n) runtime complexity.

```
class Solution {
    public int searchInsert(int[] nums, int target) {
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
        return left;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184141190-4be11fdf-9db1-4f69-91c2-c4295e3c70e6.png)
