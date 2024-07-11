class Solution {
    Node nxt = null;
    public void populateNext(Node root) {
        if(root==null){
            return;
        }
        
        populateNext(root.right);
        root.next=nxt;
        nxt=root;
        populateNext(root.left);
    }
}
