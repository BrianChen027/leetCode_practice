# 32. Longest Valid Parentheses

#### Given a string containing just the characters '(' and ')', 
#### find the length of the longest valid (well-formed) parentheses substring.


##### Example 1:
#####    Input: s = "(()"
#####    Output: 2
##### Example 2: 
#####    Input: s = ")()())"
#####    Output: 4


```
class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                
                if(stack.empty()){
                    stack.push(i);
                }
                int length = i - stack.peek();
                
                max = Math.max(max, length);
                
            }
        }
        return max;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197014083-b9ea1de3-a76c-4f15-8170-25f42fccb29a.png)

