# 7. Reverse Integer

#### Given a signed 32-bit integer x, return x with its digits reversed.
#### If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

#### Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

##### Example 1:
#####    Input: x = 123
#####    Output: 321
##### Example 2: 
#####    Input: x = -123
#####    Output: -321

### Remember the range of the Integer: "if((result - x % 10) / 10 != temp)"
```
class Solution {
    public int reverse(int x) {
        int result = 0;
        int temp = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            //prevent the number is out of the range
            if((result - x % 10) / 10 != temp){
                return 0;
            }
            temp = result;
            x = x / 10;
            
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196126315-79a50d4e-931c-4f56-922b-d8cadde68fda.png)
