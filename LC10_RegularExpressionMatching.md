# 10. Regular Expression Matching

#### Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
### '.' Matches any single character.
### '*' Matches zero or more of the preceding element.
#### The matching should cover the entire input string (not partial).

##### Example 1:
#####    Input: s = "aa", p = "a"
#####    Output: false
##### Example 2: 
#####    Input: s = "aa", p = "a*"
#####    Output: true
##### Example 3: 
#####    Input: s = "ab", p = ".*"
#####    Output: true


```
class Solution {
    public boolean isMatch(String s, String p) {
        if(s.length() == 0 || p.length() == 0){
            return false;
        }

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for(int j = 0 ; j < p.length() ; j++){
            if(p.charAt(j) == '*' && dp[0][j - 1]){
                dp[0][j + 1] = true;
            }
        }

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = 0 ; j < p.length() ; j++){
                if(p.charAt(j) == '.'){
                    dp[i+1][j+1] = dp[i][j];
                }
                if(s.charAt(i) == p.charAt(j)){
                    dp[i+1][j+1] = dp[i][j];
                }
                if(p.charAt(j) == '*'){
                    if(s.charAt(i) != p.charAt(j - 1) && p.charAt(j - 1) != '.'){
                        dp[i+1][j+1] = dp[i+1][j-1];
                    }else{
                        dp[i+1][j+1] = (dp[i][j+1] || dp[i+1][j] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196161170-d54bc538-75aa-4eaa-9509-2715c6a2db00.png)
