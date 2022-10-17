# 3. Longest Substring Without Repeating Characters

#### Given a string s, find the length of the longest substring without repeating characters.

##### Example 1:
#####    Input: s = "abcabcbb"
#####    Output: 3
##### Example 2: 
#####    Input: s = "bbbbb"
#####    Output: 1

```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int max = 1;
        for(int i = 0; i < s.length() ; i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int temp = 1;
            for(int j = i + 1; j < s.length() ; j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    temp++;
                }else{
                    break;
                }
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196113983-a411d8e7-a3a8-4007-81f9-8dbf2594db76.png)
