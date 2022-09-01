# 21. Merge Two Sorted Lists

#### You are given the heads of two sorted linked lists list1 and list2.

#### Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

#### Return the head of the merged linked list.

##### Example 1: 
#####    Input: list1 = [1,2,4], list2 = [1,3,4]
#####    Output: [1,1,2,3,4,4]
##### Example 2: 
#####    Input: list1 = [], list2 = []
#####    Output: []

```
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp = new ListNode(-1);
        ListNode pin = temp;
        ListNode current = list1;
        ListNode previous = list2;
        
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        while(current != null && previous != null){
            if(current.val > previous.val){
                pin.next = previous;
                previous = previous.next;
            }else{
                pin.next = current;
                current = current.next;
            }
            pin = pin.next;
        }
        if(current == null){
            pin.next = previous;
        }else{
            pin.next = current;
        }
        
        return temp.next;
    }
}
```

![image](https://user-images.githubusercontent.com/97871497/187979472-1b85a4e2-7d58-4ba3-af40-22171abde6d6.png)
