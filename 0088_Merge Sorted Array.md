# 88. Merge Sorted Array

#### You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
#### and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

#### Merge nums1 and nums2 into a single array sorted in non-decreasing order.
#### The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
#### To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
#### and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

##### Example 1: 
#####    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
#####    Output: [1,2,2,3,5,6]
##### Example 2: 
#####    Input: nums1 = [1], m = 1, nums2 = [], n = 0
#####    Output: [1]

#### Using Arrays.sort Version

```
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            
        for(int i = m; i <= nums1.length-1 ; i++){
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187976158-976738a3-314f-433b-887d-d109c589b65a.png)

#### Normal sorting Version
```
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i <= nums1.length-1 ; i++){
            nums1[i] = nums2[i-m];
        }
        int count = m+n;
        while(count > 0){
            for(int i = 0; i <= nums1.length-1 ; i++){
                if(i <= nums1.length-2 && nums1[i] > nums1[i+1]){
                    int temp = nums1[i+1];
                    nums1[i+1] = nums1[i];
                    nums1[i] = temp;
                }
            }
            count--;
        }     
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187979028-3ef98f53-95ec-4be7-b64c-d86c3349e7b1.png)

