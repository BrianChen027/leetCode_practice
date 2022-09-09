# 1200. Minimum Absolute Difference

#### Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
#### Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

#### a, b are from arr
#### a < b
#### b - a equals to the minimum absolute difference of any two elements in arr

##### Example 1:
#####    Input: arr = [4,2,1,3]
#####    Output: [[1,2],[2,3],[3,4]]
##### Example 2: 
#####    Input: arr = [1,3,6,10,15]
#####    Output: [[1,3]]


```
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minNum = Integer.MAX_VALUE;
        List<List<Integer>> listB = new ArrayList<>();      
        for(int i = 0; i < arr.length-1; i++){
            int temp = arr[i+1] - arr[i];
            if(minNum > temp){
                minNum = temp;
            }
        }     
        for(int i = 0; i < arr.length-1; i++){
            List<Integer> listS = new ArrayList<>();
            int temp = arr[i+1] - arr[i];
            if(temp == minNum){
                listS.add(arr[i]);
                listS.add(arr[i+1]);
                listB.add(listS);
            }
        }

        return listB;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/189373130-b48cc999-3e63-41d4-b76e-6e10759c9ca8.png)
