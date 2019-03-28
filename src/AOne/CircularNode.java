package AOne;

import java.util.HashSet;

/**
 * Created by intelliswift on 8/11/18.
 */
public class CircularNode {
    public static void main(String []args){
        Node head = new Node(10,null);
        head.next = new Node(20,null);
        head.next.next = new Node(30,null);
        head.next.next.next = head;
      //head.next.next.next.next = new Node(40,null);
        display(head);
        boolean var = circular(head);
        System.out.println("It is circular "+var);
    }
    public static void display(Node head){
        Node node = head;
        while(node !=null){
            System.out.println(node.data);
            node = node.next;
            if (node == head){
                break;
            };
        }
    }
    public static boolean circular(Node head){
        HashSet h  = new HashSet<Node>();
        Node node = head;
        while(node!=null){
            if(h.contains(node))
                return true;
            else
                h.add(node);
            node = node.next;
        }
        return false;

    }
}
