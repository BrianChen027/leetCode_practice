# 160. Intersection of Two Linked Lists

#### Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
#### If the two linked lists have no intersection at all, return null.

##### Example 1:
##### Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
##### Intersected at '8'
##### Explanation: 
##### Note that the intersected node's value is not 1 
##### because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. 
##### In other words, they point to two different locations in memory,
##### while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

```
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        int longA = 0;
        int longB = 0;
        while(currentA != null){
            longA++;
            currentA = currentA.next;
        }
        while(currentB != null){
            longB++;
            currentB = currentB.next;
        }
        int diff = 0;
        if(longA > longB){
            currentA = headA;
            currentB = headB;
            diff = longA - longB;
        }else{
            currentA = headB;
            currentB = headA;
            diff = longB - longA;
        }
        while(diff-- > 0){
            currentA = currentA.next;
        }
        while(currentA != null){
            if(currentA == currentB){
                return currentA;
            }else{
                currentA = currentA.next;
                currentB = currentB.next;
            }
        }
        return null;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187489486-324b96db-9abd-4038-910c-ff15f2f97f41.png)
