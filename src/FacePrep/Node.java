package FacePrep;

/**
 * Created by intelliswift on 2/2/19.
 */
public class Node {
    int key;
    int value;
    Node prev = null;
    Node next = null;
    public Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}
