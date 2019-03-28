package PracticePackage2;

/**
 * Created by intelliswift on 9/16/18.
 */
public class Node {
    public int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
    public void insert(int data){
        if(data < this.data){
            if(left == null) {
                left = new Node(data);
            } else
            {
                left.insert(data);
            }
        }
        else if (data > this.data){
            if(right == null)
            right = new Node(data);
            else
                right.insert(data);
        }
    }
    public boolean search(int data){
        if(this.data == data){
            return true;
        }
        if(data < this.data){
           if(left != null)
            return left.search(data);
           else
               return false;
        }
        if(data > this.data) {
            if (this.right != null)
              return  right.search(data);
            else
                return false;
        }
        return false;
    }
}
