# 2351. First Letter to Appear Twice

#### Given a string s consisting of lowercase English letters, return the first letter to appear twice.

#### A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
#### s will contain at least one letter that appears twice.

##### Example 1:
#####    Input: s = "abccbaacz"
#####    Output: "c"
##### Example 2: 
#####    Input: s = "abcdd"
#####    Output: "d"


```
class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){          
                return c;
            }else{
                map.put(c, 1);
            }
        }
        return '0';
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189110912-6ae9e42a-adee-4cd7-9462-41b95a7adbc3.png)
