# 457. Circular Array Loop

#### You are playing a game involving a circular array of non-zero integers nums.
#### Each nums[i] denotes the number of indices forward/backward you must move if you are located at index i:
#### If nums[i] is "positive", move nums[i] steps forward, and
#### If nums[i] is "negative", move nums[i] steps backward.

#### Since the array is circular, you may assume that moving forward from the last element puts you on the first element, 
#### and moving backwards from the first element puts you on the last element.
#### A cycle in the array consists of a sequence of indices seq of length k where:
#### 1.Following the movement rules above results in the repeating index sequence seq[0] -> seq[1] -> ... -> seq[k - 1] -> seq[0] -> ...
#### 2.Every nums[seq[j]] is either all positive or all negative.
#### 3.k > 1

#### Return true if there is a cycle in nums, or false otherwise.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/197190806-dae77dab-39cc-49de-955a-ccc713bc3468.png)
#####    Input: nums = [2,-1,1,2,2]
#####    Output: true
##### Example 2: 
![image](https://user-images.githubusercontent.com/97871497/197190856-bbd4befa-a8b9-453e-aa60-9b9eddc73c01.png)
#####    Input: nums = [-1,-2,-3,-4,-5,6]
#####    Output: false
##### Example 3: 
![image](https://user-images.githubusercontent.com/97871497/197190898-77276d7f-7a65-4d1b-a367-f899e9bbfc2b.png)
#####    Input: nums = [1,-1,5,1,4]
#####    Output: true


```
class Solution {
    public boolean circularArrayLoop(int[] nums) { 
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(i)){
                continue;
            }
            int current = i;

            while(checkLoop(i, current, nums)){
                map.put(current, i);

                current = (current + nums[current]) % nums.length;
                if(current < 0){
                    current += nums.length;
                }

                if(map.containsKey(current)){
                    if(map.get(current) == i){
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
    public boolean checkLoop(int start, int current, int[] nums){
        if((nums[start] > 0 && nums[current] < 0) || (nums[start] < 0 && nums[current] > 0) || nums[current]%nums.length == 0){
            return false;
        }
        return true;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197191155-5ddfe661-e81a-47b4-aa69-05479da125f4.png)
