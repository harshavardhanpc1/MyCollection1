package PracticePackage2;

/**
 * Created by intelliswift on 9/16/18.
 */
public class BinaryTree {
    public static void main (String[]args){
        Node n1 = new Node(10);
        n1.insert(20);
        n1.insert(30);
        n1.insert(5);
        n1.insert(2);
        n1.insert(1);
        System.out.println(n1.search(1));
    }
}
