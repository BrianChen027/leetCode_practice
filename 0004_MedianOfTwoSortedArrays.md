# 4. Median of Two Sorted Arrays

#### Given two sorted arrays nums1 and nums2 of size m and n respectively, 
#### return the median of the two sorted arrays.

#### The overall run time complexity should be O(log (m+n)).

##### Example 1:
#####    Input: nums1 = [1,3], nums2 = [2]
#####    Output: 2.00000
##### Example 2: 
#####    Input: nums1 = [1,2], nums2 = [3,4]
#####    Output: 2.50000

```
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] combine = new double[nums1.length + nums2.length];
        for(int i = 0 ; i < nums1.length ; i++){
            combine[i] = nums1[i];
        }
        for(int i = 0 ; i < nums2.length ; i++){
            combine[i + nums1.length] = nums2[i];
        }
        Arrays.sort(combine);
        double result = 0.00;
        if(combine.length % 2 == 0){
            result = (combine[(combine.length - 1)/2] + combine[(combine.length + 1)/2]) / 2;
        }else{
            result = combine[(0 + combine.length) / 2];
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196114663-e265043a-77ca-4e81-988f-f56a614737ef.png)
