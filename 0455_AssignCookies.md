# 455. Assign Cookies

#### Assume you are an awesome parent and want to give your children some cookies. 
#### But, you should give each child at most one cookie.
#### Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
#### and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
#### Your goal is to maximize the number of your content children and output the maximum number.


##### Example 1:
#####    Input: g = [1,2,3], s = [1,1]
#####    Output: 1
##### Example 2: 
#####    Input: g = [1,2], s = [1,2,3]
#####    Output: 2

### Double Loop Version
```
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int total = 0;
        Arrays.sort(s);
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < s.length ; j++){
                if(g[i] <= s[j]){
                    s[j] = 0;
                    total++;
                    break;
                }
            }
        }
        return total;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/197134631-7def8da1-991e-47f9-9fee-c1d6d7ebe63a.png)

### Greedy Version
```
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j = 0 ; j < s.length ; j++){
            if(g[i] <= s[j]){
                i++;
                if(i == g.length){
                    break;
                }
            }
        }
        return i;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197134734-13f053ad-d709-461c-a8f6-fa43d66a40e4.png)


