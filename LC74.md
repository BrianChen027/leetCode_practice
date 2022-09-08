# 74. Search a 2D Matrix

#### Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
#### This matrix has the following properties:

#### Integers in each row are sorted from left to right.
#### The first integer of each row is greater than the last integer of the previous row.


![image](https://user-images.githubusercontent.com/97871497/189149963-cb4ad6c6-4083-46ce-bab3-6b31db6e09a8.png)

#####    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
#####    Output: true

![image](https://user-images.githubusercontent.com/97871497/189150138-1826a5f7-e537-48de-8cfa-525461f64917.png)

#####    Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
#####    Output: false

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
![image](https://user-images.githubusercontent.com/97871497/189150379-60b2afc1-a724-4d1a-9571-d086950770b3.png)

```
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = (matrix.length-1) / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        while(i >= 0 && i <= matrix.length-1){
            if(set.contains(i)){
                return false;
            }
            
            if(target < matrix[i][0]){
                set.add(i);
                i--;
            }else if(target > matrix[i][matrix[i].length-1]){
                set.add(i);
                i++;
            }else {
                for(int j = 0; j <= matrix[i].length-1; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
                return false;
            }
        }     
        return false;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/189150482-3132eace-876d-439b-bf9d-041a43191317.png)

