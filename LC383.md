# 383. Ransom Note

#### Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
#### Each letter in magazine can only be used once in ransomNote.

##### Example 1:
##### Input: ransomNote = "a", magazine = "b"
##### Output: false
##### Example 2:
##### Input: ransomNote = "aa", magazine = "aab"
##### Output: true

```
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int saving[] = new int[26];
        for(char c:magazine.toCharArray()){
            saving[c - 'a'] += 1;
        }
        for(char c:ransomNote.toCharArray()){
            if(saving[c - 'a'] > 0){
                saving[c - 'a'] -= 1;
            }else{
                return false;
            }
        }
        return true;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184361514-0951b26e-2615-4d3c-b15e-d2f144216f16.png)
