# 566. Reshape the Matrix

#### In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
#### You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
#### The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
#### If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

![image](https://user-images.githubusercontent.com/97871497/189315696-70b7d23b-74fa-49f5-9bc1-9948433f7f07.png)
#####    Input: mat = [[1,2],[3,4]], r = 1, c = 4
#####    Output: [[1,2,3,4]]


```
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
  
        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        
        if(mat.length * mat[0].length != r * c){
            return mat;
        } 
        
        for(int mr = 0 ; mr < mat.length ; mr++){
            for(int mc = 0; mc < mat[mr].length; mc++){
                ans[row][col++] = mat[mr][mc];
                if(col > c-1){
                    row++;
                    col = 0;
                }
            }
        }
        return ans;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189315876-b265c7b7-f99e-45fe-8057-1245137b466a.png)
