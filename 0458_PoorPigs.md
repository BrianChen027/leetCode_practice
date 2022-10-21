# 458. Poor Pigs

#### There are buckets buckets of liquid, where exactly one of the buckets is poisonous. 
#### To figure out which one is poisonous, you feed some number of (poor) pigs the liquid to see whether they will die or not.
#### Unfortunately, you only have minutesToTest minutes to determine which bucket is poisonous.
#### You can feed the pigs according to these steps:
#### 1.Choose some live pigs to feed.
#### For each pig, choose which buckets to feed it. The pig will consume all the chosen buckets simultaneously and will take no time. 
#### Each pig can feed from any number of buckets, and each bucket can be fed from by any number of pigs.

#### 2.Wait for minutesToDie minutes. You may not feed any other pigs during this time.
#### After minutesToDie minutes have passed, any pigs that have been fed the poisonous bucket will die, and all others will survive.
#### Repeat this process until you run out of time.

#### Given buckets, minutesToDie, and minutesToTest, return the minimum number of pigs needed to figure out which bucket is poisonous within the allotted time.


##### Example 1:
#####    Input: buckets = 4, minutesToDie = 15, minutesToTest = 15
#####    Output: 2
####     Explaination:
####     4 buckets and 2 pigs
![image](https://user-images.githubusercontent.com/97871497/197196315-c564ffbf-b669-4a21-8ba1-6ee122eb3dc5.png)
####     let pig1 drink bucket1 and bucket2, pig2 drink bucket2 and bucket3.
![image](https://user-images.githubusercontent.com/97871497/197196574-e9a049cf-d9c4-44d2-b9d6-eb2a29692e17.png)
####     Four possibilities:
####     1. only pig1 die -> bucket1 is the position one.
####     2. only pig2 die -> bucket3 is the position one.
####     3. pig1 and pig2 both die -> bucket2 is the position one.
####     4. no pig die -> bucket4 is the postion one.
##### Example 2: 
#####    Input: buckets = 4, minutesToDie = 15, minutesToTest = 30
#####    Output: 2

### Formula :
![image](https://user-images.githubusercontent.com/97871497/197197991-724cfba7-322a-49ee-a07c-5b9971e2befa.png)

```
class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int count = 0;
        while(Math.pow((minutesToTest / minutesToDie)+1, count) < buckets){
            count++;
        }
        return count;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197197335-ff60e2bf-225b-4864-ba48-199cd9fb9ebd.png)
