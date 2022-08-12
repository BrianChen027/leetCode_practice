# 242. Valid Anagram

#### Given two strings s and t, return true if t is an anagram of s, and false otherwise.
#### An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

##### Example 1:
##### Input: s = "anagram", t = "nagaram"
##### Output: true

```
class Solution {
    public boolean isAnagram(String s, String t) {
        int ans[] = new int[26];
        for(char c:s.toCharArray()){
            ans[c - 'a'] += 1;
        }
        for(char c:t.toCharArray()){
            ans[c - 'a'] -= 1;
        }
        for(int i:ans){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/184339548-9f5061c2-8653-458f-a1a3-e8c8e0a1e4b9.png)
