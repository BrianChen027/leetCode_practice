# 26. Remove Duplicates from Sorted Array

#### Given an integer array nums sorted in non-decreasing order,
#### remove the duplicates in-place such that each unique element appears only once.
#### The relative order of the elements should be kept the same.

#### Since it is impossible to change the length of the array in some languages, 
#### you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

#### Return k after placing the final result in the first k slots of nums.

#### Do not allocate extra space for another array. 
#### You must do this by modifying the input array in-place with O(1) extra memory.
![image](https://user-images.githubusercontent.com/97871497/196332158-a2fb853f-d5a3-4b98-b06f-46662834bcc4.png)


##### Example 1:
#####    Input: nums = [1,1,2]
#####    Output: 2, nums = [1,2,_]
##### Example 2: 
#####    Input: nums = [0,0,1,1,1,2,2,3,3,4]
#####    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]


```
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i - 1] == nums[i]){
                len++;
            }
            nums[i - len] = nums[i];
        }
        return (nums.length - len);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196332265-f9174026-745a-4c97-a942-fe3e304582d1.png)
