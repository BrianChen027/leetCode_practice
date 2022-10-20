# 22. Generate Parentheses

#### Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.


##### Example 1:
#####    Input: n = 3
#####    Output: ["((()))","(()())","(())()","()(())","()()()"]
##### Example 2: 
#####    Input: n = 1
#####    Output: ["()"]


```
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        listingTheSign(list, "", 0, 0, n);
        return list;
    }
    
    public void listingTheSign(List<String> list, String str, int leftS, int rightS, int n){
        if(str.length() == n*2){
            list.add(str);
            return;
        }
        
        if(leftS < n){
            listingTheSign(list, str+"(", leftS+1, rightS, n);
        }
        if(rightS < leftS){
            listingTheSign(list, str+")", leftS, rightS+1, n);
        }        
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197000975-126527b4-b5c9-4343-bd40-50e6ed86b02c.png)

