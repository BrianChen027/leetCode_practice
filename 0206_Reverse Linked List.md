# 206. Reverse Linked List

#### Given the head of a singly linked list, reverse the list, and return the reversed list.

##### Example 1:
##### Input: head = [1,2,3,4,5]
##### Output: [5,4,3,2,1]

```
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode temp = null;
        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }  
}
```
![image](https://user-images.githubusercontent.com/97871497/187383537-0ba38215-85b6-46f5-b2a1-4b91b10cd5da.png)

