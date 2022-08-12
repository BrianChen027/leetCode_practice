# 349. Intersection of Two Arrays

#### Given two integer arrays nums1 and nums2, return an array of their intersection. 
#### Each element in the result must be unique and you may return the result in any order.

##### Example 1:
##### Input: nums1 = [1,2,2,1], nums2 = [2,2]
##### Output: [2]

```
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int index = 0;
        for(int i:nums1){
            s1.add(i);
        }
        for(int j:nums2){
            if(s1.contains(j)){
                s2.add(j);
            }
        }
        int result[] = new int[s2.size()];
        for(int z:s2){
            result[index] = z;
            index++;
        }
        return result;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/184403994-dfc9ab83-01df-4a45-a765-e1522762c2ab.png)



