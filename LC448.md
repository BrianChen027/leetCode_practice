# 448. Find All Numbers Disappeared in an Array

#### Given an array nums of n integers where nums[i] is in the range [1, n], 
#### return an array of all the integers in the range [1, n] that do not appear in nums.

##### Example 1:
#####    Input: nums = [4,3,2,7,8,2,3,1]
#####    Output: [5,6]
##### Example 2: 
#####    Input: nums = [1,1]
#####    Output: [2]

```
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {        
        HashSet<Integer> setStore = new HashSet<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i:nums){
            setStore.add(i);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!setStore.contains(i)){
                ans.add(i);
            }
        }        
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187745651-e383e315-a06e-4099-a394-1b5893600d34.png)

