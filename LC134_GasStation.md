# 134. Gas Station

#### There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
#### You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
#### You begin the journey with an empty tank at one of the gas stations.

#### Given two integer arrays gas and cost, return the starting gas station's index 
#### if you can travel around the circuit once in the clockwise direction, otherwise return -1.

#### If there exists a solution, it is guaranteed to be unique

##### Example 1:
#####    Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
#####    Output: 3
##### Example 2: 
#####    Input: gas = [2,3,4], cost = [3,4,3]
#####    Output: -1

```
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasTotal = 0;
        int position = 0;
        int lowestG = 0;
        for(int i = 0; i < gas.length ; i++){
            gasTotal += (gas[i] - cost[i]);
            if(gasTotal < lowestG){
                lowestG = gasTotal;
                position = i + 1;
            }
        }
        
        if(gasTotal >= 0){
            if(position == gas.length){
                return 0;
            }else{
                return position;
            }
        }
        return -1;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196223930-982dcfbd-dbef-467f-9965-23a8c6bb51ca.png)
