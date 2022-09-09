# 2221. Find Triangular Sum of an Array

#### You are given a 0-indexed integer array nums, where nums[i] is a digit between 0 and 9 (inclusive).
#### The triangular sum of nums is the value of the only element present in nums after the following process terminates:

#### Let nums comprise of n elements. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n - 1.
#### For each index i, where 0 <= i < n - 1, assign the value of newNums[i] as (nums[i] + nums[i+1]) % 10, where % denotes modulo operator.
#### Replace the array nums with newNums.
#### Repeat the entire process starting from step 1.

#### Return the triangular sum of nums.

![image](https://user-images.githubusercontent.com/97871497/189286366-4b53cd6b-4f6c-4265-9a40-6df9c539db6e.png)
#####    Input: nums = [1,2,3,4,5]
#####    Output: 8

#### Pascal Version
```
class Solution {
    public int triangularSum(int[] nums) {
   
        int count = nums.length;
        List<List<Integer>> triArr = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int n:nums){
            arr.add(n);
        }
        triArr.add(arr);
        while(count > 0){
            int i = 0;
            List<Integer> arr2 = new ArrayList<>();
            while(i < count-1){
                int temp = (triArr.get(nums.length-count).get(i)+triArr.get(nums.length-count).get(i+1))%10;   
                i++;
                arr2.add(temp);
            }
            triArr.add(arr2);
            count--;
        }
        return triArr.get(nums.length-1).get(0);
        
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/189286787-6d1b45d6-7cdc-4d24-8568-826d9ef9cfc2.png)


#### Recover Array Version
```
class Solution {
    public int triangularSum(int[] nums) {
        
        int count = nums.length;        
        while(count > 0){
            int i = 0;
            while(i <= count - 2){
                int temp = (nums[i] + nums[i+1])%10;
                nums[i] = temp;
                i++;
            }
            count--;      
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189286635-b1218eec-7575-43ab-96ea-6d4f7fb6c220.png)
