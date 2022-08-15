# 202. Happy Number

#### Write an algorithm to determine if a number n is happy.
#### A happy number is a number defined by the following process:
##### Starting with any positive integer, replace the number by the sum of the squares of its digits.
##### Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
##### Those numbers for which this process ends in 1 are happy.
##### Those numbers for which this process ends in 1 are happy.
#### Return true if n is a happy number, and false if not.

##### Example 1:
##### Input: n = 19
##### Output: true
##### Explanation:
##### 12 + 92 = 82
##### 82 + 22 = 68
##### 62 + 82 = 100
##### 12 + 02 + 02 = 1

```
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1){   
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
                n = getNextNum(n);
            }
        }
        return true; 
    }
    private int getNextNum(int n){
        int result = 0;
        while(n > 0){
            int temp = n%10;
            result += temp*temp;
            n = n/10;
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184578350-ac1a11d7-ee95-4cbf-8239-0201e9a5dbfa.png)

```
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1 && !set.contains(n)){   
            set.add(n);
            n = getNextNum(n);           
        }
        return n == 1; 
    }
    private int getNextNum(int n){
        int result = 0;
        while(n > 0){
            int temp = n%10;
            result += temp*temp;
            n = n/10;
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184578545-b2b2a69c-3535-4a4d-84cb-cfb0e4d7c8d1.png)
