# 24. Swap Nodes in Pairs

#### Given a linked list, swap every two adjacent nodes and return its head.
#### You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

##### Example 1:
##### Input: head = [1,2,3,4]
##### Output: [2,1,4,3]

```
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode container = new ListNode(0);
        container.next = head;
        ListNode current = head;
        ListNode previous = container;
        ListNode temp = null;
        while(previous.next != null && previous.next.next != null){
            temp = current.next.next;
            previous.next = current.next;
            current.next.next = current;
            current.next = temp;
            previous = current;
            current = current.next;
        }
        return container.next;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187418843-3b228744-12ce-44f2-a353-8a2d1d13b71e.png)
