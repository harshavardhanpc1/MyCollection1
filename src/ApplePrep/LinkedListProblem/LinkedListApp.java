package ApplePrep.LinkedListProblem;

import java.util.HashSet;

/**
 * Created by intelliswift on 1/16/19.
 */
public class LinkedListApp {
        public static void main(String[]args){
            Node node = new Node(10);
            appendData(20,node);
            appendData(30,node);
            appendData(20,node);
            appendData(10,node);
            appendData(50,node);
       //     System.out.println(palandrome(node));
           node = deleteData(50,node);
           Node traverse =  node;
            while(traverse!=null){
                System.out.print(traverse.data+" ");
                traverse = traverse.next;
            }

            System.out.println();
           // node = reverseLinkedList(node);

           System.out.println("Node is circular "+ identifyCircular(node));
            deleteDuplicateData(node);
            while(node!=null){
                System.out.print(node.data+" ");
                node = node.next;
            }
        }
        public static boolean palandrome(Node node){
            if(node==null || node.next==null){
                return true;
            }
            Node head = node;
            Node fastNode = node;
            Node slowNode = node;
            Node prevNode = null;

            while(fastNode!=null && fastNode.next!=null){
                fastNode = fastNode.next.next;
                prevNode = slowNode;
                slowNode = slowNode.next;
            }
            prevNode.next = null;
               if(fastNode!=null) {
                   slowNode = slowNode.next;
               }
            slowNode = reverseLinkedList(slowNode);
            while(head!=null && slowNode!=null){
               if (head.data == slowNode.data)
               {
                   head = head.next;
                   slowNode = slowNode.next;
               }
               else
                   return false;
            }

            return true;
        }
        public static void appendData(int data,Node node){
            Node temp = node;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        public static Node deleteData(int data,Node node){
            Node temp = node;
            if(temp.data == data){
                temp = temp.next;
                return temp;
            }
            else {
                while (temp.next.data != data) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return node;
            }
        }
        public static Node reverseLinkedList(Node node){
            Node rev = null;
            Node temp;
            while(node!=null)
            {
                temp = node.next;
                node.next = rev;
                rev = node;
                node = temp;
            }
            return rev;
        }
    public static boolean identifyCircular(Node head){
        HashSet<Node> h = new HashSet();
        Node temp = head;
        while(temp!=null)
        {
            if(!h.contains(head))
                h.add(head);
            else
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static Node deleteDuplicateData(Node head){
        Node temp = head;
        while(temp!=null)
        {
            if(temp.next!=null && temp.next.data == temp.data)
            {
                temp.next = temp.next.next;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}
