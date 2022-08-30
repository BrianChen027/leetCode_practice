# 203. Remove Linked List Elements

#### Given the head of a linked list and an integer val, 
#### remove all the nodes of the linked list that has Node.val == val, and return the new head.

##### Example 1:
##### Input: head = [1,2,6,3,4,5,6], val = 6
##### Output: [1,2,3,4,5]
##### Example 2:
##### Input: head = [], val = 1
##### Output: []

```
class Solution {
    public ListNode removeElements(ListNode head, int target) {    
        while(head != null && head.val == target){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode previous = head;
        ListNode current = head.next;
        while(current != null){
            if(current.val == target){
                previous.next = current.next;
            }else{
                previous = current;
            }
            current = current.next;
        }
    return head;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/187375920-b781cb83-940c-4163-b10d-b58d484445db.png)

