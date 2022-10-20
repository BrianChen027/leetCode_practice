# 2337. Move Pieces to Obtain a String

#### You are given two strings start and target, both of length n. Each string consists only of the characters 'L', 'R', and '_' where:
#### The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if there is a blank space directly to its left, 
#### and a piece 'R' can move to the right only if there is a blank space directly to its right.
#### The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
#### Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times. Otherwise, return false.

## L --> Left ; R --> Right ; "_" ignore

##### Example 1:
#####    Input: start = "_L__R__R_", target = "L______RR"
#####    Output: true
##### Example 2: 
#####    Input: start = "R_L_", target = "__LR"
#####    Output: false


```
class Solution {
    public boolean canChange(String start, String target) {
        if(!(start.replaceAll("_","")).equals(target.replaceAll("_",""))){
            return false;
        }
        
        int i = 0;
        int j = 0;
        for(i = 0, j = 0; i < start.length() && j < target.length(); i++,j++){
            while(i < start.length() && start.charAt(i) == '_' ){
                i++;
            }
            while(j < target.length() && target.charAt(j) == '_' ){
                j++;
            }
            if(i < start.length() && j < target.length() && ((start.charAt(i) == 'L' && i < j )|| (target.charAt(j) == 'R' && i > j))){
                return false;
            }
        }
        
        return true;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196969375-9c84c318-f43b-46cb-9d27-7fb6971efc62.png)

