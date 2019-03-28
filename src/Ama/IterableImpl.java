package Ama;

import java.util.Iterator;
import java.util.List;

/**
 * Created by intelliswift on 2/20/19.
 */

public class IterableImpl implements Iterator{
    public IterableImpl(List<List<Integer>> myData){
        this.myData =  myData;
    }
//    private String myData[] = {"1", "2", "3", "4"};
    private List<List<Integer>>myData;
    private int position = 0;
    private int temp_pos = 0;
    public boolean hasNext() {
        if (position < myData.size())
            return true;
        else
            return false;
    }

    public Integer next() {
            return null;
    }
    @Override
    public void remove() {

    }
}

