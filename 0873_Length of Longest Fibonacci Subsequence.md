# 873. Length of Longest Fibonacci Subsequence

#### A sequence x1, x2, ..., xn is Fibonacci-like if:
#### n >= 3
#### xi + xi+1 == xi+2 for all i + 2 <= n

#### Given a strictly increasing array arr of positive integers forming a sequence, return the length of the longest Fibonacci-like subsequence of arr. 
#### If one does not exist, return 0.
#### A subsequence is derived from another sequence arr by deleting any number of elements (including none) from arr, 
#### without changing the order of the remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].

##### Example 1:
#####    Input: arr = [1,2,3,4,5,6,7,8]
#####    Output: 5
##### Example 2: 
#####    Input: arr = [1,3,7,11,12,14,18]
#####    Output: 3


```
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] dp = new int[arr.length][arr.length];
        
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                dp[i][j] = 2;
            }
        }   
        for(int n = 0 ; n < arr.length ; n++){
            map.put(arr[n], n);
        }
        
        for(int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length ; j++){
                int temp = arr[i] + arr[j];
                if(map.containsKey(temp)){
                    int index = map.get(temp);
                    dp[j][index] = dp[i][j] + 1;
                }
                maxNum = Math.max(maxNum, dp[i][j]);
            }
        }
        
        if(maxNum == 2){
            return 0;
        }else{
            return maxNum;
        }  
    }
}

```

![image](https://user-images.githubusercontent.com/97871497/189590491-61e105a1-ee72-4872-928d-f7481802d353.png)
