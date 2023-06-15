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
        linkedList.insertAtTheBeginning(4);
        linkedList.insertAtTheBeginning(5);

        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }

    }

    // Insert at the beginning
    public void insertAtTheBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert after a node
    public void insertAfter(Node prevNode, int data) {
        Node newNode = new Node(data);

        if (prevNode == null) {
            System.out.println("prev node is null");
            return;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("linked list is empty!");
            head = newNode;
        }
        newNode.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
    }

    // Delete a node
    public void deleteNode(int position) {
        Node temp = head;
        if (position == 0) {
            head = temp.next;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        // If the key is not present
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }

    public boolean search(Node head, int data) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == data) {
                return true;
            }
            current = current.next;
        }
        return false;

    }  // Sort the linked list

    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;

                }
                current = current.next;
            }
        }
    }



   /* Worst case	Average Case

    Search	O(n)	O(n)
    Insert	O(1)	O(1)
    Deletion	O(1)	O(1)


     Space Complexity: O(n)


    */
}
