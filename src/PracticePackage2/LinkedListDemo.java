package PracticePackage2;

import java.util.HashSet;

/**
 * Created by intelliswift on 9/18/18.
 */
public class LinkedListDemo {
    public static void main(String[]args){
    Nodes head = new Nodes(10);
    insert(head,20);
    insert(head,40);
    insert(head,50);
    display(head);
  //  head.next.next.next = head;
   // System.out.println("circle");
 //       display(head);
     //   System.out.println("circular linked list " + circularLinked(head));
     insertion(head,30,20);
        display(head);
}

public static void insert(Nodes head,int data){
    Nodes temp = head;
    while(temp.next!= null){
        temp = temp.next;
    }
    temp.next = new Nodes(data);
}

public static void insertion(Nodes head,int data,int check){
    Nodes temp = head;
    Nodes r;
    while(temp!=null){
        if(check == temp.data)
        {
          Nodes newnode = new Nodes(data);
          newnode.next = temp.next;
          temp.next = newnode;
        }
        temp = temp.next;
    }
}

public static void display(Nodes head){
    Nodes temp = head;
    while(temp !=null) {
        System.out.println(temp.data);
        temp = temp.next;
    }
}
public static Nodes reverse(Nodes head){
    Nodes current = head;
    Nodes prev = null;
    Nodes next;
    while(current != null)
    {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}
public static boolean circularLinked(Nodes head){
    Nodes temp = head;
    HashSet<Nodes> s1 = new HashSet<Nodes>();
    while(temp!=null)
    {
        if(!s1.contains(temp)) {
            s1.add(temp);
        }
        else
            return true;
        temp = temp.next;
    }
    return false;
}
}
