package Algorithms;

import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 * Created by intelliswift on 3/12/19.
 */
public class SortStack {
    public static void main(String[]args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(5);
        s.push(1);
        s.push(3);
        s.push(2);
        sortImpl(s);
        System.out.println(s);
    }
    public static void sortImpl(Stack<Integer>s){
        if(!s.isEmpty()) {
            int k = s.pop();
            sortImpl(s);
            sortHelp(s, k);
        }
    }

    public static void sortHelp(Stack<Integer>s,int k){
        if(s.isEmpty() || k > s.peek()){
            s.push(k);
            return;
        }
            int l = s.pop();
            sortHelp(s,k);
            s.push(l);
    }
}
