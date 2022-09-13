# 152. Maximum Product Subarray

#### Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
#### The test cases are generated so that the answer will fit in a 32-bit integer.
####  subarray is a contiguous subsequence of the array.


##### Example 1
##### Input: nums = [2,3,-2,4]
##### Output: 6
##### Explanation: [2,3] has the largest product 6.

##### Example 2
##### Input: nums = [-2,0,-1]
##### Output: 0
##### Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

```
class Solution {
    public int maxProduct(int[] nums) {
        int multi = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i <= nums.length-1 ; i++){
            int j = i+1;
            int temp = 1;
            temp = temp * nums[i];
            if(nums[i] > multi){
                multi = nums[i];
            }
            if(i != nums.length-1){
                for(; j <= nums.length-1;j++){   
                    if(nums[j] != 0){
                        temp = temp * nums[j];
                        if(temp > multi){
                            multi = temp;
                        }
                    }else{
                        break;
                    }
                }
            }
        }        
        return multi;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189941934-9163ab07-7c37-4dd6-930e-b1b74dde7bbf.png)
