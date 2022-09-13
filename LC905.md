# 905. Sort Array By Parity

#### Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
#### Return any array that satisfies this condition.

##### Example 1:
#####    Input: nums = [3,1,2,4]
#####    Output: [2,4,3,1]
##### Example 2: 
#####    Input: nums = [0]
#####    Output: [0]


```
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while(count < nums.length){
            if(nums[count]%2 == 0){
                arr[left++] = nums[count];
            }else{
                arr[right--] = nums[count];
            }
            count++;
        }
        return arr;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189911078-5c4a505f-fbc7-4e7e-9d4f-178b60a5c2b8.png)
