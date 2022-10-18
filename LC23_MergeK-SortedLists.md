# 23. Merge k Sorted Lists

#### You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
#### Merge all the linked-lists into one sorted linked-list and return it.

##### Example 1:
#####    Input: lists = [[1,4,5],[1,3,4],[2,6]]
#####    Output: [1,1,2,3,4,4,5,6]
#####    Explaination: 1->4->5 , 1->3->4 , 2->6 ; 1->1->2->3->4->4->5->6
##### Example 2: 
#####    Input: lists = []
#####    Output: []


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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }

        int len1 = lists.length / 2;
        int len2 = lists.length - len1;
        // lists = list1 + list2 (divide lists into 1 and 2)
        ListNode[] list1 = new ListNode[len1];
        ListNode[] list2 = new ListNode[len2];

        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(lists, 0, list1, 0 ,len1);
        System.arraycopy(lists, len1, list2, 0 ,len2);

        ListNode l1 = mergeKLists(list1);
        ListNode l2 = mergeKLists(list2);
        ListNode head = null;
// -----------------------------------------------------
        if(l1 == null){
            head = l2;
            return head;
        }
        if(l2 == null){
            head = l1;
            return head;
        }
// -----------------------------------------------------
        //finding the l1 or l2 to become the head
        if(l1.val > l2.val){
            head = l2;
            l2 = l2.next;
        }else{
            head = l1;
            l1 = l1.next;
        }
// -----------------------------------------------------
        //start putting the elements 
        ListNode n = head;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                n.next = l2;
                l2 = l2.next;
                n = n.next;
            }else{
                n.next = l1;
                l1 = l1.next;
                n = n.next;
            }
        }
//-----------------------------------------------------------
        //add the remaining elements
        if(l1 == null){
            n.next = l2;
        }else{
            n.next = l1;
        }
        return head;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/196335138-4c79a21d-a5f6-4fa6-a9bf-80d59a116e96.png)
