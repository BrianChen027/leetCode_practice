# 2155. All Divisions With the Highest Score of a Binary Array

#### You are given a 0-indexed binary array nums of length n. nums can be divided at index i (where 0 <= i <= n)
#### into two arrays (possibly empty) numsleft and numsright:

#### numsleft has all the elements of nums between index 0 and i - 1 (inclusive), while numsright has all the elements of nums between index i and n - 1 (inclusive).
#### If i == 0, numsleft is empty, while numsright has all the elements of nums.
#### If i == n, numsleft has all the elements of nums, while numsright is empty.

#### The division score of an index i is the sum of the number of 0's in numsleft and the number of 1's in numsright.
#### Return all distinct indices that have the highest possible division score. You may return the answer in any order.

##### Example 1:
#####    Input: nums = [0,0,1,0]
#####    Output: [2,4]
##### Example 2: 
#####    Input: nums = [0,0,0]
#####    Output: [3]


```
class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int rightNum = 0;
        for(int i:nums){
            if(i == 1){
                rightNum++;
            }
        }
        
        int leftNum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= nums.length-1; i++){
            int temp = rightNum + leftNum;
            max = Math.max(max, temp);        
            if(nums[i] == 0){
                leftNum++;
            }else{
                rightNum--;
            }
            nums[i] = temp;            
        }
        
        max = Math.max(max, leftNum);
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= nums.length-1 ; i++){
            if(nums[i] == max){
                list.add(i);
            }
        }
        
        if(leftNum == max){
            list.add(nums.length);
        }
        return list;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189464113-83e643dd-ded0-480e-9d5e-5652e96b6fd9.png)
