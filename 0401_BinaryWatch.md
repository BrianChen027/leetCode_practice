# 401. Binary Watch

#### A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59).
#### Each LED represents a zero or one, with the least significant bit on the right.
#### For example, the below binary watch reads "4:51".
![image](https://user-images.githubusercontent.com/97871497/197010242-bad447fb-cca3-44be-bdbc-8fedc037658f.png)

#### Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), 
#### return all possible times the watch could represent. You may return the answer in any order.

###  1.The hour must not contain a leading zero.
#### For example, "01:00" is not valid. It should be "1:00"
###  2.The minute must be consist of two digits and may contain a leading zero.
#### For example, "10:2" is not valid. It should be "10:02".

##### Example 1:
#####    Input: turnedOn = 1
#####    Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
##### Example 2: 
#####    Input: turnedOn = 9
#####    Output: []

### Reminder: String.format("%d", number)
##### %d ：正常輸出十進制數 。
##### %Yd：十進制數，輸出 Y 位。如果本身大於 Y 位，正常輸出。
##### %XYd：十進制數，輸出 Y 位，不足 Y 位就補 X 。如果本身大於 Y 位，正常輸出。
##### Example:
##### %d：十進制數正常輸出 。
##### %2d：十進制數，輸出 2 位。如果本身大於 2 位，正常輸出。 
##### %02d ：十進制數，輸出 2 位，不足 2 位就補 0 。如果本身大於 2 位，正常輸出。 2 --> 02
```
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        
        List<String> list = new ArrayList<>();
        
        if(turnedOn < 0 || turnedOn >= 9){
            return list;
        }
        
        for(int hour = 0; hour <= 11 ; hour++){
            for(int minute = 0; minute <= 59 ; minute++){
                int checkH = Integer.bitCount(hour);
                int checkM = Integer.bitCount(minute);
                if((checkH + checkM) == turnedOn){
                    list.add(String.format("%d:%02d", hour, minute));
                }
            }
        }
        return list;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197011211-16ebff79-5e0c-48b5-9610-0f081eaee61a.png)

