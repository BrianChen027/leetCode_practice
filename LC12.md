# 12. Integer to Roman

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
##### Input: num = 3
##### "III"
##### Explanation: 3 is represented as 3 ones.
##### Example 2:
##### Input: num = 1994
##### Output: "MCMXCIV"
##### Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

```
class Solution {
    public String intToRoman(int num) {
        String result = "";

        while(num > 0){
            if(num/1000 >= 1){
                int temp = num/1000;
                num = num - (temp*1000);
                while(temp > 0){
                    result += "M";
                    temp--;
                }
            }else if(num/100 >= 1){
                int temp = num/100;
                num = num - (temp*100);
                while(temp > 0){
                    if(temp == 9){
                        result += "CM";
                        temp -= 9;
                    }else if(temp >= 5){
                        result += "D";
                        temp -= 5;
                    }else if(temp == 4){
                        result += "CD";
                        temp -= 4;
                    }else{
                        result += "C";
                        temp--;
                    }
                }     
            }else if(num/10 >= 1){
                int temp = num/10;
                num = num - (temp*10);
                while(temp > 0){
                    if(temp == 9){
                        result += "XC";
                        temp -= 9;
                    }else if(temp >= 5){
                        result += "L";
                        temp -= 5;            
                    }else if(temp == 4){
                        result += "XL";
                        temp -= 4;
                    }else{
                        result += "X";
                        temp--;
                    }
                }     
            }else{
                while(num > 0){
                    if(num == 9){
                        result += "IX";
                        num -= 9;
                    }else if(num >= 5){
                        result += "V";
                        num -= 5;
                    }else if(num == 4){
                        result += "IV";
                        num -= 4;
                    }else{
                        result += "I";
                        num--;
                    }
                }
            }
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184828996-ae0a8d16-6081-4590-b9b5-b2bbe7b6e5e1.png)
