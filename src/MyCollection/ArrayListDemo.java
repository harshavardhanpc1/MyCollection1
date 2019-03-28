package MyCollection;

import java.util.*;

/**
 * Created by intelliswift on 12/3/18.
 */
public class ArrayListDemo {
    public static void main(String[]args){
        ArrayList<String> list = new<String>ArrayList();
        list.add("Harsha");
        list.add("Ash");
        list.add("Nar");
        list.add("Bal");
      //  Collections.sort(list);
//        for(int i : list){
//            System.out.println(i);
//        }
//       Iterator i = list.iterator();
//        while(i.hasNext()){
//           System.out.print(i.next() + " ");
//       }
        Collections.sort(list);
        ListIterator j = list.listIterator();
               while(j.hasNext()){
           System.out.print(j.next() + " ");
       }
System.out.println();
        while(j.hasPrevious()){
            System.out.print(j.previous()+ " ");
        }


    }
}
