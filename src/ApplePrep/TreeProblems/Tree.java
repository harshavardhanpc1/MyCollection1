package ApplePrep.TreeProblems;

/**
 * Created by intelliswift on 1/12/19.
 */
public class Tree {
    public Tree(int data){
        this.data = data;
    }
    int data;
    Tree left = null;
    Tree right = null;
    Tree rightMost = null;
    public void add(int data){
        if( data < this.data) {
            if (this.left == null) {
                this.left = new Tree(data);
            } else {
                left.add(data);
            }
        }
        else if(data > this.data){
            if (this.right == null) {
                this.right = new Tree(data);
            } else {
                right.add(data);
            }
        }
    }
    public boolean search(int i){
        if(i == this.data)
            return true;
        if (i < this.data)
          if(this.left !=null)
          {
            return left.search(i);
          }
          else
             return false;
        else
          if(this.right !=null)
         {
            return right.search(i);
         }
         else
            return false;

    }

}
