# 17. Letter Combinations of a Phone Number

#### Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
#### Return the answer in any order.
#### A mapping of digits to letters (just like on the telephone buttons) is given below. 
#### Note that 1 does not map to any letters.
![image](https://user-images.githubusercontent.com/97871497/197004562-984f76ea-17b6-4126-878b-a83922fda793.png)


##### Example 1:
#####    Input: digits = "23"
#####    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
##### Example 2: 
#####    Input: digits = ""
#####    Output: []


```
class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, Character[]> map = new HashMap<>();
        map = setUp(map);
        
        List<String> list = new ArrayList<>();
        int n = digits.length();
        if(n == 0){
            return list;
        }
        
        int numbersPos = posibilityNum(digits);
        for(int i = 0; i < numbersPos; i++){
            String result = "";
            int indexTemp = i;
            for(int j = 0; j < n; j++){
                
                if(digits.charAt(j) == '7' || digits.charAt(j) == '9'){
                    result += map.get(digits.charAt(j))[indexTemp % 4];
                    indexTemp = indexTemp / 4;
                }else{
                    result += map.get(digits.charAt(j))[indexTemp % 3];
                    indexTemp = indexTemp / 3;
                }
                
            }
            list.add(result);
        }
        return list;
    }
    
    public HashMap<Character, Character[]> setUp(HashMap<Character, Character[]> map){
        map.put('2', new Character[]{'a','b','c'});
        map.put('3', new Character[]{'d','e','f'});
        map.put('4', new Character[]{'g','h','i'});
        map.put('5', new Character[]{'j','k','l'});
        map.put('6', new Character[]{'m','n','o'});
        map.put('7', new Character[]{'p','q','r','s'});
        map.put('8', new Character[]{'t','u','v'});
        map.put('9', new Character[]{'w','x','y','z'});       
        return map;
    }
    
    public int posibilityNum(String digits){
        int total = 1;
        for(int i = 0; i < digits.length(); i++){
            if(digits.charAt(i) == '7' || digits.charAt(i) == '9'){
                total *= 4;
            }else{
                total *= 3;
            }
        }
        return total;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197004387-2623dbcd-8a31-4d52-87a0-a419cf540e8f.png)

