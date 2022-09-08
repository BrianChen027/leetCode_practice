# 240. Search a 2D Matrix II

#### Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
#### This matrix has the following properties:

#### Integers in each row are sorted from left to right.
#### ntegers in each column are sorted in ascending from top to bottom.


![image](https://user-images.githubusercontent.com/97871497/189150794-cf06efe4-a1a6-47a6-839a-833e33cf2358.png)

#####    Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
#####    Output: true

```
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i <= matrix.length-1 ; i++){
            for(int j = 0; j <= matrix[i].length-1; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;  
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/189150948-98cc36d2-d384-4b37-8ed6-396cf5eb9990.png)
