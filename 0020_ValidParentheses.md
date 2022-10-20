# 20. Valid Parentheses

#### Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
#### An input string is valid if:
#### Open brackets must be closed by the same type of brackets.
#### Open brackets must be closed in the correct order.
#### Every close bracket has a corresponding open bracket of the same type.


####  Example 1:
#####    Input: s = "()"
#####    Output: true
####  Example 2: 
#####    Input: s = "()[]{}"
#####    Output: true
####  Example 3: 
#####    Input: s = "(]"
#####    Output: false


```
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if(stack.empty()){
                return false;
            }else if(c == ')' && stack.pop() != '('){
                return false;
            }else if(c == ']' && stack.pop() != '['){
                return false;
            }else if(c == '}' && stack.pop() != '{'){
                return false;
            }
        }
        return stack.empty();
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196999937-64e55f74-3811-46da-9575-253468388cf2.png)

