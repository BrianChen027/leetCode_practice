# 132. Palindrome Partitioning II

#### Given a string s, partition s such that every substring of the partition is a palindrome.
#### Return the minimum cuts needed for a palindrome partitioning of s.

##### Example 1:
#####    Input: s = "aab"
#####    Output: 1
#####    Explaination: ["aa","b"]
##### Example 2: 
#####    Input: s = "a"
#####    Output: 0


```
class Solution {
    public int minCut(String s) {
        if(s.length() < 2){
            return 0;
        }

        boolean[][] flagTF = new boolean[s.length()][s.length()];
        flagTF[0][0] = flagTF[1][1] = true;
        if(s.charAt(0) == s.charAt(1)){
            flagTF[0][1] = true;
        }
        int[] dp = new int[s.length()];
        // dp[0] doesn't matter;
        if(flagTF[0][1]){
            dp[1] = 0;
        }else{
            dp[1] = 1;
        }

        for(int i = 2; i < s.length() ; i++){
            dp[i] = dp[i - 1] + 1;
            flagTF[i][i] = true; 
            for(int j = 0 ; j < i ; j++){
                if(s.charAt(j) == s.charAt(i)){
                    if(j == i-1){
                        dp[i] = Math.min(dp[i], dp[i-2] + 1);
                        flagTF[j][i] = true;
                    }else if(flagTF[j+1][i-1]){
                        if(j == 0){
                            dp[i] = 0;
                        }else{
                            dp[i] = Math.min(dp[i], dp[j-1] + 1);
                        }
                        flagTF[j][i] = true;
                    }
                }
                // else{} -> just pass to next index
            }
        }

        return dp[s.length()-1];
        
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196184236-750ca6fa-b99b-44f3-aaaf-891b3917cabf.png)
