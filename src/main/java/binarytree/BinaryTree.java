package binarytree;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BinaryTree {
    BNode root;


    BinaryTree() {
        root = null;
    }

    void preorder(BNode node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.item + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }

    void postOrder(BNode node) {
        if (node == null) {
            return;
        }
        // Traverse left
        postOrder(node.left);
        // Traverse right
        postOrder(node.right);
        // Traverse root
        System.out.print(node.item + "->");
    }

    void inorder(BNode node) {
        if (node == null) {
            return;
        }
        // Traverse left
        postOrder(node.left);
        // Traverse root
        System.out.print(node.item + "->");
        // Traverse right
        postOrder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new BNode(1);
        binaryTree.root.left = new BNode(2);
        binaryTree.root.right = new BNode(4);
        binaryTree.root.left.left = new BNode(5);
        binaryTree.root.left.right = new BNode(6);
        //root, left ,right
        System.out.println("Inorder traversal");
        binaryTree.inorder(binaryTree.root);
       //left ,root ,right
        System.out.println("\nPreorder traversal ");
        binaryTree.preorder(binaryTree.root);
       //left,right, root
        System.out.println("\nPostorder traversal");
        binaryTree.postOrder(binaryTree.root);

        System.out.println(getFormatedDate());
    }
    public static String getFormatedDate(){
        String dayNumberSuffix = getDayNumberSuffix(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        SimpleDateFormat dateFormat = new SimpleDateFormat(" d'" + dayNumberSuffix + "' MMMM yyyy");
        return dateFormat.format(Calendar.getInstance().getTime());
    }

    private static String getDayNumberSuffix(int day) {
        if (day >= 11 && day <= 13) {
            return "<sup>th</sup>";
        }
        switch (day % 10) {
            case 1:
                return "<sup>st</sup>";
            case 2:
                return "<sup>nd</sup>";
            case 3:
                return "<sup>rd</sup>";
            default:
                return "<sup>th</sup>";
        }
    }

}
