package PracticePackage2;

/**
 * Created by intelliswift on 9/18/18.
 */
public class DoubleLinkedList {
    public static void main(String[]args){
        Noded head = new Noded(10,null,null);
        Noded tail;
        tail = appendNode(head,20);
        tail = appendNode(head,30);
        tail = appendNode(head,40);
        displayNode(head,tail);
    }
    public static Noded appendNode(Noded head,int data){
        while(head.next !=null)
            head = head.next;
        head.next = new Noded(data,null,head);
        return head.next;
    }
    public static void displayNode(Noded head,Noded tail){
        Noded temp = head;
        Noded rev = tail;
        while(temp !=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        while(rev!=null){
            System.out.print(rev.data + " ");
            rev = rev.prev;
        }
    }
}
