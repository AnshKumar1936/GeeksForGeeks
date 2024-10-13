class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if(head==null){
            return;
        }
        Node node = head;
        while(node !=null && node.next != null){
            node.next = node.next.next;
            node = node.next;
        }
    }
}
