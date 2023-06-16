package linkedlist;

public class DoublyLinkedList {
    // Given a node as prev_node, insert a new node
// after the given node
    public void InsertAfter(DoubleNode prev_Node, int new_data)
    {
        // Check if the given prev_node is NULL
        if (prev_Node == null) {
            System.out.println(
                    "The given previous node cannot be NULL ");
            return;
        }

        // 1. allocate node
        // 2. put in the data
        DoubleNode new_node = new DoubleNode(new_data);

        // 3. Make next of new node as next of prev_node
        new_node = prev_Node.next;

        // 4. Make the next of prev_node as new_node
        prev_Node.next = new_node;

        // 5. Make prev_node as previous of new_node
        new_node.prevNode = prev_Node;

        // 6. Change previous of new_node's next node
        if (new_node.next != null)
            new_node.next.next = new_node;
    }

}
