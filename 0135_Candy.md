# 135. Candy

#### There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
#### You are giving candies to these children subjected to the following requirements:
#### 1.Each child must have at least one candy.
#### 2.Children with a higher rating get more candies than their neighbors.
#### Return the minimum number of candies you need to have to distribute the candies to the children.

##### Example 1:
#####    Input: ratings = [1,0,2]
#####    Output: 5
##### Example 2: 
#####    Input: ratings = [1,2,2]
#####    Output: 4


```
class Solution {
    public int candy(int[] ratings) {
        int sum = 1;
        int add = 1;
        int top = 0;
        boolean isDown = true;
        for(int i = 0 ; i < ratings.length - 1 ; i++){     
            if(ratings[i] < ratings[i+1]){ // up
                if(isDown){
                    add = 2;
                }else{
                    add++;
                }
                top = add;
                sum += add;
                isDown = false;
            }else if(ratings[i] > ratings[i+1]){ // down     
                if(isDown){
                    add++;
                    if(add == top){
                        top++;
                        add = top;
                    }
                    sum += add;
                }else{
                    add = 1;
                    sum += add;
                    isDown = true;
                }
            }else{
                add = 1;
                top = add;
                sum += add;
                isDown = true;
            }
        }
        return sum;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196237007-9fd852d8-81f7-49aa-b208-1f593fff2a36.png)
