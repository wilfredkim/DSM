package linkedlist;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        // Connect nodess
        linkedList.head.next = second;
        second.next = third;
        // printing node-value
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }

   /* Worst case	Average Case

    Search	O(n)	O(n)
    Insert	O(1)	O(1)
    Deletion	O(1)	O(1)


     Space Complexity: O(n)


    */
}
