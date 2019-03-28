import java.util.*;

/**
 * Created by intelliswift on 4/22/18.
 */

//The default hashCode() method gives distinct integers for distinct objects, and the equals() method only returns true when  two references refer to the same object.
public class NewList {
    public static void main(String [] args){
          List<String>l1 = new ArrayList<String>();
          List<String>l2 = new LinkedList<String>();
          l2.add("Great");
          l1.add("I");
          l1.add("am");
          l1.add("Harsha");
          l1.add("Vardhan");
          l1.add("Harsha");
          System.out.println(l1);
          l1.add(2,"in");
        System.out.println("After changing index 2"+l1);
        System.out.println("Getting an element 3 "+l1.get(3));
        l1.remove("Harsha");
        System.out.println("After removal of object Harsha "+l1);
        l1.remove(3);
        System.out.println("After removal of index 3 "+l1);
        l1.addAll(l2);
        System.out.println("Adding all the collection l2 in l1 "+l1);
        l2.add("Harsha");
        l1.removeAll(l2);
        System.out.println("Remove all the collection l2 in l1 "+l1);
        System.out.println("Contains " +l1.contains("Harsha"));
        //Iterator
        ListIterator it = l1.listIterator();
        Iterator it2 = l1.iterator();
        while(it.hasNext())
        {
            System.out.println("ListIterator " + it.next());
        }
        while(it.hasPrevious())
        {
            System.out.println("Previous ListIterator" + it.previous());
        }
        while(it2.hasNext())
        {
            System.out.println("Iterator " + it2.next());
        }
        //Iterator for each
        for(String s: l2)
        {
            System.out.println("For each: "+s);
        }
        System.out.println("List size " + l1.size());
        System.out.println("SubList" + l1.subList(0,2));
        //Singleton example
        NewSingleton newSingleton = NewSingleton.creationSt();
        newSingleton.setName("Harsha");
        NewSingleton newSingleton2 = NewSingleton.creationSt();
        System.out.println(newSingleton2.getName());
    }
}

//Array List : Uses array.Remove element it causes shift.Good for storing and reteiving
//Linked List : Uses doubly linked list.Good for manupulating bits.
