package ApplePrep.TreeProblems;

import java.util.*;

/**
 * Created by intelliswift on 1/12/19.
 */
class Value {
    int min;
    int max;
}
public class TreeApplication {
public Tree prev = null;
    public static void main(String[]args){
     //  Tree bt = new Tree(5);
        Tree bt = new Tree(4);
        bt.left = new Tree(2);
        bt.right = new Tree(5);
        bt.left.left = new Tree(1);
        bt.right.left = new Tree(3);
//       bt.add(3);
//       bt.add(7);
//       bt.add(4);
//       bt.add(1);
//       bt.add(6);
//       bt.add(9);
//       bt.add(8);
//       bt.add(10);
//       bt.add(11);
       List<List<Integer>>list = new LinkedList();
       Value val = new Value();
//        bt.add(12);

 //      System.out.println(bt.search(7));
//       preorderTraversal(bt);
//       System.out.println();
//       postorderTraversal(bt);
//        System.out.println();
//        inorderTraversal(bt);
//        int sum = 0;
////        sumFromBranchToRoot(bt,sum);
//        Map<Integer,Integer> m = new HashMap ();
////        sum = 0;
//        m = deepestNodeTree(bt,m,sum);
////        Integer maxValueInMap=(Collections.max(m.values()));
//        for(Map.Entry k:m.entrySet())
//        {
//            System.out.println(k.getKey()+" "+k.getValue());
//        }
       //levelOrderQueue(bt);
     //   zigZag(bt);
       //System.out.println(height(bt));

//       levelByLevel(bt);
        //allRootNode(bt,0);
      //  sumRootNode(bt,29);

      //  levelRootNode(bt,0);
   //     Result result = height1(bt);
      //  System.out.println(result.node.data);
        verticalNode(bt,val,list);
//        for(List<Integer>i:list){
//            for(Integer j:i){
//                System.out.print(j+",");
//            }
//            System.out.println();
//        }
        System.out.println(isValidBST(bt));

    }
    public static void preorderTraversal(Tree bt){
        if(bt!=null) {
            visit(bt);
            preorderTraversal(bt.left);
            preorderTraversal(bt.right);
        }
    }

    public static void postorderTraversal(Tree bt){
        if(bt!=null) {
            postorderTraversal(bt.left);
            postorderTraversal(bt.right);
            visit(bt);
        }
    }

    public static void inorderTraversal(Tree bt){
        if(bt!=null) {
            inorderTraversal(bt.left);
            visit(bt);
            inorderTraversal(bt.right);
        }
    }
    public static void visit(Tree bt){
        System.out.print(bt.data+ " ");
    }
    public static void sumFromBranchToRoot(Tree bt,int sum){
        if(bt == null)
            return;
        else
        {
            sum = sum + bt.data;

            if(bt.left!=null)
            {
                sumFromBranchToRoot(bt.left,sum);
            }
            if(bt.right!=null)
            {
                sumFromBranchToRoot(bt.right,sum);
            }
            if(bt.right == null && bt.left == null )
            {
                System.out.println("Sum at root " + sum);
            }
        }
    }
    public static Map<Integer,Integer> deepestNodeTree(Tree bt,Map<Integer,Integer> m,int sum){
        sum++;
        if(bt==null)
            return m;
        else {
            if (bt.left != null)
                deepestNodeTree(bt.left, m, sum);
            if (bt.right != null)
                deepestNodeTree(bt.right, m, sum);
            if (bt.left == null && bt.right == null) {
                m.put(bt.data, sum);
            }
            return m;
        }
    }
//    public static void levelOrderQueue(Tree root){
//        Queue q = new LinkedList();
//        int levelNodes =0;
//        if(root==null) return;
//        q.add(root);
//        while(!q.isEmpty()){
//            levelNodes = q.size();
//            while(levelNodes>0){
//                Tree n = (Tree)q.remove();
//                System.out.print(" " + n.data);
//                if(n.left!=null) q.add(n.left);
//                if(n.right!=null) q.add(n.right);
//                levelNodes--;
//            }
//            System.out.println("");
//        }
//    }
    public static void  levelOrderQueue(Tree bt){
        int count = 0;
        Queue q = new LinkedList();
        q.add(bt);
        while(!q.isEmpty()){
            int level = q.size();
            while(level>0){
                Tree n = (Tree)q.remove();
                System.out.print(n.data+" ");
                if(n.left!=null)q.add(n.left);
                if(n.right!=null)q.add(n.right);
                level --;
                if(level>0)
               n.rightMost = (Tree)q.peek();
                else
                    n.rightMost = null;
            }
            System.out.println("");
        }
        System.out.println(bt.left.left.rightMost.rightMost.data);
    }
    public static void zigZag(Tree bt){
        int count = 2;
        Deque<Tree> q = new LinkedList();
        List<Integer>l = new LinkedList();
        int levelNodes =0;
        if(bt==null) return;
        q.add(bt);
        while(!q.isEmpty()){
            if (count%2 == 0)
            {
                Iterator<Tree>i = q.descendingIterator();
                while(i.hasNext())
                {
                    l.add(i.next().data);
                }
            }
            else {
                Iterator<Tree> i = q.iterator();
                while (i.hasNext()) {
                    l.add(i.next().data);
                }
            }
            count++;
            levelNodes = q.size();
            while(levelNodes>0){
                Tree n = q.remove();
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
                levelNodes--;
            }
        }
        for(Integer i: l){
            System.out.print(i);
        }
        }

    public static int height(Tree bt){
        if (bt==null)
            return 0;
        else {
            int lheight = height(bt.left);
            int rheight = height(bt.right);
            if (lheight > rheight) {
                return lheight + 1;
            } else
                return rheight + 1;
        }
    }

    public static void levelByLevel(Tree bt){
        int height = height(bt);
        for(int i=0;i<height;i++) {
            printLevel(bt, i);
            System.out.println();
        }
    }
    public static void printLevel(Tree bt,int level){
        if(bt==null)
            return;
        if(level == 0) {
            System.out.print(bt.data + " ");
            return;
        }
        printLevel(bt.left,level-1);
        printLevel(bt.right,level-1);
    }
    public static Map<Integer,Integer> deepestNodeTree1(Tree bt,Map<Integer,Integer> m,int sum){
        sum++;
        if(bt==null)
            return m;
        else {
            m.put(bt.data,sum);
            if (bt.left != null)
                deepestNodeTree1(bt.left, m, sum);
            if (bt.right != null)
                deepestNodeTree1(bt.right, m, sum);
            if (bt.left == null && bt.right == null) {
                m.put(bt.data, sum);
            }
            return m;
        }
    }

    public static boolean sumRootToLeaf(Tree node, int target) {

        if (node == null)
            return (target == 0);
        else {
            boolean ans = false;
            int sum = target - node.data;
            if (sum == 0 && node.left == null && node.right == null)
                return true;
            if (node.left != null)
                ans = ans || sumRootToLeaf(node.left, sum);
            if (node.right != null)
                ans = ans || sumRootToLeaf(node.right, sum);
            return ans;
        }

    }


//    public Result deepestNode(Tree bt){
//        if(bt.left==null && bt.right==null)
//            return new Result(bt,0);
//        else if {
//            Result l = deepestNode(bt.left);
//            Result r = deepestNode(bt.right);
//            if(l.dist<r.dist)
//              return new Result(bt,r.dist+1);
//            if(l.dist>r.dist)
//                return new Result(bt,l.dist+1);
//        }
//        return Result;
//    }

public static void allRootNode(Tree bt,int sum){
        sum= sum + 1;
    if(bt.left!=null){allRootNode(bt.left,sum);}
    if(bt.right!=null){allRootNode(bt.right,sum);}
    if(bt.left==null && bt.right==null){
        System.out.println("this"+bt.data +" "+ sum);
    }
}

    public static void sumRootNode(Tree bt,int target){
        target = target - bt.data;
        if(bt.left!=null)sumRootNode(bt.left,target);
        if(bt.right!=null)sumRootNode(bt.right,target);
        if(bt.left==null && bt.right==null){
            System.out.println(bt.data+" "+target);
        }
    }

    public static void levelRootNode(Tree bt,int level){
        level = level + 1;
        System.out.println(bt.data + " "+level);
        if(bt.left!=null)levelRootNode(bt.left,level);
        if(bt.right!=null)levelRootNode(bt.right,level);
    }
    public static Result height1(Tree bt){
        if(bt == null)
            return new Result(null,0);
        Result leftNode = height1(bt.left);
        Result rightNode = height1(bt.right);
        if(rightNode.dist < leftNode.dist){
            return new Result(leftNode.node,leftNode.dist+1);
        }
        if(rightNode.dist > leftNode.dist){
            return new Result(rightNode.node,rightNode.dist+1);
        }
        return new Result(bt,leftNode.dist + 1);
    }

    public static void verticalNode(Tree bt,Value val,List<List<Integer>> list){
        findverticalMinMax(bt,val,0);
        System.out.println(val.min+" "+val.max);
        for(int i=val.min;i<=val.max;i++) {
            List<Integer>temp = new LinkedList();
            printVerticalNode(bt, i, 0,temp);
            System.out.println();
            list.add(temp);
        }
    }

    public static void findverticalMinMax(Tree bt,Value val,int hd){
        if(bt==null)
            return;
        if(hd<val.min)
            val.min = hd;
        else if(hd >val.max)
            val.max = hd;
        findverticalMinMax(bt.left,val,hd-1);
        findverticalMinMax(bt.right,val,hd+1);
    }

    public static void printVerticalNode(Tree bt,int i,int hd,List<Integer>temp){
        if (bt == null)
            return;
        if(i==hd) {
            System.out.print(bt.data + " ");
            temp.add(bt.data);
        }
        printVerticalNode(bt.left,i,hd-1,temp);
        printVerticalNode(bt.right,i,hd+1,temp);
    }

    public static boolean isValidBST(Tree root) {
        if(root == null)
            return true;
        return ishelpValidBST(root,null,null);
    }
    public static boolean ishelpValidBST(Tree root, Integer min, Integer max) {
        boolean ans = true;
        if ((min != null) && (root.data <= min))
            return false;
        if ((max != null) && (max <= root.data))
            return false;
        if (root.left != null)
            if (root.data > root.left.data) {
            ans  = ishelpValidBST(root.left, min, root.data);
            if(ans==false)
                return false;
            } else
                return false;

        if (root.right != null)
            if (root.data < root.right.data) {
            ans = ishelpValidBST(root.right, root.data, max);
                if(ans==false)
                    return false;
            } else
                return false;
        return ans;
    }


}
