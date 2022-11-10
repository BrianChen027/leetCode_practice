# 82. Remove Duplicates from Sorted List II

#### Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. 
#### Return the linked list sorted as well.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196696719-7fdc87dc-6d27-47bd-bc10-4b6bf5f57e58.png)
#####    Input: head = [1,2,3,3,4,4,5]
#####    Output: [1,2,5]
##### Example 2: 
![image](https://user-images.githubusercontent.com/97871497/196696755-75ee7558-5c4a-4c42-9280-3195d9d0c9eb.png)
#####    Input: head = [1,1,1,2,3]
#####    Output: [2,3]


```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = head;
        ListNode previous = dummy;
        previous.next = current;
        while(current != null){
            if(current.next != null && current.val == current.next.val){
                current = current.next;
            }else if(previous.next != current){
                previous.next = current.next;
                current = previous.next;
            }else{
                previous = previous.next;
                current = current.next;
            }
        }
        return dummy.next;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196696873-5a74c668-41a3-4500-b349-f55fa364ac1e.png)
