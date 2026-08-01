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
    public ListNode reverse(ListNode head) {
        if(head  ==null||head.next==null) return head;
        ListNode Next = null;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = reverse(slow);
        ListNode temp2= head;
        while(temp1!=null){
            if(temp1.val != temp2.val) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}