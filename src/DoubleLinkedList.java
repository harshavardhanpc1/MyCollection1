/**
 * Created by intelliswift on 4/25/18.
 */
public class DoubleLinkedList {
    public static void main(String [] args) {
        DoubleNode head = new DoubleNode(30);
        DoubleNode tail = appendTail(40,head);
        tail = appendTail(50,head);
        tail = appendTail(60,head);
        head = addFirst(10,head);
        head = addFirst(80,head);
        displayNode(head);
        System.out.println("Head"+" "+head.data);
        System.out.println("tail"+" "+tail.data);
    }
    public static DoubleNode appendTail(int val,DoubleNode head){
        DoubleNode node  = head;
        DoubleNode newNode = new DoubleNode(val);
        while(node.next != null){
            node = node.next;
        }
        node.next = newNode;
        newNode.prev = node;
        return newNode;
    }
    public static void displayNode(DoubleNode head){
       DoubleNode node  = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
////        while(node.prev != null){
////            System.out.println(node.data);
////            node = node.prev;
////        }
//        System.out.println(node.data);
    }
    public static DoubleNode addFirst(int val,DoubleNode head){
        DoubleNode new_node = new DoubleNode(val);
        if (head.prev == null){
            head.prev = new_node;
            new_node.next = head;
        }
        head = new_node;
        return head;
    }
}
