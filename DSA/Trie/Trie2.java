package DSA.Trie;

class Node {

    Node links[] = new Node[26];
    int cntEndswith = 0;
    int cntprefix = 0;

    public Node() {

    }

    boolean containskey(char ch) {
        return (links[ch - 'a'] != null);
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    void increaseEnd() {
        cntEndswith++;
    }

    void increaseprefix() {
        cntprefix++;
    }

    void deleteEnd() {
        cntEndswith--;
    }

    void reduceprefix() {
        cntprefix--;
    }

    int getEnd() {
        return cntEndswith;
    }

    int getprefix() {
        return cntprefix;
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
            node.increaseprefix();
        }
        node.increaseEnd();
    }

    public void erase(String word) {
        if (countwordsequal(word) == 0) {
            return;
        }
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.containskey(word.charAt(i))) {
                node = node.get(word.charAt(i));
                node.reduceprefix();
            }
        }
        node.deleteEnd();
    }

    public int countwordsequal(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.containskey(word.charAt(i))) {
                node = node.get(word.charAt(i));
            } else {
                return 0;
            }

        }
        return node.getEnd();

    }

    public int countstartswith(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.containskey(prefix.charAt(i))) {
                node = node.get(prefix.charAt(i));
            } else {
                return 0;
            }

        }
        return node.getprefix();
    }
}

public class Trie2 {

    public static void main(String[] args) {
        Trie tr = new Trie();
        tr.insert("janaki");
        tr.insert("jana");
        tr.insert("trump");
        tr.erase("trump");
        int cnt1 = tr.countstartswith("jan");
        int cnt2 = tr.countwordsequal("janaki");

        int cnt3 = tr.countstartswith("trump");
        int cnt4 = tr.countwordsequal("tr");

        System.out.println(cnt1);
        System.out.println(cnt2);
        System.out.println(cnt3);
        System.out.println(cnt4);

    }
}
