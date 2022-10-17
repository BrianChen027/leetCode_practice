# 8. String to Integer (atoi)

#### Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
#### The algorithm for myAtoi(string s) is as follows:
#### Read in and ignore any leading whitespace.
#### Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. 
#### This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.

### Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.

#### Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). 
#### If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
#### If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], 
#### then clamp the integer so that it remains in the range. 
#### Specifically, integers less than -2^31 should be clamped to -2^31, and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.
#### Return the integer as the final result.

## Concisely,
### 1.check if there is any shitespace
### 2.check if there is any sign of positive(+) or negative(-)
### 3.check fi there is any nondigit character, if yes return 0
### 4.turn the digit character into Integer

##### Example 1:
#####    Input: s = "42"
#####    Output: 42
##### Example 2: 
#####    Input: s = "   -42"
#####    Output: -42
##### Example 3: 
#####    Input: s = "4193 with words"
#####    Output: 4193


```
class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        if(s.length() == 0){
            return 0;
        }
        long number = 0;
        int sign = 1;
        int index = 0;

        if(s.charAt(index) == '-' || s.charAt(index) == '+'){
                if(s.charAt(index) == '-'){
                    sign = -1;
                }else{
                    sign = 1;
                }
                index++;    
        }

        while(index < s.length()){
            if(s.charAt(index) < '0' || s.charAt(index) > '9'){
                break;
            }
            number = number*10 + (s.charAt(index) - '0');
            if(number > Integer.MAX_VALUE){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            index++;
        }
        number = number*sign;
        return (int)number;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/196129304-a13d345d-f2c2-472b-956b-f18a89bc7122.png)
