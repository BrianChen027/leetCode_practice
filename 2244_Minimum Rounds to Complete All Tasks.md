# 2244. Minimum Rounds to Complete All Tasks

#### You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, 
#### you can complete either 2 or 3 tasks of the same difficulty level.
#### Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks

##### Example 1:
#####    Input: tasks = [2,2,3,3,2,4,4,4,4,4]
#####    Output: 4
##### Example 2: 
#####    Input: tasks = [2,3,3]
#####    Output: -1


```
class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int temp = 0;
        int count = 0;
        int round = 0;
        if(tasks.length == 1){
            return -1;
        }
        for(int i = 0; i <= tasks.length-1; i++){  
            if(temp != tasks[i]){
                temp = tasks[i];
                if(count == 1){
                    return -1;
                }      
                round += getMinRound(count);
                count = 1;
                if(i == tasks.length-1){
                    if(count == 1){
                        return -1;
                    }
                }
            }else if(temp == tasks[i]){
                count++;
                if(i == tasks.length-1){
                    if(count == 1){
                        return -1;
                    }
                    round += getMinRound(count);
                }
            } 
        }   
        return round;
    }
    
    public int getMinRound(int n){
        int round = 0;
        if(n == 0){
            return 0;
        }
        while(n > 0){
            if(n >= 3){
                n-=3;
                round++;
            }else if(n >= 1){
                n-=2;
                round++;
            }
        }
        return round;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189469390-abfe9fa0-42e9-41ee-bf14-7dfc2049623d.png)
