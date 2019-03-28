package APrep;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by intelliswift on 1/8/19.
 */
public class ParathesisClosing {
    public static void main(String []args){
        HashMap<Character,Character> map = new HashMap();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        String q = "){)([})}";
        Stack<Character>s = new Stack();
        boolean flag = true;
        for(int i=0;i<q.length();i++){
            Character c = q.charAt(i);
            if(map.containsKey(c))
                s.push(c);
            else if(!s.isEmpty() && c==map.get(s.peek())){
                s.pop();
            }
            else {
                System.out.println("Invalied parathesis");
                flag = false;
                break;
            }
        }
        if(s.isEmpty() && flag == true){
            System.out.println("success");
        }
    }
}
