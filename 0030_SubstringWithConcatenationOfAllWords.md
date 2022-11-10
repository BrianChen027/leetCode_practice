# 30. Substring with Concatenation of All Words

#### You are given a string s and an array of strings words. All the strings of words are of the same length.
#### A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.

#### For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. 
#### "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
#### Return the starting indices of all the concatenated substrings in s. 
#### You can return the answer in any order.

##### Example 1:
#####    Input: s = "barfoothefoobarman", words = ["foo","bar"]
#####    Output: [0,9]
##### Example 2: 
#####    Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
#####    Output: []


```
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String w:words){
            //map.put(w, map.getOrDefault(w, 0) + 1);
            if(map.containsKey(w)){
                map.put(w, map.get(w) + 1);
            }else{
                map.put(w, 1);
            }
        }

        int sLen = s.length();
        int wNum = words.length;
        int wLen = words[0].length();

        for(int i = 0; i < (sLen - wNum*wLen) + 1; i++){
            HashMap<String, Integer> container = new HashMap<>();
            int j = 0;
            while(j < wNum){
                String word = s.substring(i + j*wLen, i + (j+1)*wLen);
                if(map.containsKey(word)){
                    if(container.containsKey(word)){
                        container.put(word, container.get(word)+1);
                    }else{
                        container.put(word, 1);
                    }
                    if(container.get(word) > map.get(word)){
                        break;
                    }
                }else{
                    break;
                }
                j++;
            }
            if(j == wNum){ // finding all the "words array"
                list.add(i);
            }
        }
        return list;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196357348-23ed962f-d7b1-4403-89e9-bd2187d3ab27.png)
