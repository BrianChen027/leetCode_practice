# 38. Count and Say

#### The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
#### 1.countAndSay(1) = "1"
#### 2.countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
#### To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. 
#### Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.

### Example:
### 2211423 -> two 2 two 1 one 4 one 2 one 3 -> 22 21 14 12 13
### countAndSay(1) -> "1" ; countAndSay(2) -> "11" ; countAndSay(3) -> "21"

#### Example 1:
#####    Input: n = 1
#####    Output: "1"
#### Example 2: 
#####    Input: n = 4
#####    Output: "1211"

### Using StringBuilder Version
```
class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        StringBuilder str = new StringBuilder("1");
        int count = 1;
        while(count < n){
            str = turnToNextLevel(str);
            count++;
        }
        return str.toString();
    }
    public StringBuilder turnToNextLevel(StringBuilder str){
        int i = 0;
        int j = 0;
        int count = 0;
        StringBuilder result = new StringBuilder("");
        while(i < str.length() && j < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }else{
                result.append(count).append(str.charAt(i)); 
                i = j;
                count = 0;
            }
        }
        result.append(count).append(str.charAt(i)); 
        return result;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/197436798-c4b65470-9e4c-4e79-bcbf-0493a10b8336.png)

### Using String Version
```
class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String str = "1";
        int count = 1;
        while(count < n){
            str = turnToNextLevel(str);
            count++;
        }
        return str;
    }
    public String turnToNextLevel(String str){
        int i = 0;
        int j = 0;
        int count = 0;
        String result = "";
        while(i < str.length() && j < str.length()){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }else{
                result += String.valueOf(count); 
                result += str.charAt(i);
                i = j;
                count = 0;
            }
        }
        result += String.valueOf(count); 
        result += str.charAt(i);
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197436851-c4cf70f6-9322-4774-8e36-77afd94a20c0.png)
