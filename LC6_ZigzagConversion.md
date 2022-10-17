# 6. Zigzag Conversion

#### The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
#### (you may want to display this pattern in a fixed font for better legibility)
![image](https://user-images.githubusercontent.com/97871497/196122293-4881d212-2ab0-42aa-80bc-e72d1a6a4553.png)
#### And then read line by line: "PAHNAPLSIIGYIR"
#### Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string s, int numRows);
```

##### Example 1:
#####    Input: s = "PAYPALISHIRING", numRows = 3
#####    Output: "PAHNAPLSIIGYIR"
##### Example 2: 
#####    Input: s = "PAYPALISHIRING", numRows = 4
#####    Output: "PINALSIGYAHRPI"
![image](https://user-images.githubusercontent.com/97871497/196122503-0934522c-2310-4561-8688-c8e172388c89.png)

#### Remember: x --> x+2*(row-1) and x+2*(row-1)-2*(row between "1" to "row-2")
```
class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 1){
            return s;
        }
        if(numRows == 1){
            return s;
        }
        char[] result = new char[s.length()];
        int index = 0;
        for(int i = 0 ; i < numRows ; i++){
            int diff = 2 * (numRows - 1);
            for(int j = i; j < s.length() ; j+=diff){
                result[index] = s.charAt(j);
                index++;
                //adding the character which is before next "j"
                if(i > 0 && i < (numRows - 1) && (j+diff-2*i) < s.length()){
                    result[index] = s.charAt(j+diff-2*i);
                    index++;
                }
            }
        }
        return new String(result);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196122965-9a1acc64-4d44-4a2d-8bbb-e59f56b8b710.png)
