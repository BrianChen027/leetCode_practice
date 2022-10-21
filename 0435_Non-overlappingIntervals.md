# 435. Non-overlapping Intervals

#### Given an array of intervals intervals where intervals[i] = [starti, endi],
#### return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

##### Example 1:
#####    Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
#####    Output: 1
#####    Explaination: remove [1,3]
##### Example 2: 
#####    Input: intervals = [[1,2],[1,2],[1,2]]
#####    Output: 2
#####    Explaination: remove [1,2] and [1,2]


```
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        int i = 0;
        int j = 1;
        int target = 0;
        
        while(j < intervals.length){
            if(intervals[i][1] > intervals[j][0]){
                if(intervals[i][1] > intervals[j][1]){
                    i = j;
                }
                target++;
            }else{
                i = j;
            }
            j++;
        }
        return target;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197131232-1d607c11-040b-457b-b007-66014e8378cd.png)

