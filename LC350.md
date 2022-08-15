# 350. Intersection of Two Arrays II

#### Given two integer arrays nums1 and nums2, return an array of their intersection.
#### Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

##### Example 1:
##### Input: nums1 = [1,2,2,1], nums2 = [2,2]
##### Output: [2,2]

```
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int s:nums1){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int s:nums2){
            if(map.containsKey(s)){
                if(map.get(s) > 1){
                    map.put(s, map.get(s) - 1);
                }else{
                    map.remove(s);
                }
                arrList.add(s);
            } 
        }
        int result[] = new int[arrList.size()];
        int count = 0;
        for(int s:arrList){
            result[count] = s;
            count++;
        }
        return result;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/184571416-d99cf36f-0ad8-4af1-999a-6ed1a6d5c6c9.png)
