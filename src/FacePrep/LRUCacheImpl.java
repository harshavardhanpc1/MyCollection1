package FacePrep;

/**
 * Created by intelliswift on 2/2/19.
 */
public class LRUCacheImpl {

    public static void main(String[]args){
             LRUCache lru = new LRUCache(5);
             System.out.println("Adding to first element");
             lru.set(1,10);
             lru.display();
             lru.set(2,20);
             lru.set(3,30);
             lru.set(4,40);
        System.out.println("Adding to less than capacity");
             lru.display();
             lru.set(5,50);
        System.out.println("Adding to maximum capacity");
             lru.set(6,60);
             lru.display();
        System.out.println("Modifying the value of key 4");
             lru.set(4,41);
             lru.display();
        System.out.println("Adding more the the capacity");
             lru.set(7,70);
             lru.display();
        System.out.println("No key in the linked list");
        //System.out.println(lru.get(1));
        System.out.println("Key 5 exist in the linked list,return value and put to first "+lru.get(5));
        lru.display();
        System.out.println(lru.get(2));
        System.out.println(lru.map);
        lru.display();
    }
}
