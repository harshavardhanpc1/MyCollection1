package Practice;

import java.util.ArrayList;
/**
 * Created by intelliswift on 12/16/18.
 */
//Stack is a lifo last in first out
public class StackImplimentation {
  public static  ArrayList<Integer> list = new ArrayList();
    public static void main (String [] args){
        push(10);
        push(20);
        push(30);
        push(40);
        System.out.println(peek());
        pop();
        System.out.println(peek());
    }
    public static void push(int i){
        list.add(i);
    }
    public static void pop(){
        list.remove(list.size()-1);
    }
    public static int peek(){
       return list.get(list.size()-1);
    }
}
