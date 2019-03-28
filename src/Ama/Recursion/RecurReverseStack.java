package Ama.Recursion;

import java.util.Stack;

/**
 * Created by intelliswift on 3/7/19.
 */
public class RecurReverseStack {
    public static void main(String[]args){
        Stack<Integer>s = new Stack<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    public static void reverse(Stack<Integer>s){
        if(s.size() > 0) {
         int x = s.peek();
            s.pop();
            reverse(s);
            insertTheX(s, x);
        }
    }
    public static void insertTheX(Stack<Integer>s,int x){
        if(s.isEmpty()){
            s.push(x);
        }
        else
        {
            int a = s.peek();
            s.pop();
            insertTheX(s,x);
            s.push(a);
        }
    }

}
