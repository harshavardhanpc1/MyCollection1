package PracticePackage;

/**
 * Created by intelliswift on 8/5/18.
 */
public class LinkedListDemo {
    public static void main(String []args) {

        Nodes head = new Nodes(10);
        append(20,head);
        append(30,head);
        append(40,head);
        remove(30,head);
        head = reverse(head);
        display(head);
    }
    public static void append(int i,Nodes head){
        Nodes node = head;
        while(node.next!=null){
            node = node.next;
        }
        node.next = new Nodes(i);
    }
    public static void display(Nodes head){
        Nodes node = head;

        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public static void remove(int k,Nodes head){
        Nodes node = head;
        while (node.next !=null)
        {
            if (node.next.data == k)
                node.next = node.next.next;
            node = node.next;
        }
    }
    public static Nodes reverse(Nodes head) {
        Nodes current = head;
        Nodes next = null;
        Nodes prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }



}
