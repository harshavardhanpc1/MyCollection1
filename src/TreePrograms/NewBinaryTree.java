package TreePrograms;

/**
 * Created by intelliswift on 4/30/18.
 */
public class NewBinaryTree {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.insert(5);
        node.insert(4);
        node.insert(8);
        node.insert(9);
        node.insert(20);
        node.insert(15);
        System.out.println(node.search(11));
        System.out.println("Inorder traversal");
        inordertraversal(node);
        System.out.println("");
        System.out.println("Preorder traversal");
        preordertraversal(node);
        System.out.println("");
        System.out.println("Postorder traversal");
        postordertraversal(node);
        System.out.println();
        System.out.println(sumRootToLeaf(node, 45));

    }

    //visit root first and then left node and right node
    public static void preordertraversal(Node node) {
        if (node != null) {
            visit(node);
            preordertraversal(node.left);
            preordertraversal(node.right);
        }

    }

    //visit left and root and right
    public static void inordertraversal(Node node) {
        if (node != null) {
            inordertraversal(node.left);
            visit(node);
            inordertraversal(node.right);
        }
    }

    //left right and then root
    public static void postordertraversal(Node node) {
        if (node != null) {
            postordertraversal(node.left);
            postordertraversal(node.right);
            visit(node);
        }
    }

    public static void visit(Node node) {
        System.out.print(node.data + ",");
    }

    public static boolean sumRootToLeaf(Node node, int target) {

        if (node == null)
            return (target == 0);
        else {
            boolean ans = false;
            int sum = target - node.data;
            if (sum == 0 && node.left == null && node.right == null)
                return true;
            if (node.left != null)
                ans = ans || sumRootToLeaf(node.left, sum);
            if (node.right != null)
                ans = ans || sumRootToLeaf(node.right, sum);
            return ans;
        }

    }


}
