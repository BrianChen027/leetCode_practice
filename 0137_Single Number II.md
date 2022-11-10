# 137. Single Number II

#### Given an integer array nums where every element appears three times except for one, which appears exactly once.
#### Find the single element and return it.
#### You must implement a solution with a linear runtime complexity and use only constant extra space.

##### Example 1:
#####    Input: nums = [2,2,3,2]
#####    Output: 3
##### Example 2: 
#####    Input: nums = [0,1,0,1,0,1,99]
#####    Output: 99

```
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187739836-fd4d217b-c8c8-47ff-8a47-be5087d15aae.png)
