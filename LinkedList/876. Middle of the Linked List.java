/*
We will take two pointer one will be moving at normal speed and another will be moving with 2x speed so when faster moving pointer head to null the slower one is at middle 
*/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ptr=head;
        ListNode res=head;
        while(ptr != null && ptr.next != null)   {
            ptr=ptr.next.next;           // Faster pointer
            res=res.next;                //Slower pointer
        }
        return res;
    }
}
