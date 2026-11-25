class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp =head;
    int len=0;
    
    while(temp!=null){
    len++;
    temp=temp.next;
    }
    temp = head;
    for(int i =0;i<len-n-1;i++){
        temp=temp.next;
    }
    if(len==n){
        return head.next ;
    }
    temp.next=temp.next.next;
    return head;

}
}