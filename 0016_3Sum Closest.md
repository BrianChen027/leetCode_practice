# 16. 3Sum Closest

#### Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
#### Return the sum of the three integers.
#### You may assume that each input would have exactly one solution.

##### Example 1:
##### Input: nums = [-1,2,1,-4], target = 1
##### Output: 2
##### Explanation: 
##### The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).


```
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left;
        int right;
        int sum;
        int num[] = new int[3];
        int closeNum = Integer.MAX_VALUE;
        int total = 0;
        for(int i = 0; i <= nums.length-3 ; i++){
            left = i+1;
            right = nums.length-1;
            while(right > left){
                sum = nums[i] + nums[left] + nums[right];
                if((sum - target) == 0){
                    return target;
                }
                if(Math.abs(sum - target) < closeNum ){
                    closeNum = Math.abs(sum - target);
                    num[0] = nums[i];
                    num[1] = nums[left];
                    num[2] = nums[right];
                }
                
                int l = Math.abs((nums[i]+nums[left+1]+nums[right])-target);
                int r = Math.abs((nums[i]+nums[left]+nums[right-1])-target);
                
                if(l<r){
                    left++;
                }else{
                    right--;
                }
            }     
        }
        for(int s:num){
            total+=s;
        }
        return total;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/184796275-9301d974-c490-4657-b9a8-fc614c6b936b.png)

