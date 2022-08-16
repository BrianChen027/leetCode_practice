# 9. Palindrome Number

#### Given an integer x, return true if x is palindrome integer.
#### An integer is a palindrome when it reads the same backward as forward.
#### For example, 121 is a palindrome while 123 is not.

##### Example 1:
##### Input: x = 121
##### Output: true
##### Explanation: 
##### 121 reads as 121 from left to right and from right to left.


```
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String s = String.valueOf(x);
        char ch[] = s.toCharArray();
        int button = ch.length - 1;
        for(int i = 0; i <= (ch.length/2); i++){
            if(ch.length%2 == 1){
                if(i >= (ch.length/2)){
                    return true;
                }
            }
            if(ch[i] != ch[button]){
                return false;
            }else{
                button--;
            }              
        }
        return true;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/184800746-b22a690a-f0dc-487b-9d4a-de7f4be4d0bc.png)

