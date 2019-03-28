package PracticePackage2;

/**
 * Created by intelliswift on 9/18/18.
 */
public class Noded {
    int data;
    Noded next = null;
    Noded prev = null;
    public Noded(int data,Noded next,Noded prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
