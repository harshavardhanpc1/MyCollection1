package PracticeTreePackage;

/**
 * Created by intelliswift on 8/21/18.
 */
public class BinaryTree {
    public static void main(String[]args){
        Node tree = new Node(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(5);
        tree.insert(6);
        tree.insert(4);
        tree.search(6);
        System.out.println(sumToRoot(tree,60));
    }
    public static boolean sumToRoot(Node tree,int target){
        if(tree==null){
            return (target == 0);
        }
        boolean ans = false;
        int sum = target - tree.data;
        if(sum == 0 && tree.left == null && tree.right == null)
            return true;
        if(tree.left!=null){
            ans = ans || sumToRoot(tree.left,sum);
        }
        if(tree.right!=null){
           ans = ans || sumToRoot(tree.right,sum);
        }
        return ans;
    }
}
