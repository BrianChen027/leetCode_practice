# 1137. N-th Tribonacci Number

#### The Tribonacci sequence Tn is defined as follows: 
#### T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
#### Given n, return the value of Tn.

##### Example 1:
#####    Input: n = 4
#####    Output: 4
##### Example 2: 
#####    Input: n = 25
#####    Output: 1389537


```
class Solution {
    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        if(n < 3){
            if(n == 0){
                return 0;
            }else{
                return 1;
            }
        }
        for(int i = 3; i <= n; i++){
            int temp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = temp;
        }
        return t2;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189464511-8d3a0ad2-4864-4293-bd6a-30957b62b85f.png)
