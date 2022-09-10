# 1523. Count Odd Numbers in an Interval Range

#### Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

##### Example 1:
#####    Input: low = 3, high = 7
#####    Output: 3
##### Example 2: 
#####    Input: low = 8, high = 10
#####    Output: 1


```
class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 1){
            return (high - low)/2 + 1; 
        }else{
            if(high % 2 == 1){
                return (high - low)/2 + 1; 
            }else{
                return (high - low)/2;
            }
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189464455-48d8f7f3-f4a4-47b5-b06b-e7d815390e85.png)
