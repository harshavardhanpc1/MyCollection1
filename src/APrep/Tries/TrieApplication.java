package APrep.Tries;

import java.util.List;

/**
 * Created by intelliswift on 1/20/19.
 */
public class TrieApplication {
    public static void main(String[]args){
        Node trie = new Node(' ');
        trie.insert("india",trie);
        trie.insert("harsha",trie);
        trie.insert("harsinya",trie);
        trie.insert("harsina",trie);
        trie.insert("ind",trie);
        System.out.println(trie.search("ind",trie));
        List<String>list = trie.autocomplete("har",trie);
        for(String w:list){
            System.out.println(w);
        }
    }
}
