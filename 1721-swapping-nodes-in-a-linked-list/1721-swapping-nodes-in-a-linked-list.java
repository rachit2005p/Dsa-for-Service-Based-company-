class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1=head;
        ListNode temp2=head;
        int i =0;
        int len=0;
        while(temp1!=null){
            len++;
            temp1=temp1.next;
        }
        temp1=head;
        while(i<k-1){
            temp1=temp1.next;
            i++;
        }
        i=0;
        while(i<len-k){
            temp2=temp2.next;
            i++;
        }
        int temp = temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;

    return head;
    }
}