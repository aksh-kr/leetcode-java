class Solution {
public ListNode removeNodes(ListNode head) {
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy;
ListNode curr = dummy;
ListNode temp = dummy;
while(curr != null && curr.next != null && temp != null) {
prev = curr;
curr = curr.next;
temp = curr.next;
if(curr.val < temp.val) {
prev.next = temp;
curr = temp;
}
temp = temp.next;
}
return dummy.next;
}
}