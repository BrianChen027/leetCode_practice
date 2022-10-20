# 832. Flipping an Image

#### Given an n x n binary matrix image, flip the image "horizontally", then invert it, and return the resulting image.
#### To flip an image horizontally means that each row of the image is reversed.
###  For example, flipping [1,1,0] horizontally results in [0,1,1].
#### To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
###  For example, inverting [0,1,1] results in [1,0,0].


#### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196962528-9f5a5206-ede7-45f7-975d-6aacc9f90ed3.png)
#####    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
#####    Output: [[1,0,0],[0,1,0],[1,1,1]]
#####    Explaination: 
#####                  1. flip this array horizontally
![image](https://user-images.githubusercontent.com/97871497/196962759-dacb903a-d97d-4caf-b6d8-df0df089e57d.png)
#####                  2. replace 0 to 1, replace 1 to 0
![image](https://user-images.githubusercontent.com/97871497/196962959-b9cea2b7-759a-4e3c-9cb2-fc67c74e6366.png)
#### Example 2: 
#####    Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
#####    Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]


```
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            reverseArray(image[i]);
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
    
    public void reverseArray(int[] array){
        int[] temp = new int[array.length];
        int count = 0;
        for(int n:array){
            temp[count] = n;
            count++;
        }
        for(int i = 0; i < array.length ; i++){
            array[i] = temp[(array.length-1) - i];
        }
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196960761-f22a6bbf-ba61-428f-b412-96f40f41055f.png)

