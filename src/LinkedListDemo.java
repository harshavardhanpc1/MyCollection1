/**
 * Created by intelliswift on 4/24/18.
 */
public class LinkedListDemo {
    public static void main(String [] args){
        Node head = new Node(10);
        append(head,20);
        insert(head,30);
        insert(head,50);
        insert(head,15);
        display(head);
       // Node reverse = reverse(head);
       // display(head);
        remove(head,30);
        display(head);

    }
    public static void append (Node head,int val){
        Node node = head;
        while (node.next != null)
        {
            node = node.next;
        }
        node.next = new Node(val);

    }

    public static void remove (Node head,int val){
        Node node = head;
        while (node.next !=null)
        {
            if (node.next.data == val)
                node.next = node.next.next;
            node = node.next;
        }
    }
    public static void display (Node head)
    {
        Node node = head;
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void insert (Node head,int val)
    {
        int flag = 0;
        Node node = head;
        while (node.next !=null)
        {
            if (val > node.data && val < node.next.data)
            {
                Node new_node = new Node(val);
                new_node.next = node.next ;
                node.next = new_node;
                flag = 1;
            }
            node = node.next;
        }
        if (flag == 0)
        node.next = new Node(val);
    }
    public static Node reverse (Node head){
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
     return prev;
    }
}
