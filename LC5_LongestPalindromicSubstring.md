# 5. Longest Palindromic Substring

#### Given a string s, return the longest palindromic substring in s.

#### A string is called a palindrome string if the reverse of that string is the same as the original string.

##### Example 1:
#####    Input: s = "babad"
#####    Output: "bab" or "aba"
##### Example 2: 
#####    Input: s = "cbbd"
#####    Output: "bb"


```
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
            return s.substring(0,1);
        }
        String result = "";
        int max = 0;
        for(int i = 0 ; i < s.length() - 1; i++){
            String temp = findingTool(i, i, s);
            if(temp.length() > max){
                max = temp.length();
                result = temp;
            }

            temp = findingTool(i, i + 1, s);
            if(temp.length() > max){
                max = temp.length();
                result = temp;
            }
        }
        return result;    
    }

    public String findingTool(int left, int right, String str){  
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1, right);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196122015-02b00367-3296-443c-9d6c-6a350f0458e9.png)
