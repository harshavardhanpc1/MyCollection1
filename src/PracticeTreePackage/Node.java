package PracticeTreePackage;

/**
 * Created by intelliswift on 8/21/18.
 */
public class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
    public void insert(int data){
        if(this.data < data){
            if(left == null){
                left = new Node(data);
            } else
            {
                left.insert(data);
            }
        } else if(this.data > data){
            if(right == null){
                right = new Node(data);
            } else
            {
                right.insert(data);
            }
        }
    }
    public void search(int data){
        if(this.data == data){
            System.out.println("true");
            return;
        } else if(right!= null && this.data > data){
            right.search(data);
        } else if(left!=null && this.data < data){
             left.search(data);
        } else
        System.out.println("false");
        return;
    }
}
