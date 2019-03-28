package CheatSheet;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by intelliswift on 2/1/19.
 */
public class QueueDeQueueStackCheatSheet {
    public static void main (String[]args){
        Queue<Integer> q = new LinkedList();
        //Adding elements in queue in order of insertion
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        //Check if queue is empty
        System.out.println(q.isEmpty());
        //Print top most element that is first in
        System.out.println("Returning the removed element"+q.peek());
        //Remove the first in
        System.out.println("Returning the removed element"+q.poll());
        System.out.println("After removing first in"+q);
        System.out.println("contains element in queue"+q.contains(50));
       // System.out.println("After removing next first in"+q.containsAll(list));
        //Can also use remove
        System.out.println("Returning the removed element "+q.remove());
        System.out.println("After removing next first in"+q);
        //Double ended queue
        Deque<Integer> p = new LinkedList();
        //Check if queue is empty
        System.out.println(p.isEmpty());
        //Adding element at last
        System.out.println(p.add(10));
        p.add(20);
        System.out.println(p.offer(50));
        System.out.println(p);
        System.out.println(p);
        //Adding element at last
        p.addLast(30);
        System.out.println(p);
        System.out.println(p.offerFirst(60));
        System.out.println(p);
        //Adding element at first
        p.addFirst(40);
        System.out.println(p);
        //Getting first element without deleting and returning element
        System.out.println(p.getFirst());
        System.out.println(p.peek());
        //Getting Last element without deleting
        System.out.println(p.getLast());
        System.out.println(p);
        //verify contains an element without deleting
        System.out.println(p.contains(10));
        //removing first element and returning element
        System.out.println(p.poll());
        System.out.println(p);
        //removing last element and returning element
        System.out.println(p.pollLast());
        System.out.println(p);
        //Stack cheat sheet
        System.out.println("Stackdemo");
        Stack<Integer>st = new Stack();
        //Check stack is empty
        System.out.println(st.isEmpty());
        //Adding elements in stack;
        st.add(4);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        //See the last element
        System.out.println(st.peek());
        System.out.println(st.contains(40));
        //To remove the last element and return it
        System.out.println(st.pop());
        System.out.println(st);

    }
}
