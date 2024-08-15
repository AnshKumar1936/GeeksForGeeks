class Solution {

    public int helperFun(Node temp) {
        if (temp == null) {
            return 1; // Base case: if we've reached beyond the last node, we need to add 1 (carry).
        }

        // Recursive call to process the next node
        int carry = helperFun(temp.next);

        // Add carry to the current node's data
        temp.data += carry;

        // Check if there is a carry-over after adding
        if (temp.data < 10) {
            return 0; // No carry, so return 0.
        }

        // If current node's data is 10 or more, set it to 0 and return 1 (carry to the next node).
        temp.data = 0;
        return 1;
    }

    public Node addOne(Node head) {
        // Start the recursive function
        int carry = helperFun(head);

        // If there's still a carry left, we need to create a new node at the beginning
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}
