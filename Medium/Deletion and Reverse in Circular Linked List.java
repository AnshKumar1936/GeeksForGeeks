class Solution {
    // Function to reverse a circular linked list
   Node prev = null;
    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        if(head.data==key){
            Node curr = head;
            while(curr.next!=head){
                curr = curr.next;
            }
            head = head.next;
            curr.next = head;
            return head;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = head;
        do{
            if(curr.data==key)
                dummy.next = curr.next;
            curr = curr.next;
            dummy = dummy.next;
        }while(curr!=head);
        return head;
    }
}
