package APrep.Tries;

import java.util.*;

/**
 * Created by intelliswift on 1/20/19.
 */
public class Node {
    char c;
    Node parent;
    HashMap<Character, Node> children = new LinkedHashMap();

    public Node(char c) {
        this.c = c;
    }

    boolean isEnd;

    public void insert(String word, Node root) {
        Node cur = root;
        Node pre;
        for (char c : word.toCharArray()) {
            if (cur.children.get(c) == null) {
                pre = cur;
                //  cur.children.putIfAbsent(c,new Node(c));
                cur.children.put(c, new Node(c));
                cur = cur.children.get(c);
                cur.parent = pre;
            } else
                cur = cur.children.get(c);
        }
        cur.isEnd = true;
    }

    public boolean search(String word, Node root) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children.get(c) == null) {
                return false;
            } else
                curr = curr.children.get(c);
        }
        if (curr.isEnd == true) {
            return true;
        }
        return false;
    }

    public List autocomplete(String pre, Node root) {
        Node lastNode = root;
        for (char c : pre.toCharArray()) {
            lastNode = lastNode.children.get(c);
            if (lastNode == null)
                return new ArrayList();
        }
        return lastNode.getWords();
    }

    public List getWords() {
        List list = new ArrayList();
        if (isEnd) {
            list.add(convertString());
        }
        System.out.println(convertString());
        if (children.entrySet() != null) {
            for (Map.Entry p : children.entrySet()) {
                System.out.println(children.entrySet());
                list.addAll(children.get(p.getKey()).getWords());
            }
        }
        return list;
    }
//good trick
    public String convertString(){
        if(parent == null){
            return "";
        } else {
            return parent.convertString() + new String(new char[]{c});
        }
    }

}
