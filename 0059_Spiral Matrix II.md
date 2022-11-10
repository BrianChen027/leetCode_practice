# 59. Spiral Matrix II

#### Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/184314043-bc38ec10-a11f-42a1-8bfb-f6441217a958.png)

##### Input: n = 3
##### Output: [[1,2,3],[8,9,4],[7,6,5]]


```
class Solution {
    public int[][] generateMatrix(int n) {
        int squire[][] = new int[n][n];
        int startX = 0;
        int startY = 0;
        int move = 0;
        int count = 1;
        int loop = n/2;
        int mid = n/2;
        while(loop > 0){
            int x = startX;
            int y = startY;
            for(; x < (n-1)-move ; x++){
                squire[y][x] = count++;
            }
            for(; y < (n-1)-move ; y++){
                squire[y][x] = count++;
            }
            for(; x > startX ; x--){
                squire[y][x] = count++;
            }
            for(; y > startY ; y--){
                squire[y][x] = count++;
            }
            loop--;
            startX++;
            startY++;
            move++;
        }
        if(n % 2 == 1){
            squire[mid][mid] = count;
        }
        return squire;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184314097-1721552f-0172-41ee-9935-40853b9725d2.png)
