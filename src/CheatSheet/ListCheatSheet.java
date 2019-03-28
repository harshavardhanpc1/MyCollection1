package CheatSheet;

import java.util.*;

/**
 * Created by intelliswift on 2/1/19.
 */
public class ListCheatSheet {
    public static void main(String[]args){
        List<String> l = new ArrayList();
        List<Integer>al = new ArrayList();
        LinkedList<Integer> ll = new LinkedList();
        //adding the values to Arraylist
        l.add("All");
        l.add("The");
        l.add("Best");
        //getting values from list
        System.out.println("Getting the values from any list from index 2: "+l.get(2));

        //Checking whether values present in list
        al.add(5);
        al.add(6);
        al.add(7);
        System.out.println("Whether value is present in any list: " + l.contains(3));
        //Remove a element from index
        System.out.println("Remove an element from list returns index from where it is removed: "+ l.remove(2));
        System.out.println("After removal at index 2: " + l);
      //  System.out.println("Remove an element from list returns index from where it is removed: "+ l.removeAll(l));
       // System.out.println("After removing everything "+l);
        //Iteration on all list using for each;
        for(String i:l){
            System.out.println(" "+i);
        }
        //General Iteration using the iterator of list
        Iterator i = l.iterator();
        while(i.hasNext()){
            System.out.print(" Next "+i.next());

        }
        System.out.println();
        //List Iterator using the iterator of List
        ll.add(1);
        ll.add(3);
        ll.add(4);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ListIterator<Integer> j = ll.listIterator();
        //Iterate forward
        while(j.hasNext()) {
            System.out.print("Next "+ j.next() + " ");
        }
        System.out.println();
        //Iterate backward
        while(j.hasPrevious()){
            System.out.print("Previous "+j.previous()+" ");
        }
        System.out.println();
        //Modification during iteration
        //Removing odd numbers during iteration (Dynamic shrink of list)
        System.out.println("list before removing ll:"+ll);
        while(j.hasNext()) {
            if(j.next()%2==0)
                j.remove();
        }
        System.out.println("After removing the even number while iteration from from the list ll:"+ll);
        //Adding the numbers in the list during iteration (dynamic elogation of list)
        while(j.hasPrevious()){
            if(j.previous()%2!=0){
                j.add(2);
            }
        }
        while(j.hasNext()){
            if(j.next()%2!=0){
                j.add(4);
            }
        }

        System.out.println("After adding(2 after every odd number) while iteration in the list ll:"+ll);
        //Sorting the list
        Collections.sort(ll);
        System.out.println("After sorting "+ll);
        //Getting max element from list
        Integer max = Collections.max(ll);
        Integer min = Collections.min(ll);
        System.out.println(" maximum "+max+" minimum "+min);
        //Conversion list to set
        Set t = new HashSet();
        t.addAll(ll);
        System.out.println("List to Set"+t);
        ll.removeAll(ll);
        ll.addAll(t);
        System.out.println("Set to list ll: "+ll);
        System.out.println("list al: "+al);
        //Appending to the list
        ll.addAll(al);
        System.out.println("Appending list or set to list "+ll);
        //Converting list to array
        Integer[] arr = ll.toArray(new Integer[ll.size()]);
              //     Object[] arr1  = ll.toArray();
        System.out.println("list to array "+arr[1]);

    }
}
