package APrep.LinkedListProblem;

import java.util.HashSet;

/**
 * Created by intelliswift on 1/16/19.
 */
public class CircularLinkedList {
public static void main(String[]args){
    Nodes head = null;
    head = addData(10,head);
    head = addData(20,head);
    head = addData(30,head);
    head = addData(40,head);
    Nodes temp = head;
    do
    {
        System.out.println(temp.data);
        temp = temp.next;
    } while(temp!=head);
    System.out.println("Circular "+identifyCircular(head));
}
public static Nodes addData(int data,Nodes head){
    Nodes new_node = new Nodes(data);
    new_node.next = head;
    Nodes temp = head;
    if(head!=null)
    {
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        temp.next = new_node;
    }
    else {
        new_node.next = new_node;
      //  head = new_node;
    }
    head = new_node;
   return head;
}
public static boolean identifyCircular(Nodes head){
    HashSet<Nodes>h = new HashSet();
    Nodes temp = head;
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
}
