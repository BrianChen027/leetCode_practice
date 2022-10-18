# 28. Find the Index of the First Occurrence in a String

#### Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
#### or -1 if needle is not part of haystack.

##### Example 1:
#####    Input: haystack = "sadbutsad", needle = "sad"
#####    Output: 0
##### Example 2: 
#####    Input: haystack = "leetcode", needle = "leeto"
#####    Output: -1


```
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0){
            return 0;
        }
        if(needle.length() == 0){
            return -1;
        }
        for(int i = 0; i < haystack.length() ; i++){
            for(int j = 0; j < needle.length(); j++){
                if(needle.charAt(j) != haystack.charAt(i + j)){
                    break;
                }
                if(i+needle.length() > haystack.length()){
                    return -1;
                }
                if(j == needle.length()-1){
                    return i;
                }
            }
        }

        return -1;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196334817-07e4ab24-8e89-4deb-b401-422b83bcd8c4.png)
