# 2202. Maximize the Topmost Element After K Moves

#### You are given a 0-indexed integer array nums representing the contents of a pile, 
#### where nums[0] is the topmost element of the pile.
#### In one move, you can perform either of the following:
#### 1.If the pile is not empty, remove the topmost element of the pile.
#### 2.If there are one or more removed elements, add any one of them back onto the pile. This element becomes the new topmost element.

#### You are also given an integer k, which denotes the total number of moves to be made.

#### Return the maximum value of the topmost element of the pile possible after exactly k moves. 
#### In case it is not possible to obtain a non-empty pile after k moves, return -1.

##### Example 1:
#####    Input: nums = [5,2,2,4,0,6], k = 4
#####    Output: 5
##### Example 2: 
#####    Input: nums = [2], k = 1
#####    Output: -1


```
class Solution {
    public int maximumTop(int[] nums, int k) {
        if(k%2 == 1 && nums.length == 1){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            // < k-1 means searching the maximum between 0 ~ k-1
            // == k means the nums[k] has the maximum    
            if(i < k-1 || i == k){
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196231917-210c3e3f-2c92-41f5-b674-fb6a4627fa3b.png)
