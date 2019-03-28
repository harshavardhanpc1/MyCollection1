package APrep.ComparatorComparableProblems;

import java.util.*;

/**
 * Created by intelliswift on 1/21/19.
 */
public class MovieImpl {
    public static void main(String[]args){
        List<Movie> list = new LinkedList();
        list.add(new Movie(2,"Harry"));
        list.add(new Movie(3,"Abhay"));
        list.add(new Movie(1,"Balu"));
        for(Movie m:list){
            System.out.println(m.id+" "+m.name);
        }
        Collections.sort(list);
        for(Movie m:list){
            System.out.println(m.id+ " "+m.name);
        }
        MovieNameSort namesort = new MovieNameSort();
        Collections.sort(list,namesort);
        for(Movie m:list){
            System.out.println(m.name+" "+m.id);
        }
        HashSet<Movie>st = new HashSet();
        st.addAll(list);
        st.add(new Movie(1,"Harsha"));
        st.add(new Movie(3,"Abhay"));
        System.out.println("done this is done");
        for(Movie m:st){
            System.out.println(m.name+" "+m.id);
        }
    }
}
