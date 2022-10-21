# 453. Minimum Moves to Equal Array Elements

#### Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
#### In one move, you can increment n - 1 elements of the array by 1.


##### Example 1:
#####    Input: nums = [1,2,3]
#####    Output: 3
#####    Explaination: 1.[1,2,3]
![image](https://user-images.githubusercontent.com/97871497/197132546-8835c89a-a082-446b-ab4a-5ec760380f17.png)
#####    2.[2,3,3]
![image](https://user-images.githubusercontent.com/97871497/197132571-4c61a719-91ae-4138-9523-00535da147c2.png)
#####    3.[3,4,3]
![image](https://user-images.githubusercontent.com/97871497/197132593-1032d276-f379-4ac0-a828-d58d86429c1c.png)
#####    4.[4,4,4]
![image](https://user-images.githubusercontent.com/97871497/197132619-b8661144-ca18-41c0-9527-74c81db70b82.png)

##### Example 2: 
#####    Input: nums = [1,1,1]
#####    Output: 0


```
class Solution {
    public int minMoves(int[] nums) {
        int total = 0;
        int min = Integer.MAX_VALUE;
        for(int n:nums){
            min = Math.min(min, n);
        }
        for(int i = 0 ; i < nums.length ; i++){
            total += (nums[i] - min);
        }
        return total;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197132943-80b0546d-0840-47ce-8c8b-a30a8a039b9c.png)

