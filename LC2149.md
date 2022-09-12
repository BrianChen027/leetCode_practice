# 2149. Rearrange Array Elements by Sign

#### You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
#### You should rearrange the elements of nums such that the modified array follows the given conditions:
#### Every consecutive pair of integers have opposite signs.
#### For all integers with the same sign, the order in which they were present in nums is preserved.
#### The rearranged array begins with a positive integer.

#### Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

##### Example 1:
#####    Input: nums = [3,1,-2,-5,2,-4]
#####    Output: [3,-2,1,-5,2,-4]


```
class Solution {
    public int[] rearrangeArray(int[] nums) {        
        int[] boxP = new int[nums.length/2];
        int[] boxN = new int[nums.length/2];
        
        int count1= 0;
        int count2= 0;
        
        for(int i:nums){
            if(i > 0){
                boxP[count1] = i;
                count1++;
            }else{
                boxN[count2] = i;
                count2++;
            }
        }
        
        count1= 0;
        count2= 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                nums[i] = boxP[count1++];
            }else{
                nums[i] = boxN[count2++];
            }
        }
        return nums;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189712236-7d36ed27-adf1-45b3-9637-b7feee09e363.png)
