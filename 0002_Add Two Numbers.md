# 2. Add Two Numbers

#### You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
#### and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

#### You may assume the two numbers do not contain any leading zero, except the number 0 itself.

##### Example 1:
![image](https://user-images.githubusercontent.com/97871497/200995433-21f37fbd-2306-4db6-8352-6baac7fd10a3.png)
##### Input: l1 = [2,4,3], l2 = [5,6,4]
##### Output: [7,0,8]

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sol = new ListNode(-1);
        ListNode dummy = sol;
        int carryNum = 0;
        while(l1 != null || l2 != null || carryNum == 1){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carryNum;
            carryNum = sum / 10;
            ListNode node = new ListNode(sum%10);
            dummy.next = node;
            dummy = dummy.next;
            
        }
        return sol.next;
    }
}
```
![image](https://user-images.githubusercontent.com/97871497/200995568-1d3ae550-a664-4919-9680-be9bdc3bbd2c.png)
