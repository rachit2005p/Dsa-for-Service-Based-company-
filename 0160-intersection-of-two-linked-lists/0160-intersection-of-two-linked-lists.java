
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int len1=0,len2=0;
        while(temp1!=null){
            len1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            len2++;
            temp2=temp2.next;
        }
    temp1 = headA;
    temp2 = headB;
   int dif =0;
        if(len1>len2){
            dif=len1-len2;
        for(int i =0;i<dif;i++){
            temp1=temp1.next;
        }
        }
        else{
            dif=len2-len1;
         for(int j =0;j<dif;j++){
            temp2=temp2.next;
        }   
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

    }
}