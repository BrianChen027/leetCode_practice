# 216. Combination Sum III

#### Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
#### 1.Only numbers 1 through 9 are used.
#### 2.Each number is used at most once.

#### Return a list of all possible valid combinations.
#### The list must not contain the same combination twice, and the combinations may be returned in any order.

##### Example 1:
#####    Input: k = 3, n = 7
#####    Output: [[1,2,4]]
##### Example 2: 
#####    Input: k = 3, n = 9
#####    Output: [[1,2,6],[1,3,5],[2,3,4]]

```
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> container = new ArrayList<>();
        backtrack(list, container, k, n, 1);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> container, int k, int n, int start){
        if(n < 0 || container.size() > k){
            return;
        }else if(n == 0 && container.size() == k){
            list.add(new ArrayList<>(container));
        }else{
            for(int i = start ; i <= 9 ; i++){
                container.add(i);
                backtrack(list, container, k, n-i, i+1);
                container.remove(container.size()-1);
            }
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197684357-6b3e754a-2a45-45e8-b15f-e2b7d0282936.png)
