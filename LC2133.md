# 2133. Check if Every Row and Column Contains All Numbers

#### An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
#### Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.

![image](https://user-images.githubusercontent.com/97871497/189153678-e6612b7a-77b5-411e-906c-e31e8fbefc2a.png)
#### Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
#### Output: true

![image](https://user-images.githubusercontent.com/97871497/189153791-0fe9f75b-43d3-47e2-876f-0d45c4d448b9.png)
#### Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
#### Output: false

```
class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i = 0; i <= matrix.length-1 ; i++){
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for(int j = 0; j <= matrix[i].length-1; j++){
                if(set.contains(matrix[i][j])){
                    return false;
                }else{
                    set.add(matrix[i][j]);
                }
                
                if(set2.contains(matrix[j][i])){
                    return false;
                }else{
                    set2.add(matrix[j][i]);
                }
            }
        }
        return true;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/189153993-c05058af-bc66-4ea4-b99b-191d60415d2d.png)


