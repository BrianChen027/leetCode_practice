# 724. Find Pivot Index

#### Given an array of integers nums, calculate the pivot index of this array.
#### The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
#### If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
#### Return the leftmost pivot index. If no such index exists, return -1.

##### Example 1:
#####    Input: nums = [1,7,3,6,5,6]
#####    Output: 3
##### Example 2: 
#####    Input: nums = [1,2,3]
#####    Output: -1


```
class Solution {
    public int pivotIndex(int[] nums) {
        int temp1 = 0;
        for(int i:nums){
            temp1 += i;
        }
        int temp2 = 0;
        for(int i = 0; i <= nums.length-1; i++){
            temp1 -= nums[i];
            if(temp1 == temp2){
                return i;
            }
            temp2 += nums[i];
        }
        return -1;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189596146-d218d9c5-b7b6-4baa-ac01-f3de650b4e5f.png)
