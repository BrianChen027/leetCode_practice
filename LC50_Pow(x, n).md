# 50. Pow(x, n)

#### Implement pow(x, n), which calculates x raised to the power n (i.e., xn).


##### Example 1:
#####    Input: x = 2.00000, n = 10
#####    Output: 1024.00000
##### Example 2: 
#####    Input: x = 2.10000, n = 3
#####    Output: 9.26100
##### Example 3: 
#####    Input: x = 2.00000, n = -2
#####    Output: 0.25000


```
class Solution {
    public double myPow(double x, int n) {
        if(x == 1){
            return 1;
        }
        if(x == -1){
            if(n % 2 == 0){
                return 1;
            }else{
                return -1;
            }
        }
        // avoid the Integer MIN situation
        if(n == Integer.MIN_VALUE){
            return 0;
        }
//---------------------------------------------------
        double total = 1;
        if(n < 0){
            n = -n;
            while(n > 0){
                total *= x;
                n--;
            }
            return 1.00 / total;
        }else if(n == 0){
            return (double)1;
        }
//---------------------------------------------------
        while(n > 0){
            total *= x;
            n--;
        }
        return total;

    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196703977-76a8642f-3f0b-4408-82ad-0d4fe7466c6c.png)
