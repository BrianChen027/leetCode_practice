# 922. Sort Array By Parity II

#### Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
#### Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
#### Return any answer array that satisfies this condition.

##### Example 1:
#####    Input: nums = [4,2,5,7]
#####    Output: [4,5,2,7]
##### Example 2: 
#####    Input: nums = [2,3]
#####    Output: nums = [2,3]


```
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        
        int countO = 0;
        int countE = 0;
        
        for(int n:nums){
            if(n%2 == 1){
                odd[countO++] = n;
            }else{
                even[countE++] = n;
            }
        }
        countO = 0;
        countE = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 1){
                nums[i] = odd[countO++];
            }else{
                nums[i] = even[countE++];
            }
        }
        
        return nums;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189713205-d7d7fc8f-4bae-42a8-96ec-e4f358e50997.png)
