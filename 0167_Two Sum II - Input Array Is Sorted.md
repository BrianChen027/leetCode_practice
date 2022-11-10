# 167. Two Sum II - Input Array Is Sorted

#### Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
#### Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
#### Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
#### The tests are generated such that there is exactly one solution. You may not use the same element twice.
#### Your solution must use only constant extra space.

##### Example 1:
#####    Input: numbers = [2,7,11,15], target = 9
#####    Output: [1,2]
##### Example 2: 
#####    Input: numbers = [2,3,4], target = 6
#####    Output: [1,3]


```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] ans = new int[2];
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189912017-97fc5a8e-a48f-4fc9-a32f-343a62e9d052.png)
