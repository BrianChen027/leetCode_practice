# 136. Single Number

#### Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
#### You must implement a solution with a linear runtime complexity and use only constant extra space.

##### Example 1:
#####    Input: nums = [2,2,1]
#####    Output: 1
##### Example 2: 
#####    Input: nums = [4,1,2,1,2]
#####    Output: 4

```
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, 0);
            }else{
                map.put(i, 1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i) != 0){
                return i;
            }
        }
        return 0;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187668982-82613b31-7b33-414d-94fa-d10351c8c39a.png)
