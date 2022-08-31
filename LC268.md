# 268. Missing Number

#### GGiven an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
#### There is only one repeated number in nums, return this repeated number.
#### You must solve the problem without modifying the array nums and uses only constant extra space.

##### Example 1:
##### Input: nums = [3,0,1]
##### Output: 2
##### Explanation: 
##### n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

##### Example 2: 
##### Input: nums = [0,1]
##### Output: 2
##### Explanation: 
##### n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

#### Normal Searchimg Version

```
class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        for(int i = 0; i <= length-2; i++){
            if(nums[i]+1 != nums[i+1]){
                return nums[i]+1;
            }
        }
        return length;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187665035-0c13504c-efef-4e9d-a706-4ef490added3.png)

#### Using the difference to find the number Version

```
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int idealNum = (1 + nums.length)*(nums.length)/2;
        for(int i:nums){
            sum += i;
        }
        return idealNum - sum;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187665269-c04165a7-320a-4bfb-942b-f9979c62c846.png)
