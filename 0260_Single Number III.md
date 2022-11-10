# 260. Single Number III

#### Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. 
#### Find the two elements that appear only once. You can return the answer in any order.
#### You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

##### Example 1:
#####    Input: nums = [1,2,1,3,2,5]
#####    Output: [3,5]
##### Example 2: 
#####    Input: nums = [-1,0]
#####    Output: [-1,0]

```
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)-1);
            }else{
                map.put(i, 1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i) == 1){
                set.add(i);
            }
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for(int j:set){
            ans[i] = j;
            i++;
        }
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187740832-c5b02cfe-fd74-4815-8906-0c9e7edf7250.png)
