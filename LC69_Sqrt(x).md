# 69. Sqrt(x)

#### Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
#### The returned integer should be non-negative as well.
#### You must not use any built-in exponent function or operator. (ex: pow(x, 0.5))

##### Example 1:
#####    Input: x = 4
#####    Output: 2
##### Example 2: 
#####    Input: x = 8
#####    Output: 2
#####    Explaination: The square root of 8 is 2.82842...


```
class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }

        int ancher = 1;
        while(ancher < (x / ancher)){
            ancher = 2 * ancher;
        }

        if(ancher == x / ancher){
            return ancher;
        }

        int start = x / ancher;
        int end = ancher;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == x / mid){
                return mid;
            }else if(mid < x / mid){
                ancher = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ancher;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196700985-f482420e-823c-48d4-b8c7-baa3f0e66570.png)
