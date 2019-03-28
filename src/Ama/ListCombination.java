package Ama;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelliswift on 2/23/19.
 */
public class ListCombination {
    public static void main(String[] args) {
        List<List> list = new ArrayList();
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list.add(list1);
        list.add(list2);
        List<Integer> list3 = new ArrayList();
        list3.add(6);
        list3.add(7);
        list.add(list3);
        int index = 0;
     recursionCombinationList(list, index,"");
    }


    public static void recursionCombinationList(List list, int index,String current) {
        List temp_list = (List) list.get(index);
        if(index >= list.size()-1)
        {
            for (int i = 0; i < temp_list.size(); i++) {
               System.out.print(current + " " + temp_list.get(i));
               System.out.println();
            }
            return;
        }
        else {
            index++;
            for (int i = 0; i < temp_list.size(); i++) {
                recursionCombinationList(list, index,current+" " + temp_list.get(i));
            }
        }
    }

}
