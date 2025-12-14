public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

       ListNode temp = headA;
       ListNode temp1 = headB;
       int countA=0;
       int countB=0;
       while(temp!=null) {
        countA++;
        temp=temp.next;
       }
       while(temp1!=null) {
        countB++;
        temp1=temp1.next;
       }
       temp=headA;
       temp1=headB;
       if(countA>countB){
        int steps= countA-countB;
        for(int i=1;i<=steps;i++) {
            temp=temp.next;
        }
       }
       else{
        int steps = countB-countA;
        for(int i=1;i<=steps;i++) {
            temp1=temp1.next;
        }
       }
       while(temp!=temp1) {
        temp=temp.next;
        temp1=temp1.next;
       }
       return temp;
    }
}
