package DSA.Trie;
// prefix tree

class Node {

    Node links[] = new Node[26];
    boolean flag = false;

    public Node() {

    }

    boolean containskey(char ch) {
        return (links[ch - 'a'] != null);
    }

    Node getElement(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }

}

class Trie {

    private static Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containskey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.getElement(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containskey(word.charAt(i))){
                return false;
            }
            node=node.getElement(word.charAt(i));
        }
        return node.isEnd();
    }
    
    public boolean startswith(String prefix){
        Node node=root;
        for(int i=0;i<prefix.length();i++){
            if(!node.containskey(prefix.charAt(i))){
                return false;
            }
            node=node.getElement(prefix.charAt(i));
        }
        return true;
    }
}

public class Trie1 {

    public static void main(String[] args) {
        Trie tr=new Trie();

        tr.insert("janaki");
        tr.insert("ramayya");
        boolean as=tr.search("rama");
        boolean ans=tr.startswith("jan");
        System.out.println(as);
        System.out.println(ans);

    }
}
