class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
         Node[] ans=new Node[2];
        Node temp=head;
        Node even =new Node(0);
        Node odd =new Node(0);
        Node evenhead=even;
        Node oddhead=odd;
        int i=0;
        while(temp!=null){
            if(i%2==1){
                even.next=new Node(temp.data);
                even=even.next;
                temp=temp.next;
            }
            else{
                odd.next=new Node(temp.data);
                odd=odd.next;
                temp=temp.next;
            }
            i++;
        }
        evenhead=evenhead.next;
        oddhead=oddhead.next;
        ans[0]=oddhead;
        ans[1]=evenhead;
        return ans;
    }
}
