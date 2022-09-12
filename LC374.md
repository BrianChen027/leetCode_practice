# 374. Guess Number Higher or Lower

#### We are playing the Guess Game. The game is as follows:
#### I pick a number from 1 to n. You have to guess which number I picked.
#### Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
#### You call a pre-defined API int guess(int num), which returns three possible results:

#### -1: Your guess is higher than the number I picked (i.e. num > pick).
#### 1: Your guess is lower than the number I picked (i.e. num < pick).
#### 0: your guess is equal to the number I picked (i.e. num == pick).

##### Example 1:
#####    Input: n = 10, pick = 6
#####    Output: 6
##### Example 2: 
#####    Input: n = 1, pick = 1
#####    Output: 1


```
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int mid = left + (right - left)/2;
        while(guess(mid) != 0){
            mid = left + (right - left)/2;
            if(guess(mid) == -1){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return mid;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189598663-15ec8563-107e-4b48-99d0-a74785cc1baa.png)
