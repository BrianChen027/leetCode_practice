# 509. Fibonacci Number

#### The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
#### such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
#### F(0) = 0, F(1) = 1
#### F(n) = F(n - 1) + F(n - 2), for n > 1.

##### Example 1:
#####    Input: n = 2
#####    Output: 1
##### Example 2: 
#####    Input: n = 3
#####    Output: 2

#### Version 1
```
class Solution {
    public int fib(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int left = 0;
        int right = 1;
        for(int i = 2 ; i <= n ; i++){
            int temp = left + right;
            left = right;
            right = temp;
        }
        return right;
    }
}
```
#### Version 2
```
class Solution {
    public int fib(int n) {
        int[] fb = new int[n+1];     
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        fb[0] = 0;
        fb[1] = 1;
        for(int i = 2; i <= n ; i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
        return fb[n];
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/189471529-023b4f00-e3a7-456a-b0a2-c068cce4d098.png)
