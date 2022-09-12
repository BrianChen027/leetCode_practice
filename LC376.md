# 376. Wiggle Subsequence

#### A wiggle sequence is a sequence where the differences between successive numbers strictly alternate between positive and negative. 
#### The first difference (if one exists) may be either positive or negative. 
#### A sequence with one element and a sequence with two non-equal elements are trivially wiggle sequences.

#### For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because the differences (6, -3, 5, -7, 3) alternate between positive and negative.
#### In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences. The first is not because its first two differences are positive, and the second is not because its last difference is zero.
#### A subsequence is obtained by deleting some elements (possibly zero) from the original sequence, leaving the remaining elements in their original order.

#### Given an integer array nums, return the length of the longest wiggle subsequence of nums.

##### Example 1:
#####    Input: nums = [1,7,4,9,2,5]
#####    Output: 6
##### Example 2: 
#####    Input: nums = [1,17,5,10,13,15,10,5,16,8]
#####    Output: 7


```
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int longS = 1;
        boolean flag = true;
        boolean startUp = true;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            
            if(nums[i] < nums[i+1] && startUp){
                startUp = false;
                flag = true;
            }else if(nums[i] > nums[i+1] && startUp){
                startUp = false;
                flag = false;
            }
            
            if(flag){
                if(nums[i] < nums[i+1]){
                    longS++;
                    flag = false;
                }
            }else{
                if(nums[i] > nums[i+1]){
                    longS++;
                    flag = true;
                }
            } 
        }
        return longS;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189711913-3450e1e3-37a1-475e-a182-fe9c76feffc8.png)
