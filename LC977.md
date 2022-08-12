# 977. Squares of a Sorted Array

#### Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

##### Example 1:

##### Input: nums = [-4,-1,0,3,10]
##### Output: [0,1,9,16,100]
##### Explanation: After squaring, the array becomes [16,1,0,9,100].
##### After sorting, it becomes [0,1,9,16,100].

```
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[nums.length];
        int point = nums.length-1;
        while(right >= left){
            if(nums[right]*nums[right] <= nums[left]*nums[left]){
                result[point] = nums[left]*nums[left];
                left++;
                point--;
            }else if(nums[right]*nums[right] > nums[left]*nums[left]){
                result[point] = nums[right]*nums[right];
                right--;
                point--;
            }
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184284433-f85df6a3-5c67-40f6-900b-28bed3821296.png)
