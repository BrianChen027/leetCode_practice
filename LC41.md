# 41. First Missing Positive

#### Given an unsorted integer array nums, return the smallest missing positive integer.
#### You must implement an algorithm that runs in O(n) time and uses constant extra space.

##### Example 1:
#####    Input: nums = [1,2,0]
#####    Output: 3
##### Explanation: The numbers in the range [1,2] are all in the array.
##### Example 2: 
#####    Input: nums = [3,4,-1,1]
#####    Output: 2
##### Explanation: 1 is in the array but 2 is missing.


```
class Solution {
    public int firstMissingPositive(int[] nums) {    
        nums = findPosNum(nums);
        Arrays.sort(nums);
        if(nums.length == 0){
            return 1;
        }
        if(nums[0] != 1){
            return 1;
        }else{
            int count = 0;
            while(count <= nums.length-2){
                if(nums[count]+1 != nums[count+1]){
                    return nums[count]+1;
                }
                count++;
            }
            return nums[count]+1;       
        }
    }
    
    private int[] findPosNum(int[] arr){
        HashSet<Integer> set = new HashSet<>();      
        for(int i:arr){
            if(i > 0){
                set.add(i);              
            }
        }
        int[] temp = new int[set.size()];
        int index = 0;
        for(int i:set){
            temp[index] = i;
            index++;
        }
        return temp;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187662727-f7c27407-b8a0-4f2f-a231-2bbc253016bd.png)

