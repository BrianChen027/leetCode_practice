# 31. Next Permutation

#### A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
#### For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

#### The next permutation of an array of integers is the next lexicographically greater permutation of its integer. 
#### More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, 
#### then the next permutation of that array is the permutation that follows it in the sorted container. 
#### If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

### Example: [1,2,3] -> [1,3,2] ; [3,2,1] -> [1,2,3]

#### Given an array of integers nums, find the next permutation of nums.
#### The replacement must be in place and use only constant extra memory.

##### Example 1:
#####    Input: nums = [1,2,3]
#####    Output: [1,3,2]
##### Example 2: 
#####    Input: nums = [1,1,5]
#####    Output: [1,5,1]


```
class Solution {
    public void nextPermutation(int[] nums) {
        // 4 3 2 1 --> point = -1 // 1 2 3 4 --> point = 2 // 1 2 4 3 --> point = 1
        int point = -1;
        for(int i = (nums.length-1) - 1 ; i >= 0 ; i--){
            if(nums[i + 1] > nums[i]){
                point = i;
                break;
            }
        }
        // it means this arrays is decreasing ex:5 4 3 2 1
        if(point == -1){
            reverse(nums, 0, nums.length-1); // -->1 2 3 4 5
            return;
        }
//--------------------------------------------------------------
        // finding a number greater than "point"
        for(int i = nums.length - 1; i >= 0 ; i--){
            if(nums[i] > nums[point]){
                int temp = nums[i];
                nums[i] = nums[point];
                nums[point] = temp;
                break;
            }
        }
        reverse(nums, point + 1, nums.length-1);
    }

    public void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196400958-68a88b48-5346-495b-b13a-e4d0b33be647.png)
