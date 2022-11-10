# 36. Valid Sudoku

#### Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

#### Each row must contain the digits 1-9 without repetition.
#### Each column must contain the digits 1-9 without repetition.
#### Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

#### A Sudoku board (partially filled) could be valid but is not necessarily solvable.
#### Only the filled cells need to be validated according to the mentioned rules.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/189151570-dedfef9e-dcb8-4ecb-895a-3a96491baf61.png)
#####    Input: board = 
##### [["5","3",".",".","7",".",".",".","."]
##### ,["6",".",".","1","9","5",".",".","."]
##### ,[".","9","8",".",".",".",".","6","."]
##### ,["8",".",".",".","6",".",".",".","3"]
##### ,["4",".",".","8",".","3",".",".","1"]
##### ,["7",".",".",".","2",".",".",".","6"]
##### ,[".","6",".",".",".",".","2","8","."]
##### ,[".",".",".","4","1","9",".",".","5"]
##### ,[".",".",".",".","8",".",".","7","9"]]
#####    Output: true

##### Example 2: 
##### [["8","3",".",".","7",".",".",".","."]
##### ,["6",".",".","1","9","5",".",".","."]
##### ,[".","9","8",".",".",".",".","6","."]
##### ,["8",".",".",".","6",".",".",".","3"]
##### ,["4",".",".","8",".","3",".",".","1"]
##### ,["7",".",".",".","2",".",".",".","6"]
##### ,[".","6",".",".",".",".","2","8","."]
##### ,[".",".",".","4","1","9",".",".","5"]
##### ,[".",".",".",".","8",".",".","7","9"]]
#####    Output: false


```
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<Character>();
            HashSet<Character> set2 = new HashSet<Character>();
            for(int j = 0; j < 9 ; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }else{
                        set.add(board[i][j]);
                    }
                }
                
                if(board[j][i] != '.'){
                    if(set2.contains(board[j][i])){
                        return false;
                    }else{
                        set2.add(board[j][i]);
                    }
                }
            }  
        }
        
        for(int i = 0; i <= 8 ;i+=3){
            for(int j = 0; j <= 8 ;j+=3){
                HashSet<Character> set = new HashSet<Character>();
                for(int x = 0;x <= 2;x++){
                    for(int y = 0;y <= 2;y++){
                        if(board[i+x][j+y] == '.'){
                            continue;
                        }
                        if(set.contains(board[i+x][j+y])){
                            return false;
                        }else{
                            set.add(board[i+x][j+y]);
                        }
                    } 
                }

            }
        }
        return true;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189151894-a5f3597a-227e-4e43-8a2d-77fe7b2cff2d.png)
