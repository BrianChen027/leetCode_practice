# 13. Roman to Integer

#### Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

| Symbol |Value|
| --- | --- |
|  I  |  1    |
|  V  |  5    |
|  X  |  10   |
|  L  |  50   |
|  C  |  100  |
|  D  |  500  |
|  M  |  1000 |

#### For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. 
#### The number 27 is written as XXVII, which is XX + V + II.
#### Roman numerals are usually written largest to smallest from left to right.
#### However, the numeral for four is not IIII. Instead, the number four is written as IV. 
#### Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX.
#### There are six instances where subtraction is used:
- I can be placed before V (5) and X (10) to make 4 and 9. 
- X can be placed before L (50) and C (100) to make 40 and 90. 
- C can be placed before D (500) and M (1000) to make 400 and 900.
#### Given a roman numeral, convert it to an integer.

##### Example 1:
##### Input: s = "III"
##### Output: 3
##### Explanation: III = 3.
##### Example 2:
##### Input: s = "MCMXCIV"
##### Output: 1994
##### Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

```
class Solution {
    public int romanToInt(String s) {
        char ch[] = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] == 'I'){
                sum += 1;
            }else if(ch[i] == 'V'){
                if(i>0 && ch[i-1] == 'I') sum -= 2;
                sum += 5;
            }else if(ch[i] == 'X'){
                if(i>0 && ch[i-1] == 'I') sum -= 2;
                sum += 10;
            }else if(ch[i] == 'L'){
                if(i>0 && ch[i-1] == 'X') sum -= 20;
                sum += 50;
            }else if(ch[i] == 'C'){
                if(i>0 && ch[i-1] == 'X') sum -= 20;
                sum += 100;
            }else if(ch[i] == 'D'){
                if(i>0 && ch[i-1] == 'C') sum -= 200;
                sum += 500;
            }else if(ch[i] == 'M'){
                if(i>0 && ch[i-1] == 'C') sum -= 200;
                sum += 1000;
            }
        }     
        return sum;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184805285-cf64ef63-9681-456b-baf7-858c0c35961c.png)

