# 14. Longest Common Prefix

#### Write a function to find the longest common prefix string amongst an array of strings.
#### If there is no common prefix, return an empty string "".

##### Example 1:
#####    strs = ["flower","flow","flight"]
#####    Output: "fl"
##### Example 2: 
#####    strs = ["dog","racecar","car"]
#####    Output: ""


```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for(String s:strs){
            minLen = Math.min(minLen, s.length());
        }

        for(int i = 0 ; i < minLen ; i++){
            for(int j = 0 ; j < strs.length ; j++){
                if(strs[0].charAt(i) == strs[j].charAt(i)){
                    continue;
                }else{
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLen);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196165497-ae4af102-88f2-4c24-a759-a6044f8fe423.png)
