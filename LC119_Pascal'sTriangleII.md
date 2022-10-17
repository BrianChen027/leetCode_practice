# 119. Pascal's Triangle II

#### Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
#### In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![image](https://user-images.githubusercontent.com/97871497/189167084-c10c525f-b9f1-4d99-805b-84c995459f1d.png)


##### Example 1:
#####    Input: rowIndex = 3
#####    Output: [1,3,3,1]

```
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    arr.add(1);
                }else{
                    arr.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
            if(i == rowIndex){
                ans = arr;
            }
            pascal.add(arr);
        }
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189174991-09e2ed12-344f-4005-9502-e665eb90699d.png)
