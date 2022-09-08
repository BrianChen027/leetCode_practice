# 118. Pascal's Triangle

#### Given an integer numRows, return the first numRows of Pascal's triangle.
#### In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![image](https://user-images.githubusercontent.com/97871497/189167084-c10c525f-b9f1-4d99-805b-84c995459f1d.png)


##### Example 1:
#####    Input: numRows = 5
#####    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

```
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();        
        for(int i = 0; i <= numRows-1 ; i++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0; j <= i ; j++){
                if(j == 0 || j == i){
                    arr.add(1);
                }else{
                    arr.add(pascal.get(i - 1).get(j - 1)+pascal.get(i - 1).get(j));
                }
            }
            pascal.add(arr);
        }
        return pascal;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189167275-58d23666-9f28-4315-898a-d68c90523489.png)
