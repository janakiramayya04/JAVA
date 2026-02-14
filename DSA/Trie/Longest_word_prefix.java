package DSA.Trie;

class Node {

    Node links[] = new Node[26];
    boolean flag = false;

    public Node() {

    }

    public boolean containskey(char ch) {
        return (links[ch - 'a'] != null);
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    boolean isEnd() {
        return flag;
    }

    void setEnd() {
        flag = true;
    }

}

class Trie {

    private final Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.containskey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    boolean checkifPrefixExists(String word) {
        Node node = root;
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if (node.containskey(word.charAt(i))) {
                node = node.get(word.charAt(i));
                flag = flag & node.isEnd();
            } else {
                return false;
            }
        }

        return flag;
    }
}

public class Longest_word_prefix {

    public static void main(String[] args) {
        Trie tr = new Trie();
        tr.insert("j");
        tr.insert("ja");
        tr.insert("jan");
        tr.insert("jana");
        tr.insert("janak");
        tr.insert("janaki");

        System.out.println(tr.checkifPrefixExists("janaki"));
    }
}
