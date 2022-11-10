# 75. Sort Colors

#### Given an array nums with n objects colored red, white, or blue, sort them in-place
#### so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
#### We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

#### You must solve this problem without using the library's sort function.

##### Example 1:
#####    Input: nums = [2,0,2,1,1,0]
#####    Output: [0,0,1,1,2,2]
##### Example 2: 
#####    Input: nums = [2,0,1]
#####    Output: [0,1,2]


```
class Solution {
    public void sortColors(int[] nums) {
        int countR = 0;
        int countW = 0;
        int countB = 0;
        for(int n:nums){
            if(n == 0){
                countR++;
            }else if(n == 1){
                countW++;
            }else{
                countB++;
            }
        }
        int count = 0;
        while(count < nums.length){
            if(countR > 0){
                nums[count] = 0;
                countR--;
            }else if(countW > 0){
                nums[count] = 1;
                countW--;
            }else{
                nums[count] = 2;
            }
            count++;
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196105926-5d0ff482-1079-47fd-8c15-8ccf560efc49.png)
