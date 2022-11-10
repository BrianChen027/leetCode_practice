# 278. First Bad Version

#### You are a product manager and currently leading a team to develop a new product.
#### Unfortunately, the latest version of your product fails the quality check. 
#### Since each version is developed based on the previous version, all the versions after a bad version are also bad.
#### Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
#### You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. 
#### You should minimize the number of calls to the API.

##### Example 1:
#####    Input: n = 5, bad = 4
#####    Output: 4
##### Explanation:
##### call isBadVersion(3) -> false
##### call isBadVersion(5) -> true
##### call isBadVersion(4) -> true
##### Then 4 is the first bad version.


```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        if(n == 1){
            return n;
        }
        while(left < right){
            int mid = left + ((right - left) / 2);
            if(!isBadVersion(mid)){
                if(isBadVersion(mid + 1)){
                    return mid + 1;
                }
                left = mid + 1;
            }else{
                if(!isBadVersion(mid - 1)){
                    return mid;
                }
                right = mid;
            }
        }
        return n;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189598264-6a596230-3717-42fe-860e-3eeedd4845d4.png)
