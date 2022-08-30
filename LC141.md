# 141. Linked List Cycle

#### Given head, the head of a linked list, determine if the linked list has a cycle in it.
#### There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
#### Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
#### Note that pos is not passed as a parameter.
#### Return true if there is a cycle in the linked list. Otherwise, return false.

##### Example 1:
##### Input: head = [3,2,0,-4], pos = 1
##### Output: true
##### Explanation: 
##### Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

```
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187512842-2e4d478a-f9f2-4ab3-b44c-5bb69a57913d.png)

