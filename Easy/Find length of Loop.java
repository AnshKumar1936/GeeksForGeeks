
class Solution {
    // Function to find the length of a loop in the linked list.
     public static int fun(Node node,int ans[])
    {
        if(node==null) return 0;
        if(node.data==-1)
        {
            node.data=-2;
            return 1;
        }
        else 
        {
            node.data=-1;
            int c= fun(node.next,ans);
            if(node.data==-2)
                ans[0]=c;
            return c+1;
        }
    }
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        int ans[]=new int[1];
        int t= fun(head,ans);
        return ans[0];
    }
}
