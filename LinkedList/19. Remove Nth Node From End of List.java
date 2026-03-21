  class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
      ListNode dummy=new ListNode(0);
      dummy.next=head;

      ListNode curr=dummy;
      ListNode second=dummy;

      for(int i=0;i<=n;i++){
        curr=curr.next;                            //Move the node by n element
      }

      while(curr != null){
        curr=curr.next;                            //Move this node to last so that second node will stop before nth element from the end
        second=second.next;
      }
      second.next=second.next.next;                //skip the nth element from end

      return dummy.next;                        //returning  the head
    }
  }
