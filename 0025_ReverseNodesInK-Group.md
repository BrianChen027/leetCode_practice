# 25. Reverse Nodes in k-Group

#### Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
#### k is a positive integer and is less than or equal to the length of the linked list.
#### If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

#### You may not alter the values in the list's nodes, only nodes themselves may be changed.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/196958581-025233ce-3d77-4db2-b343-31f883bd00aa.png)
#####    Input: head = [1,2,3,4,5], k = 2
#####    Output: [2,1,4,3,5]
##### Example 2: 
![image](https://user-images.githubusercontent.com/97871497/196958615-d25b87c2-6b1c-4572-9c8d-1782146fc0d3.png)
#####    Input: head = [1,2,3,4,5], k = 3
#####    Output: [3,2,1,4,5


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

![image](https://user-images.githubusercontent.com/97871497/196958691-83ebb0f7-5d80-4795-a5b2-a22149e0cd04.png)
