# 1491. Average Salary Excluding the Minimum and Maximum Salary

#### You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
#### Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

##### Example 1:
#####    Input: salary = [4000,3000,1000,2000]
#####    Output: 2500.00000
##### Example 2: 
#####    Input: salary = [1000,2000,3000]
#####    Output: 2000.00000

```
class Solution {
    public double average(int[] salary) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        double sum = 0;
        for(int i:salary){
            if(small > i){
                small = i;
            }
            if(big < i){
                big = i;
            }
            sum += i;
        }
        return (sum - small - big)/(salary.length-2);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189317156-ca9018ef-b5a2-43d7-b504-daca41059a75.png)
