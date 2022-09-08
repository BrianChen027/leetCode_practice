# 387. First Unique Character in a String

#### Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

##### Example 1:
#####    Input: s = "leetcode"
#####    Output: 0
##### Example 2: 
#####    Input: s = "loveleetcode"
#####    Output: 2


```
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        int count = 0;
        for(char c:s.toCharArray()){
            if(map.get(c) == 1){
                return count;
            }
            count++;
        }
        
        return -1;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189108544-74d52fef-a558-436f-a79c-7f6fb035305d.png)
