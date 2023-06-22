package binarysearch;

public class BinarySeachTree {
    BSNode root;

    public BinarySeachTree() {
        root = null;
    }

    void insertNewKey(int item) {
        root = insert(root, item);
    }

    BSNode insert(BSNode root, int item) {
        if (root == null) {
            return new BSNode(item);
        }
        if (item < root.data) {
            root.left = insert(root.left, item);
        } else {
            root.right = insert(root.right, item);
        }
        return root;
    }

    boolean searchKey(BSNode root, int item) {
        if (root == null) {
            return false;
        }
        if (root.data == item) {
            return true;
        }
        if (item < root.data) {
            return searchKey(root.left, item);
        } else {
            return searchKey(root.right, item);
        }
    }

    // Inorder Traversal
    void inorderRec(BSNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " -> ");
            inorderRec(root.right);
        }
    }

    BSNode deleteNode(BSNode root, int key) {
        // Return if the tree is empty
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }else{
            // If the node is with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // If the node has two children
            // Place the inorder successor in position of the node to be deleted
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    // Find the inorder successor
    int minValue(BSNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }


    public static void main(String[] args) {
        BinarySeachTree tree = new BinarySeachTree();

        tree.insertNewKey(8);
        tree.insertNewKey(3);
        tree.insertNewKey(1);
        tree.insertNewKey(6);
        tree.insertNewKey(7);
        tree.insertNewKey(10);
        tree.insertNewKey(14);
        tree.insertNewKey(4);
        System.out.println("Searching tree::::::::::::::::");
        System.out.println(tree.searchKey(tree.root, 4));
       /* System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteKey(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();*/
    }

   /* Operation	Best Case Complexity	Average Case Complexity	Worst Case Complexity
    Search	O(log n)	O(log n)	O(n)
    Insertion	O(log n)	O(log n)	O(n)
    Deletion	O(log n)	O(log n)	O(n)*/

   /* Space Complexity
    The space complexity for all the operations is O(n).*/
}
