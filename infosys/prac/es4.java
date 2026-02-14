package infosys.prac;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        data=key;
        left=null;
        right=null;
    }
}
class es4{
    static int countleaves(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countleaves(root.left)+countleaves(root.right);
    }
    static int height(Node root){
        if(root==null) return 0;
        // if(root.left==null && root.right==null) return 1;
        return 1+Math.max(height(root.left),height(root.right));
    }
    static int countnodes(Node root){
        if(root==null) return 0;
        return 1+countnodes(root.left)+countnodes(root.right);
    }
    static int sumOfNodes(Node root){
        if(root==null) return 0;
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);

        System.out.println(countleaves(root));
        System.out.println(height(root));
        System.out.println(countnodes(root));
        System.out.println(sumOfNodes(root));
    }
}