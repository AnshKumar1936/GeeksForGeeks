class Solution {
    public int getCount(Node head) {
        Node slow=head;
        int count=0,temp=1;
        Node fast=head.next;
        while(fast!=null){
            count++;
            if(fast.next==null){
                temp=0;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return 2*count+temp;
    }
}
