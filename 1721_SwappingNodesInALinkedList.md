# 1721. Swapping Nodes in a Linked List

#### You are given the head of a linked list, and an integer k.
#### Return the head of the linked list after swapping the values of the kth node 
#### from the beginning and the kth node from the end (the list is 1-indexed).


##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196959314-7ee37d39-71a3-457d-9564-436c807ad3f7.png)
#####    Input: head = [1,2,3,4,5], k = 2
#####    Output: [1,4,3,2,5]
##### Example 2: 
#####    Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
#####    Output: [7,9,6,6,8,7,3,0,9,5]


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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pinNode = null;
        int count = 1;
        while(count < k){
            fast = fast.next;
            count++;
        }
        pinNode = fast;
        
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int temp = pinNode.val;
        pinNode.val = slow.val;
        slow.val = temp;
        
        return head;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196959450-b8f4944b-9ed6-4fab-9862-f9e5be7b9211.png)

