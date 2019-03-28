package FacePrep;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by intelliswift on 2/2/19.
 */
public class LRUCache {
   int capacity,count;
   Node head = new Node(0,0);
   Node tail = new Node(0,0);
    Map<Integer,Node> map;
   public LRUCache(int capacity){
       this.capacity = capacity;
       count = 0;
       head.next = tail;
       tail.prev = head;
       head.prev = null;
       tail.next = null;
       map = new HashMap();
   }

  public void addhead(Node node){
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
  }
  public void removeNode(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
  }
  public int get(int key){
      if(map.get(key)!=null){
          Node node = map.get(key);
          removeNode(node);
          addhead(node);
          return node.value;
      }
      else
          return -1;
  }
  public void set(int key,int value){
      if(map.get(key)!=null){
          Node node = map.get(key);
          node.value = value;
          removeNode(node);
          addhead(node);
      }
      else {
          Node node = new Node(key, value);
          map.put(key,node);
          if(count <capacity){
              addhead(node);
              count++;
          }
          else
          {
              map.remove(tail.prev.key);
              removeNode(tail.prev);
              addhead(node);
          }
      }
  }
  public void display(){
      System.out.println(map);
      Node node = head.next;
      while(node!=tail) {
          System.out.print("("+node.key + "," + node.value +")"+ ",");
          node = node.next;
      }
      System.out.println();
  }

}

