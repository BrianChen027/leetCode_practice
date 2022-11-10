# 442. Find All Duplicates in an Array

#### Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice,
#### return an array of all the integers that appears twice.
#### You must write an algorithm that runs in O(n) time and uses only constant extra space.

##### Example 1:
#####    Input: nums = [4,3,2,7,8,2,3,1]
#####    Output: [2,3]
##### Example 2: 
#####    Input: nums = [1,1,2]
#####    Output: [1]

```
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.contains(i)){
                ans.add(i);
            }else{
                set.add(i);
            }
        }
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187748818-0db8196a-12f5-48e6-b058-fad59f0861c6.png)

