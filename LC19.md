# 19. Remove Nth Node From End of List

#### Given the head of a linked list, remove the nth node from the end of the list and return its head.


##### Example 1:
##### Input: head = [1,2,3,4,5], n = 2
##### Output: [1,2,3,5]

```
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pin = new ListNode(-1);
        pin.next = head;
        ListNode slow = pin;
        ListNode fast = pin;
        while(n-- > 0){
            fast = fast.next;
        }
        ListNode point = pin;
        while(fast != null){
            point = slow;
            slow = slow.next;
            fast = fast.next;
        }
        point.next = slow.next;
        return pin.next;
    } 
}
```

![image](https://user-images.githubusercontent.com/97871497/187474195-077ed712-cdf0-454f-92f2-de65d9b5dd85.png)
