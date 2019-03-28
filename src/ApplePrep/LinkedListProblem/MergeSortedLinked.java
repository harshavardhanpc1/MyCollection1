package ApplePrep.LinkedListProblem;

/**
 * Created by intelliswift on 1/22/19.
 */
public class MergeSortedLinked {
    public static void main(String[]args){
       Node l1 = new Node(5);
      // l1.next = new Node(2);
      //  l1.next.next = new Node(4);
        Node l2 = new Node(1);
       l2.next = new Node(2);
       l2.next.next = new Node(4);
        Node l3 = mergeSortedNode(l1,l2);
        while(l3!=null){
            System.out.print(l3.data+" ");
            l3 = l3.next;
        }
    }
     public static Node mergeSortedNode(Node l1,Node l2){
        Node temp = null;
         if (l1 == null && l2 == null) return null;
         else if (l1 == null && l2 != null) return l2;
         else if (l1 != null && l2 == null) return l1;
         int count = 0;
         Node templ1 = l1;
        while(l1!=null && l2!=null) {
            if(l1.data == l2.data){
                temp = l2;
                l2 = l2.next;
                temp.next = l1.next;
                l1.next = temp;

            }
            else if(l1.data < l2.data) {
                if (l1.next != null) {
                    if (l1.next.data > l2.data) {
                        temp = l2;
                        l2 = l2.next;
                        temp.next = l1.next;
                        l1.next = temp;
                    }
                }
            }
             else if(l1.data > l2.data){
                    temp = l2;
                    l2 = l2.next;
                    temp.next = l1;
                    l1 = temp;
                    templ1 = l1;
                    continue;
                }
            if(l1.next == null)
                break;
                l1 = l1.next;
        }
        if(l2!=null){
            l1.next = l2;
            l2 = l2.next;
        }
        return templ1;
    }
}
