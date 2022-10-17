# 11. Container With Most Water

#### You are given an integer array height of length n.
#### There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
#### Find two lines that together with the x-axis form a container, 
#### such that the container contains the most water.
#### Return the maximum amount of water a container can store.

#### Notice that you may not slant the container.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196164586-8064b1cd-26f4-4b80-ae2e-5bad235a0b87.png)
#####    Input: height = [1,8,6,2,5,4,8,3,7]
#####    Output: 49
##### Example 2: 
#####    Input: height = [1,1]
#####    Output: 1


```
class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if(height[left] <= height[right]){
                int tempL = height[left];
                while(left < right && height[left] <= tempL){
                    left++;
                }
            }else{
                int tempR = height[right];
                while(left < right && height[right] <= tempR){
                    right--;
                }
            }  
        }
        return maxArea;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196164706-6ed6da3b-d3ed-48b0-9b9b-a0558d696998.png)
