# 40. Combination Sum II

#### Given a collection of candidate numbers (candidates) and a target number (target),
#### find all unique combinations in candidates where the candidate numbers sum to target.

#### Each number in candidates may only be used once in the combination.

#### Note: The solution set must not contain duplicate combinations.


##### Example 1:
#####    Input: candidates = [10,1,2,7,6,1,5], target = 8
#####    Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
##### Example 2: 
#####    Input: candidates = [2,5,2,1,2], target = 5
#####    Output: [[1,2,2],[5]]

```
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> container = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, container, candidates, target, 0);
        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> contianer, int[] candidates, int remain, int start){
        if(remain < 0){
            return;
        }else if(remain == 0){
            list.add(new ArrayList<>(contianer));
        }else{
            for(int i = start ; i < candidates.length ; i++){
                if(i > start && candidates[i] == candidates[i-1]){
                    continue;
                }else{
                    contianer.add(candidates[i]);
                    backtrack(list, contianer, candidates, remain-candidates[i], i+1);
                    contianer.remove(contianer.size()-1);
                }
            }
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/197684093-42a153a5-5845-4e1e-a5d0-99dd425f8420.png)
