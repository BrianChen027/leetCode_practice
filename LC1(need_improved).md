# 1. Two Sum

#### Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
#### You may assume that each input would have exactly one solution, and you may not use the same element twice.
#### You can return the answer in any order.

##### Example 1:
##### Input: nums = [2,7,11,15], target = 9
##### Output: [0,1]
##### Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int slow = 0;
        int fast = slow + 1;
        int result[] = new int[]{-1, -1};
        while(slow < nums.length-1){
            if((nums[slow] + nums[fast]) == target){
                result[0] = slow;
                result[1] = fast;
                return result;
            }
            if(fast == nums.length-1){
                slow++;
                fast = slow + 1;
                continue;
            }
            fast++;
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184320133-b5043120-cfb6-4511-a028-2d3d57737834.png)

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        if(nums == null || nums.length == 0){
            return result;
        } 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                result[0] = map.get(temp);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}

```
![image](https://user-images.githubusercontent.com/97871497/184582489-69423514-36ff-47b2-8658-ab172d891cd0.png)

