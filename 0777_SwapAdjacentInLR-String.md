# 777. Swap Adjacent in LR String

#### In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", 
####  a move consists of either replacing one occurrence of "XL" with "LX", or replacing one occurrence of "RX" with "XR".
#### Given the starting string start and the ending string end, 
#### return True if and only if there exists a sequence of moves to transform one string to the other.

## "XL" --> "LX" ; "RX" --> "XR"

##### Example 1:
#####    Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
#####    Output: true
##### Example 2: 
#####    Input: start = "X", end = "L"
#####    Output: false


```
class Solution {
    public boolean canTransform(String start, String end) {
        int NumRS = 0;
        int NumLS = 0;
        int NumRE = 0;
        int NumLE = 0;
        
        String strS = "";
        String strE = "";
        
        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i) != 'X'){
                if(start.charAt(i) == 'L'){
                    NumLS++;
                }else{
                    NumRS++;
                }
                strS += start.charAt(i);
            }
            if(end.charAt(i) != 'X'){
                if(end.charAt(i) == 'L'){
                    NumLE++;
                }else{
                    NumRE++;
                }
                strE += end.charAt(i);
            }
            
            if(NumLS > NumLE || NumRS < NumRE){
                return false;
            }
        }
        
        if(NumLS != NumLE || NumRS != NumRE || !strS.equals(strE)){
            return false;
        }
        
        return true;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196964660-7f009b20-03b1-4867-ae48-ebcb3fb2dba1.png)

