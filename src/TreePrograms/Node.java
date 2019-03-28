package TreePrograms;

/**
 * Created by intelliswift on 4/30/18.
 */
public class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null)
                left = new Node(value);
            else
                left.insert(value);
        }
        if (value > data) {
            if (right == null)
                right = new Node(value);
            else
                right.insert(value);
        }
    }
    public boolean search(int value){
        if (value == data){
            return true;
        }
        if (value < data) {
            if (left == null){
                return false;
            }
            else return left.search(value);
        }
        else
            if (right == null)
                return false;
            else return right.search(value);

    }


}
