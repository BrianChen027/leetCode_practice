# 39. Combination Sum

#### Given an array of distinct integers candidates and a target integer target,
#### return a list of all unique combinations of candidates where the chosen numbers sum to target.
#### You may return the combinations in any order.

#### The same number may be chosen from candidates an unlimited number of times. 
#### Two combinations are unique if the frequency of at least one of the chosen numbers is different.

#### The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
####

##### Example 1:
#####    Input: candidates = [2,3,6,7], target = 7
#####    Output: [[2,2,3],[7]]
##### Example 2: 
#####    Input: candidates = [2,3,5], target = 8
#####    Output: [[2,2,2,2],[2,3,3],[3,5]]


```
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> container = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, container, candidates, target, 0);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> container, int[] candidates, int temp, int start) {
        if(temp < 0){
            return;
        }else if(temp == 0){
            // important spot
            list.add(new ArrayList<>(container));
        }else{
            for(int i = start; i < candidates.length; i++){
                container.add(candidates[i]);
                backtrack(list, container, candidates, temp - candidates[i], i);
                container.remove(container.size() - 1);
            }
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197682237-f6eabf5b-37ee-4a2e-9fa9-adf583e6541c.png)

