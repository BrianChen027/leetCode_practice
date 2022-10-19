# 58. Length of Last Word

#### Given a string s consisting of words and spaces, return the length of the last word in the string.
#### A word is a maximal substring consisting of non-space characters only.

##### Example 1:
#####    Input: s = "Hello World"
#####    Output: 5
##### Example 2: 
#####    Input: s = "   fly me   to   the moon  "
#####    Output: 4


```
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            if(s.charAt(i) != ' '){
                len++;
            }else{
                break;
            }
        }
        return len;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196700315-81a0e41b-db05-458e-845d-fb219dafbc63.png)
