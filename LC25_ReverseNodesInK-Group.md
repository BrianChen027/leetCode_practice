# 25. Reverse Nodes in k-Group

#### Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
#### k is a positive integer and is less than or equal to the length of the linked list.
#### If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
#### You may not alter the values in the list's nodes, only nodes themselves may be changed.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196344974-d4bc7277-50cb-4979-ba4b-03b49c3d55ec.png)
#####    Input: head = [1,2,3,4,5], k = 2
#####    Output: [2,1,4,3,5]
##### Example 2:
![image](https://user-images.githubusercontent.com/97871497/196344997-8b64ac6c-e7d1-4065-8075-ef341a0a8b1f.png)
#####    Input: head = [1,2,3,4,5], k = 3
#####    Output: [3,2,1,4,5]


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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }

        int loop = count / k;
        return reverseTool(head, loop, k);
    }

    public ListNode reverseTool(ListNode head, int loop, int k){
        if(loop > 0){
            int count = 0;
            ListNode current = head;
            ListNode previous = null;
            ListNode temp = null;
            while(count < k){
                temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
                count++;
            }

            if(temp != null){
                head.next =  reverseTool(temp, loop - 1, k);
            }

            return previous;
        }
        return head;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196345060-68df90d8-5b88-49dc-a82c-acdc6db9c112.png)
