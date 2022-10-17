# 1002. Find Common Characters

#### Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates).
#### You may return the answer in any order.

##### Example 1:
#####    Input: words = ["bella","label","roller"]
#####    Output: ["e","l","l"]
##### Example 2: 
#####    Input: words = ["cool","lock","cook"]
#####    Output: ["c","o"]


```
class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> arr = new ArrayList<String>();
        int[] temp = getNumOfAph(words[0]);
        
        for(int i = 1; i <= words.length-1; i++){
            int[] current = temp;
            temp = getCommonNum(current, getNumOfAph(words[i]));
        }
        for(int i = 0;i <= 25 ; i++){
            int count = temp[i];
            while(count != 0){
                arr.add(Character.toString(i + 'a')); 
                count--;
            }
        }    
        return arr;
    }
    
    public int[] getNumOfAph(String str){
        int[] abc = new int[26];
        for(int i = 0; i <= str.length()-1; i++){
            abc[str.charAt(i) - 'a']++;
        }
        return abc;
    }
    
    public int[] getCommonNum(int[] w1, int[] w2){
        int[] temp = new int[26];
        for(int i = 0; i <= 25 ; i++){
            temp[i] = Math.min(w1[i], w2[i]);
        }
        return temp;
    } 
}
```

![image](https://user-images.githubusercontent.com/97871497/189911579-fbc9a9be-9f95-41a2-a8cd-770f558304dd.png)
