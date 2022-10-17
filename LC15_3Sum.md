# 15. 3Sum

#### Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
#### such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

#### Notice that the solution set must not contain duplicate triplets.

##### Example 1:
#####    Input: nums = [-1,0,1,2,-1,-4]
#####    Output: [[-1,-1,2],[-1,0,1]]
##### Example 2: 
#####    Input: nums = [0,1,1]
#####    Output: []


```
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i >= 1 && nums[i] == nums[i-1]){
                continue;
            }
            
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int total = nums[i] + nums[left] + nums[right];
                if(total > 0){
                    right--;
                }else if(total < 0){
                    left++;
                }else{
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(right > left && nums[right] == nums[right-1]){
                        right--;
                    }
                    while(right > left && nums[left] == nums[left+1]){
                        left++;
                    }
                    left++;
                    right--;
                }
            }
        }
        return list;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196166124-b4386c15-40a6-4279-8052-dbc8427678e3.png)
