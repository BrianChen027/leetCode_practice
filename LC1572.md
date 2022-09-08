# 1572. Matrix Diagonal Sum

#### Given a square matrix mat, return the sum of the matrix diagonals.
#### Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

![image](https://user-images.githubusercontent.com/97871497/189163632-68862785-4b9c-4b11-a438-829e6779901b.png)

#####    Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
#####    Output: 25

```
class Solution {
    public int diagonalSum(int[][] mat) {
        int total = 0;
        for(int i = 0; i < mat[0].length;i++){
            total += mat[i][i];
            total += mat[mat[0].length-1 - i][i];
        }
        if(mat[0].length%2 != 0){
            total -= mat[(mat[0].length-1)/2][(mat[0].length-1)/2];
        }
        return total;     
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189163800-1e0e41f9-1984-4e48-af0f-0fabf4478223.png)
